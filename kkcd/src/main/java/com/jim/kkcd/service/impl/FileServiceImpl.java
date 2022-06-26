package com.jim.kkcd.service.impl;

import com.jim.kkcd.entity.File;
import com.jim.kkcd.mapper.FileMapper;
import com.jim.kkcd.service.IFileService;
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
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements IFileService {

}
