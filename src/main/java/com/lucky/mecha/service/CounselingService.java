package com.lucky.mecha.service;

import com.lucky.mecha.entity.Counseling;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.request.CounselingRequest;
import com.lucky.mecha.vo.response.CounselingResponse;

public interface CounselingService {
    CounselingResponse findLastOne(CounselingRequest request) throws MechaException;

    Pager<Counseling> findAllBk(Pager pager);

    Counseling updateBk(CounselingRequest request) throws MechaException;
}
