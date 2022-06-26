package com.jim.kkcd.service.impl;

import com.jim.kkcd.entity.Admin;
import com.jim.kkcd.mapper.AdminMapper;
import com.jim.kkcd.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jim
 * @since 2022-06-26
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
