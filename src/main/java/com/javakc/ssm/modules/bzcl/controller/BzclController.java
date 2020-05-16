package com.javakc.ssm.modules.bzcl.controller;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.modules.bzcl.entity.BzclEntity;
import com.javakc.ssm.modules.bzcl.service.BzclService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 包装材料表现层
 */
@Controller
@RequestMapping("bzgl")
public class BzclController {
    @Autowired
    public BzclService bzclService;

    /**
     * 根据条件进行分页查询-包装材料数据
     * @param bzclEntity
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("queryBzcl")
    public ModelAndView queryTest(BzclEntity bzclEntity, HttpServletRequest request, HttpServletResponse response){
//      调用逻辑层的方法，进行分页查询
    Page<BzclEntity> page = bzclService.queryBzcl(bzclEntity,new Page<>(request, response));
//      把page传到前台页面当中
    ModelAndView modelAndView = new ModelAndView("bzcl/list");
    modelAndView.addObject("page",page);
    return modelAndView;
    }

}
