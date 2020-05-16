package com.javakc.ssm.modules.cggl.service;

import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.cggl.dao.CgglDao;
import com.javakc.ssm.modules.cggl.entity.CgglEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 采购管理逻辑层
 */
@Service
public class CgglService extends BaseService<CgglDao, CgglEntity> {
    @Autowired
    public CgglDao cgglDao;
}
