package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("This is home page");
        model.addAttribute("name", "Dibyajyoti M");
        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        System.out.println("This is about page");
        return "about";
    }

    @RequestMapping("/help")
    public ModelAndView help() {
        System.out.println("This is help page");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("phone", "1234567890");
        modelAndView.setViewName("help");
        return modelAndView;
    }
}
