package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectConntroller {
    @RequestMapping("/redirect1")
    public String redirect1() {
        System.out.println("Handler one");
        return "redirect:/redirect2";
    }

    @RequestMapping("/redirect3")
    public RedirectView redirect3() {
        System.out.println("Handler three");
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("redirect2");
        return redirectView;
    }

    @RequestMapping("/redirect2")
    public String redirect2() {
        System.out.println("Handler two");
        return "about";
    }
}
