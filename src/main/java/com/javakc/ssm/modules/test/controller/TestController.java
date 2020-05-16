package com.javakc.ssm.modules.test.controller;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.base.util.CommonUtil;
import com.javakc.ssm.modules.test.entity.TestEntity;
import com.javakc.ssm.modules.test.service.TestService;
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
@RequestMapping("test")
public class TestController {
    @Autowired
    public TestService testService;

    /**
     * 根据条件进行分页查询-测试管理数据
     * @param testEntity
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("queryTest")
    public ModelAndView queryTest(TestEntity testEntity, HttpServletRequest request, HttpServletResponse response){
//      调用逻辑层的方法，进行分页查询
        Page<TestEntity> page = testService.queryTest(testEntity, new Page<>(request, response));
//      把page传到前台页面当中
        ModelAndView modelAndView = new ModelAndView("test/list");
        modelAndView.addObject("page", page);
        return modelAndView;
    }

    @RequestMapping("create")
    public String create(TestEntity testEntity){
//        id
        testEntity.setTestId(CommonUtil.uuid());
        testService.save(testEntity);
        return "redirect:queryTest.do";
    }

    @RequestMapping("view")
    public String view(String ids, Map<String, Object> map){
        TestEntity testEntity = testService.get(ids);
        map.put("testEntity", testEntity);
        return "test/update";
    }

    @RequestMapping("update")
    public String update(TestEntity testEntity){
        testService.update(testEntity);
        return "redirect:queryTest.do";
    }

    @RequestMapping("delete")
    public String delete(String[] ids){
        testService.delete(ids);
        return "redirect:queryTest.do";
    }
}
