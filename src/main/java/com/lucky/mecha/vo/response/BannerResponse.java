package com.lucky.mecha.vo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User: lucky
 * Date: 2019/5/26
 * Time: 14:04
 * Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BannerResponse {
    private Long id;
    private String urlCn;
    private String urlEn;
    private Integer type;
}
