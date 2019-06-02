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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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
        BeanUtils.copyProperties(request, issue);
        Date deliveryTime = CommonUtils.parseStringToDate(request.getDeliveryTime());
        issue.setDeliveryTime(deliveryTime);
        issue.setStatus(0);
        issue.setDeleteFlag(1);
        Issue result = issueRepository.save(issue);
        return new IssueResponse(result.getId());
    }

    @Override
    public Pager<Issue> findAllBk(Pager pager) {
        Sort sort = Sort.by(Sort.Direction.DESC,"id");
        PageRequest pageRequest = PageRequest.of(pager.getOffset() / pager.getLimit(), pager.getLimit(),sort);
        Page<Issue> buyingPage = null;
        if (!StringUtils.isEmpty(pager.getCondition())) {
            buyingPage = issueRepository.findByDeleteFlagAndLinkmanLikeOrPhoneLike(1, pager.getCondition() + "%", pager.getCondition() + "%", pageRequest);
        } else {
            buyingPage = issueRepository.findAllByDeleteFlag(1, pageRequest);
        }
        List<Issue> issueList = buyingPage.getContent();
        for (Issue issue : issueList) {
            issue.setProvince(issue.getProvince() + " " + issue.getCity() + " " + issue.getDistrict());
        }
        pager.setRows(issueList);
        pager.setTotal((int) buyingPage.getTotalElements());
        return pager;
    }

    @Override
    public String delete(Long id) throws MechaException {
        Optional<Issue> issueOptional = issueRepository.findById(id);
        if (!issueOptional.isPresent()) {
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        Issue buying = issueOptional.get();
        buying.setDeleteFlag(0);
        issueRepository.save(buying);
        return "ok";
    }

    @Override
    public IssueResponse update(Issue request) throws MechaException {
        if (null == request.getId()) {
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        Optional<Issue> issueOptional = issueRepository.findById(request.getId());
        if (!issueOptional.isPresent()) {
            throw new MechaException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        Issue issue = issueOptional.get();
        issue.setFlag(request.getFlag());
        Issue save = issueRepository.save(issue);
        return new IssueResponse();
    }
}
