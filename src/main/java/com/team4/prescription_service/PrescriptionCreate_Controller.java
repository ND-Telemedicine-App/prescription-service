package com.team4.prescription_service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PrescriptionCreate_Controller {

    @Autowired
    private PrescriptionCreate_Repository repo;

    @GetMapping(value = "/")
    public String viewPrescriptions(){
        return "index";
    }

    @GetMapping("/createPrescription")
    public String createPrescription(Model model) {
        model.addAttribute("prescription", new PrescriptionCreate());
        return "create-prescription-form";
    }

}
