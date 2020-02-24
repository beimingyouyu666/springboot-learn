package com.yangk.springbootswagger.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description 实体类
 * @Author yangkun
 * @Date 2020/2/24
 * @Version 1.0
 * @blame yangkun
 */
@ApiModel
@Data
public class User {
    @ApiModelProperty(value = "用户id")
    private Integer id;
    @ApiModelProperty(value = "用户名")
    private String username;
    @ApiModelProperty(value = "用户地址")
    private String address;
}

