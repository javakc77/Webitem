package com.javakc.ssm.modules.yggl.controller;

import com.javakc.ssm.modules.yggl.service.YgglService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 员工管理表现层
 */
@Controller
@RequestMapping("yggl")
public class YgglController {
    @Autowired
    public YgglService ygglService;
}
