package com.jnu.controller;

import com.jnu.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//类级别请求（/register/自请求）
@RequestMapping("/register")
public class RegisterController
{
    //二级请求
    @PostMapping("/doRegister")
    public ModelAndView doRegister(@RequestBody User user)
    {
        return new ModelAndView();
    }

    @PostMapping("/sameName")
    public ModelAndView sameName()
    {
        return new ModelAndView();
    }
}
