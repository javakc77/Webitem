package com.javakc.ssm.modules.yggl.service;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.yggl.dao.YgglDao;
import com.javakc.ssm.modules.yggl.entity.YgglEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 员工管理逻辑层
 */
@Service
public class YgglService extends BaseService<YgglDao, YgglEntity> {
    @Autowired
    public YgglDao ygglDao;

    /**
     *
     * @param ygglEntity
     * @param page
     * @return
     */
    public Page<YgglEntity> queryTest(YgglEntity ygglEntity,Page<YgglEntity> page){
        ygglEntity.setPage(page);
        page.setList(ygglDao.findList(ygglEntity)) ;
        return page;
    }

    /**
     * 得到所有数据记录的总数
     * @return
     */
    public Integer queryCount(){
        return ygglDao.queryCount();
    }

    @Transactional(readOnly = false)
    public void save(YgglEntity ygglEntity){
        ygglDao.insert(ygglEntity);
    }


}
