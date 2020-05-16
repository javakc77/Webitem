package com.javakc.ssm.modules.bzcl.service;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.bzcl.dao.BzclDao;
import com.javakc.ssm.modules.bzcl.entity.BzclEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 包装材料逻辑层
 */
@Service
public class BzclService extends BaseService<BzclDao, BzclEntity> {
    @Autowired
    public BzclDao bzclDao;

    /**
     * 根据条件进行分页查询-包装材料数据
     * @param bzclEntity
     * @param page
     * @return
     */
    public Page<BzclEntity> queryBzcl(BzclEntity bzclEntity, Page<BzclEntity> page){
        //设置页码参数信息，bzclEntity包含所有的查询条件的数据，还有分页信息的数据，mybatis进行自动分页
        bzclEntity.setPage(page);
        //调用dao方法，进行数据库数据查询
        page.setList(bzclDao.findList(bzclEntity));
        return page;
    }
}
