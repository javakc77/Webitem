package com.javakc.ssm.modules.project.service;

import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.project.dao.ProjectDao;
import com.javakc.ssm.modules.project.entity.ProjectEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 产品管理逻辑层
 */
@Service
public class ProjectService extends BaseService<ProjectDao, ProjectEntity> {
    @Autowired
    public ProjectDao projectDao;


}
