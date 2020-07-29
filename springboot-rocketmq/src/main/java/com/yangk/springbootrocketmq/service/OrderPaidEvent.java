package com.yangk.springbootrocketmq.service;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2020/3/3
 * @Version 1.0
 * @blame yangkun
 */
@Data
@AllArgsConstructor
public class OrderPaidEvent implements Serializable {

    private String orderId;

    private BigDecimal paidMoney;

}

