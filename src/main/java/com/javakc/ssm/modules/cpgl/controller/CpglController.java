package com.javakc.ssm.modules.cpgl.controller;

import com.javakc.ssm.modules.cpgl.service.CpglService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 成品管理表现层
 */
@Controller
@RequestMapping("cpgl")
public class CpglController {
    @Autowired
    public CpglService cpglService;
}
