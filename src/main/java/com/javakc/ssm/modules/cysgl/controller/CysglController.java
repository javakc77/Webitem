package com.javakc.ssm.modules.cysgl.controller;

import com.javakc.ssm.modules.cysgl.service.CysglService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 承运商管理表现层
 */
@Controller
@RequestMapping("cysgl")
public class CysglController {
    @Autowired
    public CysglService cysglService;
}
