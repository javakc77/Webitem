package com.javakc.ssm.modules.cysgl.controller;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.base.util.CommonUtil;
import com.javakc.ssm.modules.cysgl.entity.CysglEntity;
import com.javakc.ssm.modules.cysgl.service.CysglService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 测试-表现层
 */
@Controller
@RequestMapping("Cysgl")
public class CysglController {
    @Autowired
    public CysglService cysglService;

}
