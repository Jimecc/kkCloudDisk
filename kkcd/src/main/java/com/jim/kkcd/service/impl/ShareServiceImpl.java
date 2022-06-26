package com.jim.kkcd.service.impl;

import com.jim.kkcd.entity.Share;
import com.jim.kkcd.mapper.ShareMapper;
import com.jim.kkcd.service.IShareService;
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
public class ShareServiceImpl extends ServiceImpl<ShareMapper, Share> implements IShareService {

}
