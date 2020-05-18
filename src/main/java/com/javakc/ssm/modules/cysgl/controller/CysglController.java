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

    /**
     * 根据条件进行分页查询-测试管理数据
     * @param cysglEntity
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("queryCysgl")
    public ModelAndView queryCysgl(CysglEntity cysglEntity, HttpServletRequest request, HttpServletResponse response){
//      调用逻辑层的方法，进行分页查询
        Page<CysglEntity> page = cysglService.queryCysgl(cysglEntity, new Page<>(request, response));
//      把page传到前台页面当中
        ModelAndView modelAndView = new ModelAndView("cysgl/list");
        modelAndView.addObject("page", page);
        return modelAndView;
    }

    @RequestMapping("create")
    public String create(CysglEntity cysglEntity){
//        id
        cysglEntity.setId(CommonUtil.uuid());
        cysglService.save(cysglEntity);
        return "redirect:queryCysgl.do";
    }

    @RequestMapping("view")
    public String view(String ids, Map<String, Object> map){
        CysglEntity cysglEntity = cysglService.get(ids);
        map.put("cysglEntity", cysglEntity);
        return "Cysgl/update";
    }

    @RequestMapping("update")
    public String update(CysglEntity cysglEntity){
        cysglService.update(cysglEntity);
        return "redirect:queryCysgl.do";
    }

    @RequestMapping("delete")
    public String delete(String[] ids){
        cysglService.delete(ids);
        return "redirect:queryCysgl.do";
    }
}
