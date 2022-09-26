package com.jnu.controller;

import com.jnu.model.ILoginModel;
import com.jnu.model.impl.LoginModelImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

//声明当前类是一个控制器 IOC
@Controller
//@RequestMapping("/login")
public class LoginController
{
    //自动装配JavaBean
    @Autowired
    private ILoginModel model = null;

    @RequestMapping("/doLogin")
    public String doLogin(HttpServletRequest request)
    {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        boolean loginState = model.login(userName, password);
        String message = loginState ? "登录成功！" : "登录失败！请重新输入";

        request.setAttribute("loginState", message);

        return "/jsp/register.jsp";
    }
}
