package com.javakc.ssm.modules.cysgl.service;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.cysgl.dao.CysglDao;
import com.javakc.ssm.modules.cysgl.entity.CysglEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CysglService extends BaseService<CysglDao, CysglEntity> {
    @Autowired
    public CysglDao cysglDao;

    /**
     * 根据条件进行分页查询-测试管理数据
     * @param cysglEntity
     * @param page 包含页面传到后台的所有参数，当前页，当前页需要展示的条数
     * @return
     */
    public Page<CysglEntity> queryCysgl(CysglEntity cysglEntity, Page<CysglEntity> page){
//      设置页码参数信息，testEntity包含，所有的查询条件的数据，还有分页信息的数据，mybatis进行自动分页
        cysglEntity.setPage(page);
//      调用dao方法，进行数据库数据查询
        page.setList(cysglDao.findList(cysglEntity));
        return page;
    }
}
