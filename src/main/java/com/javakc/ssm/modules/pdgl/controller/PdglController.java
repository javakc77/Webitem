package com.javakc.ssm.modules.pdgl.controller;

import com.javakc.ssm.modules.pdgl.service.PdglService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 盘点管理表现层
 */
@Controller
@RequestMapping("pdgl")
public class PdglController {
    @Autowired
    public PdglService pdglService;
}
