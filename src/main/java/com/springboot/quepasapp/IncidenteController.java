package com.springboot.quepasapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IncidenteController {
    private final IncidenteService incidenteService;

    @Autowired
    public IncidenteController(IncidenteService incidenteService) {
        this.incidenteService = incidenteService;
    }

    @GetMapping("/incidente-list")
    public String showIncidenteList(Model model) {
        List<Incidente> incidenteList = incidenteService.fetchData();
        model.addAttribute("incidentes", incidenteList);
        return "incidentes"; // Thymeleaf template name
    }
}
