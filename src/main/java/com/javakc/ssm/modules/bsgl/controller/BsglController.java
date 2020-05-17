package com.javakc.ssm.modules.bsgl.controller;

import com.javakc.ssm.modules.bsgl.service.BsglService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 报损管理表现层
 * push测试
 */
@Controller
@RequestMapping("bsgl")
public class BsglController {
    @Autowired
    public BsglService bsglService;
}
