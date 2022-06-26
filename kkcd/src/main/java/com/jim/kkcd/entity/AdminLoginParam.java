package com.jim.kkcd.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author Jim
 * @Description 用户登录实体类
 * @createTime 2022年06月26日
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Accessors(chain=true)
@ApiModel(value="AdminLogin 登录对象")
public class AdminLoginParam {
    @ApiModelProperty(value="用户名",required=true)
    private String username;
    @ApiModelProperty(value="密码",required=true)
    private String password;

}
