package hu.consumeSoldierAPI.controllers;

import hu.consumeSoldierAPI.services.SoldierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private SoldierService service;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/soldiers")
    public String getSoldiers(Model model){
        model.addAttribute("soldiers", service.getSoldiers());
        return "soldiers";
    }
}
