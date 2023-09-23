package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import springmvc.model.User;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class FormController {
    @RequestMapping("/form")
    public String renderForm() {
        return "form";
    }

    @RequestMapping("/upload")
    public String renderUploadForm() {
        return "file-upload";
    }

    @RequestMapping(path= "/handleForm", method= RequestMethod.POST)
    public String handleForm(@ModelAttribute("user") User user, BindingResult result, Model model) {
        if(result.hasErrors()) {
            return "form";
        }
        model.addAttribute("response", user);
        System.out.println(user);
        return "success";
    }


    @RequestMapping(path = "uploadImage", method= RequestMethod.POST)
    public String uploadImage(@RequestParam("upload")CommonsMultipartFile file, HttpSession session) {
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getSize());

        byte[] image = file.getBytes();
        String path = session.getServletContext().getRealPath("/") + "uploads" + File.separator + file.getOriginalFilename();
        System.out.println(path);
        try {
            FileOutputStream outputStream = new FileOutputStream(path);
            outputStream.write(image);
            outputStream.close();
            session.setAttribute("fileName", file.getOriginalFilename());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return "file-upload-success";
    }
}
