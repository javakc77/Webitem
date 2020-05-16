package com.javakc.ssm.modules.bsgl.service;

import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.bsgl.dao.BsglDao;
import com.javakc.ssm.modules.bsgl.entity.BsglEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 报损管理逻辑层
 */
@Service
public class BsglService extends BaseService<BsglDao, BsglEntity> {
    @Autowired
    public BsglDao bsglDao;
}
