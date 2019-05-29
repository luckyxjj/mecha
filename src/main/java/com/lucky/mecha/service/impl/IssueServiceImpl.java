package com.lucky.mecha.service.impl;

import com.lucky.mecha.Constant.Constants;
import com.lucky.mecha.dao.IssueRepository;
import com.lucky.mecha.entity.Issue;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.IssueService;
import com.lucky.mecha.utils.CommonUtils;
import com.lucky.mecha.vo.request.IssueRequest;
import com.lucky.mecha.vo.response.IssueResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 17:35
 * Description:
 */
@Service
public class IssueServiceImpl implements IssueService {
    private final IssueRepository issueRepository;

    public IssueServiceImpl(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    @Override
    public IssueResponse submit(IssueRequest request) throws MechaException {

        Issue issue = new Issue();
        BeanUtils.copyProperties(request,issue);
        Date deliveryTime = CommonUtils.parseStringToDate(request.getDeliveryTime());
        issue.setDeliveryTime(deliveryTime);
        issue.setStatus(0);
        Issue result = issueRepository.save(issue);
        return new IssueResponse(result.getId());
    }
}
