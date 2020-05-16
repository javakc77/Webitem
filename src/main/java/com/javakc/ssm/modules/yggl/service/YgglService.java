package com.javakc.ssm.modules.yggl.service;

import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.yggl.dao.YgglDao;
import com.javakc.ssm.modules.yggl.entity.YgglEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 员工管理逻辑层
 */
@Service
public class YgglService extends BaseService<YgglDao, YgglEntity> {
    @Autowired
    public YgglDao ygglDao;
}
