package com.javakc.ssm.modules.cggl.controller;

import com.javakc.ssm.modules.cggl.service.CgglService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 采购管理表现层
 */
@Controller
@RequestMapping("cggl")
public class CgglController {
    @Autowired
    public CgglService cgglService;
}
