package firstdemo.weiyi.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 *create by weiyi at 2020.12.25
 */


@Controller
public class HelloControler {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name")String name, Model model){
        model.addAttribute("name",name);
        //项目会去src\main\resources\templates位置寻找“hello”模板
        return "hello";
    }
}
