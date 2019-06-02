package com.lucky.mecha.service.impl;

import com.lucky.mecha.Constant.Constants;
import com.lucky.mecha.dao.AdminRepository;
import com.lucky.mecha.entity.Admin;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.AdminService;
import com.lucky.mecha.utils.CommonUtils;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.request.AdminRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
        return adminRepository.findByUsernameAndPasswordAndDeleteFlag(request.getUsername(), md5Pwd,1);
    }

    @Override
    public Pager<Admin> findAllBk(Pager pager) {
        PageRequest pageRequest = PageRequest.of(pager.getOffset()/pager.getLimit(), pager.getLimit());
        Page<Admin> adminPage = adminRepository.findAll(pageRequest);
        pager.setRows(adminPage.getContent());
        pager.setTotal((int)adminPage.getTotalElements());
        return pager;
    }

    @Override
    public Admin add(Admin request) throws MechaException {
        if (StringUtils.isEmpty(request.getUsername())||StringUtils.isEmpty(request.getPassword())){
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        //查询是否存在相同的用户名
        Admin findUser = adminRepository.findByUsername(request.getUsername());
        if (null!=findUser){
            throw new MechaException(Constants.ErrorMsg.SAME_USER_EXIT);
        }
        String md5Pwd = CommonUtils.getMd5(request.getPassword());
        request.setPassword(md5Pwd);
        return adminRepository.save(request);
    }

    @Override
    public Admin update(Admin request) throws MechaException {
        Optional<Admin> adminOptional = adminRepository.findById(request.getId());
        if (!adminOptional.isPresent()){
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        String md5Pwd = CommonUtils.getMd5(request.getPassword());
        Admin admin = adminOptional.get();
        admin.setDeleteFlag(request.getDeleteFlag());
        admin.setPassword(md5Pwd);
        return adminRepository.save(admin);
    }

    @Override
    public String delete(Long id) {
        adminRepository.deleteById(id);
        return "yes";
    }
}
