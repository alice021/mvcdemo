package com.example.mvcdemo.controller;
import com.example.mvcdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

@Controller
public class MvcDemoController {
    @GetMapping("/mvcdemo")
    public ModelAndView hello()
    {
        User user=new User();
        user.setName("liuliu");
        String ab="sss";
        String c="cde";
        String abc= StringUtils.concat("  ",ab,c);
        user.setAge(28);
        ModelAndView mv=new ModelAndView("mvcdemo");
        mv.addObject("abcd",ab);
        mv.addObject("abc",abc);
        return mv;

    }
}
