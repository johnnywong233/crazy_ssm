package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.converter.DateEditor;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;



@Controller
public class UserController {

    private static final Log logger = LogFactory.getLog(UserController.class);

    @RequestMapping(value = "/{formName}")
    public String loginForm(@PathVariable String formName) {
        // 动态跳转页面
        return formName;
    }

    // 在控制器初始化时注册属性编辑器
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        // 注册自定义编辑器
        binder.registerCustomEditor(Date.class, new DateEditor());
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(
            @ModelAttribute User user,
            Model mode) {
        logger.info(user);
        mode.addAttribute("user", user);
        return "success";
    }

}

