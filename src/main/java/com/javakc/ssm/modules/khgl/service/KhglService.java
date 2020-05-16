package com.javakc.ssm.modules.khgl.service;

import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.khgl.dao.KhglDao;
import com.javakc.ssm.modules.khgl.entity.KhglEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 客户管理逻辑层
 */
@Service
public class KhglService extends BaseService<KhglDao, KhglEntity> {
    @Autowired
    public KhglDao khglDao;
}
