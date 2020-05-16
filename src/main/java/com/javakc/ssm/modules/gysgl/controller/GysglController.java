package com.javakc.ssm.modules.gysgl.controller;

import com.javakc.ssm.modules.gysgl.service.GysglService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 供应商管理表现层
 */
@Controller
@RequestMapping("gysgl")
public class GysglController {
    @Autowired
    public GysglService gysglService;
}
