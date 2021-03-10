package com.ssm.ssmMaven.controller;

import com.alibaba.fastjson.JSONObject;
import com.ssm.ssmMaven.bean.TestBean;
import com.ssm.ssmMaven.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @date 2019/9/20 - 10:14
 */
@Controller
public class TestController {
    @Autowired
    private TestService testService;

    /*@RequestMapping(value = "/selectAll",method = RequestMethod.GET)
    @ResponseBody
    public JSONObject selectAll(Model model){
        List<TestBean> testBeans = testService.selectAll();
        //model.addAttribute("testBeans" , testBeans);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("testBeans" , testBeans);
        return jsonObject;
    }*/
    @RequestMapping(value = "/selectAll",method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView selectAll(ModelAndView modelAndView){
        List<TestBean> testBeans = testService.selectAll();
        //model.addAttribute("testBeans" , testBeans);
        modelAndView.addObject("testBeans" , testBeans);
        modelAndView.setViewName("list");
        return modelAndView;
    }
}
