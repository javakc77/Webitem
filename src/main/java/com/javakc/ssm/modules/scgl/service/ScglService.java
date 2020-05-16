package com.javakc.ssm.modules.scgl.service;

import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.scgl.dao.ScglDao;
import com.javakc.ssm.modules.scgl.entity.ScglEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 生产管理逻辑层
 */
@Service
public class ScglService extends BaseService<ScglDao, ScglEntity> {
    @Autowired
    public ScglDao scglDao;
}
