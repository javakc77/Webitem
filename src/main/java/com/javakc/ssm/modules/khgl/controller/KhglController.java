package com.javakc.ssm.modules.khgl.controller;

import com.javakc.ssm.modules.khgl.service.KhglService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 客户管理表现层
 */
@Controller
@RequestMapping("khgl")
public class KhglController {
    @Autowired
    public KhglService khglService;
}
