package com.javakc.ssm.modules.xsgl.controller;

import com.javakc.ssm.modules.xsgl.service.XsglService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 销售管理表现层
 */
@Controller
@RequestMapping("xsgl")
public class XsglController {
    @Autowired
    public XsglService xsglService;
}
