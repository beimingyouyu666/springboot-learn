package com.yangk.springbootmutildatasource.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.lang.Nullable;

/**
 * @Description
 * @Author yangkun
 * @Date 2020/7/29
 * @Version 1.0
 * @blame yangkun
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Nullable
    @Override
    protected Object determineCurrentLookupKey() {
        return DSContextHolder.get();
    }

}
