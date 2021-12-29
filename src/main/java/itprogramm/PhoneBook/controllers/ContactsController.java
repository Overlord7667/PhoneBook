package itprogramm.PhoneBook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactsController {

    @GetMapping("/contactsMain")
    public String contacts(Model model) {
        model.addAttribute("title", "Contacts");
        return "contacts";
    }

}
