package com.javakc.ssm.modules.yggl.controller;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.base.util.CommonUtil;
import com.javakc.ssm.modules.yggl.entity.YgglEntity;
import com.javakc.ssm.modules.yggl.service.YgglService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 员工管理表现层
 */
@Controller
@RequestMapping("jczl")
public class YgglController {
    @Autowired
    public YgglService ygglService;

    /**
     * 根据条件分页查询
     * @param ygglEntity
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("queryTest")
    public ModelAndView queryTest(YgglEntity ygglEntity, HttpServletRequest request, HttpServletResponse response){
        Page<YgglEntity> page = ygglService.queryTest(ygglEntity,new Page<>(request,response));
        //把page传到页面
        ModelAndView modelAndView = new ModelAndView("jczl/list");
        modelAndView.addObject("page",page);
        return modelAndView;
    }

    /**
     * 动态生成编码
     * @param prefix
     * @param sufix
     * @return
     */
    public static String getNo(String prefix,Integer sufix){
        String init = prefix + "000001";
        if(sufix != 0){
            int num = sufix+1;
            //不足6位补充为0
            init= String.format(prefix+"%06d",num);
        }
        return init;
    }

    /**
     * 动态生成编码
     * @param map
     * @return
     */
    @RequestMapping("tocreate")
    public String tocreate(Map<String,Object> map){
        //查询表中所有总量
       Integer suffix =  ygglService.queryCount();
       String num = YgglController.getNo("KY",suffix);
        map.put("num",num);
        return "jczl/create";
    }

    /**
     * 添加方法
     * @param ygglEntity
     * @return
     */
    @RequestMapping("create")
    public String create(YgglEntity ygglEntity){
        // id
        ygglEntity.setId(CommonUtil.uuid());
        ygglService.save(ygglEntity);
        return "redirect:queryTest.do";
    }


    /**
     * 跳转到修改展示页面 1、查
     * @param ids
     * @param map
     * @return
     */
    @RequestMapping("view")
    public String view(String ids, Map<String,Object>map){
        YgglEntity ygglEntity = ygglService.get(ids);
        //传给前台
        map.put("ygglEntity",ygglEntity);
        return "jczl/update";
    }

    /***
     *  2、修改
     * @param ygglEntity
     * @return
     */
    @RequestMapping("update")
    public String update(YgglEntity ygglEntity){
        ygglService.update(ygglEntity);
        return "redirect:queryTest.do";
    }

    @RequestMapping("delete")
    public String delete(String[] ids){
        ygglService.delete(ids);
        return "redirect:queryTest.do";
    }
}
