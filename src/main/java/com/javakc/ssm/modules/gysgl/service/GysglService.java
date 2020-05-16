package com.javakc.ssm.modules.gysgl.service;

import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.gysgl.dao.GysglDao;
import com.javakc.ssm.modules.gysgl.entity.GysglEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 供应商管理逻辑层
 */
@Service
public class GysglService extends BaseService<GysglDao, GysglEntity> {
    @Autowired
    public GysglDao gysglDao;
}
