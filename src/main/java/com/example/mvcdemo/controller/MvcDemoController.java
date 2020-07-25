package com.example.mvcdemo.controller;
import com.example.mvcdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcDemoController {
    @GetMapping("/mvcdemo")
    public ModelAndView hello()
    {
        User user=new User();
        user.setName("liuliu");
        user.setAge(28);
        ModelAndView mv=new ModelAndView("mvcdemo");
        mv.addObject("user",user);
        return mv;

    }
}
