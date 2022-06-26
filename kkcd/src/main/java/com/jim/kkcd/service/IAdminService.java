package com.jim.kkcd.service;

import com.jim.kkcd.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jim.kkcd.entity.RespBean;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jim
 * @since 2022-06-26
 */
public interface IAdminService extends IService<Admin> {
    public Admin getAdminById(int id);
    
    /**
     * @Author: Jim
     * @Description: 登陆之后返回 token
     * @param username
     * @param password
     * @param request
     */
    RespBean login(String username, String password, HttpServletRequest request);
}
