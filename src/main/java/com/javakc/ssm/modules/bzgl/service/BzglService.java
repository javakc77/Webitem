package com.javakc.ssm.modules.bzgl.service;

import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.bzgl.dao.BzglDao;
import com.javakc.ssm.modules.bzgl.entity.BzglEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 包装管理逻辑层
 */
@Service
public class BzglService extends BaseService<BzglDao, BzglEntity> {
    @Autowired
    public BzglDao bzglDao;
}
