package com.javakc.ssm.modules.pdgl.service;

import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.pdgl.dao.PdglDao;
import com.javakc.ssm.modules.pdgl.entity.PdglEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 盘点管理逻辑层
 */
@Service
public class PdglService extends BaseService<PdglDao, PdglEntity> {
    @Autowired
    public PdglDao pdglDao;
}
