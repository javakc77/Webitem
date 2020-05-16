package com.javakc.ssm.modules.test.service;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.test.dao.TestDao;
import com.javakc.ssm.modules.test.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService extends BaseService<TestDao, TestEntity> {
    @Autowired
    public TestDao testDao;

    /**
     * 根据条件进行分页查询-测试管理数据
     * @param testEntity
     * @param page 包含页面传到后台的所有参数，当前页，当前页需要展示的条数
     * @return
     */
    public Page<TestEntity> queryTest(TestEntity testEntity, Page<TestEntity> page){
//      设置页码参数信息，testEntity包含，所有的查询条件的数据，还有分页信息的数据，mybatis进行自动分页
        testEntity.setPage(page);
//      调用dao方法，进行数据库数据查询
        page.setList(testDao.findList(testEntity));
        return page;
    }
}
