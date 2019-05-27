package com.lucky.mecha.service.impl;

import com.lucky.mecha.Constant.Constants;
import com.lucky.mecha.dao.AdminRepository;
import com.lucky.mecha.entity.Admin;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.AdminService;
import com.lucky.mecha.utils.CommonUtils;
import com.lucky.mecha.vo.request.AdminRequest;
import com.lucky.mecha.vo.response.AdminResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 19:39
 * Description:
 */
@Service
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin login(AdminRequest request) throws MechaException {
        if (!request.loginValidate()){
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        String md5Pwd = CommonUtils.getMd5(request.getPassword());
        return adminRepository.findByUsernameAndPassword(request.getUsername(), md5Pwd);
    }
}
