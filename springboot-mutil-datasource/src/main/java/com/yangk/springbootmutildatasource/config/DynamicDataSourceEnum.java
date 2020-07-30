package com.yangk.springbootmutildatasource.config;

import lombok.Getter;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2020/7/30
 * @Version 1.0
 */
@Getter
public enum DynamicDataSourceEnum {
    MASTER("master"),
    SLAVE("slave");
    private String dataSourceName;
    DynamicDataSourceEnum(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }
}
