package com.javakc.ssm.modules.cysgl.service;

import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.cysgl.dao.CysglDao;
import com.javakc.ssm.modules.cysgl.entity.CysglEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 承运商管理逻辑层
 */
@Service
public class CysglService extends BaseService<CysglDao, CysglEntity> {
    @Autowired
    public CysglDao cysglDao;
}
