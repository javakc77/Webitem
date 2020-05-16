package com.javakc.ssm.modules.bzgl.controller;

import com.javakc.ssm.modules.bzcl.service.BzclService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 包装管理表现层
 */
@Controller
@RequestMapping("bzgl")
public class BzglController {
    @Autowired
    public BzclService bzclService;
}
