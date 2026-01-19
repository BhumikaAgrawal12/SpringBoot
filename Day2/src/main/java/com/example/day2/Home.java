package com.example.day2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//@Controller->for html files
//@RestController-->for json data.
//@ResponseBody-->if ham as it is text return krna hai controller k sth-->mtlb html wali file mai direct text return krna ahi
@Controller
//@ResponseBody
public class Home {
    @GetMapping
    public String home(){
        return "index";//html file ka naam
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
}
