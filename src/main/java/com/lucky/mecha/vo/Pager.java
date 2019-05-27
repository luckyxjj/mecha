package com.lucky.mecha.vo;


import lombok.Data;

import java.util.List;

@Data
public class Pager<T> {

    private List rows;
    private String condition;
    private Integer limit=10;
    private Integer offset=0;
    private Integer isUsing;
    private Integer type;
    private String startTime;
    private String endTime;
    private int total;

}
