package controller;

import model.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @ModelAttribute
    public void commons(Model model) {
        model.addAttribute("message", "This is just for testing!");
    }
    @RequestMapping("/contact")
    public String showForm(Model model) {
        return "contact";
    }

    @RequestMapping(path = "/submit", method = RequestMethod.POST)
    public String handleForm(
            @ModelAttribute Response response,
            Model model
    ) {
        System.out.println(response);
        return "success";
    }

    @RequestMapping(path = "/submit-v1", method = RequestMethod.POST)
    public String handledForm(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastname, @RequestParam("message") String message, Model model) {
        Response response = new Response(firstName, lastname, message);
        System.out.println(response);
        model.addAttribute("response", response);
        return "success";
    }
}
