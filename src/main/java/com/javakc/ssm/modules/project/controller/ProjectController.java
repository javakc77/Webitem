package com.javakc.ssm.modules.project.controller;


import com.javakc.ssm.modules.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 产品管理表现层
 */
@Controller
@RequestMapping("project")
public class ProjectController {
    @Autowired
    public ProjectService projectService;



}
