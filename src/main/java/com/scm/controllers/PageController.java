package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {


        @RequestMapping("/home")
        public String home(Model model) {
            System.out.println("Home page handler");
            model.addAttribute("name","Substring Technologies");
            model.addAttribute("YoutubeChannel", "Yash");
            model.addAttribute("Github", "https://github.com/Imyashmathur/code");
            return "home";
        }
        @RequestMapping("/about")
        public String aboutPage(Model model){
            model.addAttribute("isLogin", true);
            System.out.println("About page loading");
            return "about";
        }

        @RequestMapping("/services")
        public String servicesPage(){
            System.out.println("Services page loading");
            return "services";
        }

}
