package com.lucky.mecha.service;

import com.lucky.mecha.entity.About;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.request.AboutRequest;
import com.lucky.mecha.vo.response.AboutResponse;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 10:06
 * Description:
 */
public interface AboutService {
    AboutResponse findLastOne(AboutRequest request) throws MechaException;

    Pager<About> findAllBk(Pager pager);

    About updateBk(AboutRequest request) throws MechaException;
}
