package com.javakc.ssm.modules.scgl.controller;

import com.javakc.ssm.modules.scgl.service.ScglService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 生产管理表现层
 */
@Controller
@RequestMapping("scgl")
public class ScglController {
    @Autowired
    public ScglService scglService;
}
