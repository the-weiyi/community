package firstdemo.weiyi.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * create by weiyi at 2020.12.25
 */


@Controller
public class IndexControler {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
