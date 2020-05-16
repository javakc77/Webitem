package com.javakc.ssm.modules.cpgl.service;

import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.cpgl.dao.CpglDao;
import com.javakc.ssm.modules.cpgl.entity.CpglEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 成品管理逻辑层
 */
@Service
public class CpglService extends BaseService<CpglDao, CpglEntity> {
    @Autowired
    public CpglDao cpglDao;
}
