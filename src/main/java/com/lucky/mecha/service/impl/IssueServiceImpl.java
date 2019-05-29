package com.lucky.mecha.service.impl;

import com.github.pagehelper.PageInfo;
import com.lucky.mecha.Constant.Constants;
import com.lucky.mecha.dao.IssueRepository;
import com.lucky.mecha.entity.Buying;
import com.lucky.mecha.entity.Issue;
import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.service.IssueService;
import com.lucky.mecha.utils.CommonUtils;
import com.lucky.mecha.vo.Pager;
import com.lucky.mecha.vo.request.IssueRequest;
import com.lucky.mecha.vo.response.IssueResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @Override
    public Pager<Issue> findAllBk(Pager pager) {
        List<Issue> issues = new ArrayList<>();
        if (!StringUtils.isEmpty(pager.getCondition())){
            issues = issueRepository.findByLinkmanOrPhoneLike(pager.getCondition()+"%",pager.getCondition()+"%");
        }else {
            issues = issueRepository.findAll();
        }
        if (issues.size()>0){
            PageInfo<Issue> info = new PageInfo<>(issues);
            pager.setRows(info.getList());
            pager.setTotal((int)info.getTotal());
        }else {
            pager.setRows(issues);
            pager.setTotal(0);
        }
        return pager;
    }
}
