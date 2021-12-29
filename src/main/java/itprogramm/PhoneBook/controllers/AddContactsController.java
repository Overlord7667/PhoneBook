package itprogramm.PhoneBook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddContactsController {

    @GetMapping("/AddContacts")
    public String add(Model model) {
        model.addAttribute("title", "AddContacts");
        return "add-contacts";
    }
}
