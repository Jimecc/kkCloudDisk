package com.jim.kkcd.controller;


import com.jim.kkcd.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jim
 * @since 2022-06-26
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private IAdminService adminService;

    @GetMapping("/text")
    public String getAdminByKey(){
        System.out.println(adminService.getAdminById(1).toString());
        return adminService.getAdminById(1).toString();

    }

}
