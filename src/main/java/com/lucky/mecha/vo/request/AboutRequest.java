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
public class AboutRequest {
    private Long id;
    private String content;
    private Integer type;
    private Integer deleteFlag;

    public boolean getValidate() {
        return null != type;
    }

    public boolean updateValidate() {
        return null != id
                && !StringUtils.isEmpty(content);
    }
}
