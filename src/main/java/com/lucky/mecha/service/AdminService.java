package com.lucky.mecha.service;

import com.lucky.mecha.entity.Admin;
import com.lucky.mecha.entity.Category;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.request.AdminRequest;

public interface AdminService {
    Admin login(AdminRequest request) throws MechaException;

    Pager<Admin> findAllBk(Pager pager);

    Admin add(Admin request) throws MechaException;

    Admin update(Admin request) throws MechaException;

    String delete(Long id);
}
