package itprogramm.PhoneBook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Home page");
        return "home";
    }

    @GetMapping("/contacts")
    public String contacts(Model model) {
        model.addAttribute("title", "Contacts");
        return "contactsMain";
    }

    @GetMapping("/add-contacts")
    public String add(Model model) {
        model.addAttribute("title", "Contacts");
        return "AddContacts";
    }


}