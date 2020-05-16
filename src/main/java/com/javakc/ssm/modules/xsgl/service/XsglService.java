package com.javakc.ssm.modules.xsgl.service;

import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.xsgl.dao.XsglDao;
import com.javakc.ssm.modules.xsgl.entity.XsglEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 销售管理逻辑层
 */
@Service
public class XsglService extends BaseService<XsglDao, XsglEntity> {

    @Autowired
    public XsglDao xsglDao;
}
