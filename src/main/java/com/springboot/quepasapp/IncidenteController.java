package com.springboot.quepasapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IncidenteController {

    @RequestMapping
    public String helloWorld(){
        return "asjgaklfjg";
    }



    @Controller
    public class IncidentController {

        @GetMapping("/incidentes")
        public String listIncidentes(Model model) {
            List<Incidente> incidentes = new ArrayList<>();
            model.addAttribute("incidentes", incidentes);
            return "incidentes";  // Return the Thymeleaf template
        }
    }
}
