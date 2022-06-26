package com.jim.kkcd.controller;

import com.jim.kkcd.entity.AdminLoginParam;
import com.jim.kkcd.entity.RespBean;
import com.jim.kkcd.service.IAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Jim
 * @Description 登录接口
 * @createTime 2022年06月26日
 */
@RestController
@Api(tags="登录接口")
public class LoginController {

    @Autowired
    private IAdminService adminService;


    @ApiOperation(value="登录后返回 token")
    @PostMapping("/login")
    public RespBean login(AdminLoginParam adminLoginParam, HttpServletRequest request){
        return adminService.login(adminLoginParam.getUsername(),adminLoginParam.getPassword(),request);
    }

    @ApiOperation(value="退出登录")
    @PostMapping("/logout")
    public RespBean logout(){
        return RespBean.success("注销成功！");
    }
}

