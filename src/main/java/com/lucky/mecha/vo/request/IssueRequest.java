package com.lucky.mecha.vo.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.Date;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 13:35
 * Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IssueRequest {
    private String categoryName;
    private String brandName;
    private String unitType;
    private String province;
    private String city;
    private String district;
    //    private String address;
    private BigDecimal expectedPrice;
    private String deliveryTime;
    private String imgUrl;
    private String linkman;
    private Integer sex;
    private String phone;
    private String mail;
    private String wechat;
    private String usingExperience;

    public boolean validate() {
        return !StringUtils.isEmpty(categoryName)
                && !StringUtils.isEmpty(brandName)
                && !StringUtils.isEmpty(unitType)
                && !StringUtils.isEmpty(province)
                && !StringUtils.isEmpty(city)
                && !StringUtils.isEmpty(district)
                && null != expectedPrice
                && !StringUtils.isEmpty(deliveryTime)
//                && !StringUtils.isEmpty(imgUrl)
                && !StringUtils.isEmpty(linkman)
                && null != sex
                && !StringUtils.isEmpty(phone)
                && !StringUtils.isEmpty(mail)
                && !StringUtils.isEmpty(wechat)
                && !StringUtils.isEmpty(usingExperience);
    }
}
