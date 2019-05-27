package com.lucky.mecha.service;

import com.lucky.mecha.entity.Admin;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.vo.request.AdminRequest;

public interface AdminService {
    Admin login(AdminRequest request) throws MechaException;
}
