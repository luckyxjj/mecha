package com.lucky.mecha.service;

import com.lucky.mecha.entity.Issue;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.request.IssueRequest;
import com.lucky.mecha.vo.response.IssueResponse;

public interface IssueService {
    IssueResponse submit(IssueRequest request) throws MechaException;

    Pager<Issue> findAllBk(Pager pager);
}
