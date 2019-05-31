package com.lucky.mecha.controller.admin;

import com.lucky.mecha.Constant.Constants;
import com.lucky.mecha.entity.Admin;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.AdminService;
import com.lucky.mecha.vo.request.AdminRequest;
import com.lucky.mecha.vo.response.AdminResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 19:50
 * Description:
 */
@RestController
@RequestMapping("/adminBk")
public class AdminControllerBk {
    private final AdminService adminService;

    public AdminControllerBk(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/login")
    public AdminResponse login(AdminRequest request, HttpSession session) throws MechaException {
        Admin admin = adminService.login(request);
        if (admin==null){
            throw new MechaException(Constants.ErrorMsg.USERNAME_OR_PASSWORD_ERROR);
        }
        session.setAttribute("id_bk", admin.getId());
        session.setAttribute("name_bk", request.getUsername());
        session.setMaxInactiveInterval(7200);
        return new AdminResponse("SUCCESS");
    }

    /**
     * 用户注销
     *
     * @param session
     * @return
     */
    @GetMapping(value = "/logout")
    public void logout(HttpSession session) {
        session.removeAttribute("id_bk");
        session.removeAttribute("name_bk");
    }

    /**
     * 登录验证
     *
     * @param session
     * @return
     */
    @GetMapping(value = "/checkLoginBack")
    public AdminResponse checkLoginBack(HttpSession session) throws MechaException {
        if (session.getAttribute("id_bk") == null) {
            throw new MechaException(Constants.ErrorMsg.NOT_LOGIN);
        }
        return new AdminResponse();
    }
}
