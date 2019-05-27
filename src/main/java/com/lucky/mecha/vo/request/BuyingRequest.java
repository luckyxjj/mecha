package com.lucky.mecha.vo.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 13:35
 * Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BuyingRequest {
    private String contact;

    public boolean validate(){
        return !StringUtils.isEmpty(this.contact);
    }
}
