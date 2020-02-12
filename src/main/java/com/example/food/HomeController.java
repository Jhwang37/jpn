package com.example.food;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/maincourse")
    public String mainCourse(){
        return "maincourse";
    }
    @RequestMapping("/appetizer")
    public String app(){
        return "appetizer";
    }
    @RequestMapping("dessert")
    public String dess(){
        return "dessert";
    }

}
