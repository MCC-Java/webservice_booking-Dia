/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.booking.controllers;
import com.exercise.booking.entities.Dosen;
import com.exercise.booking.services.DosenService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author yosef
 */
@Controller
public class DosenController {
    @Autowired
    DosenService dosenService;
    
    @GetMapping("")
    public String index(Model model){
        model.addAttribute("dosen", new Dosen());
        model.addAttribute("dosens", dosenService.getAll());
        return "dosen";
    }
    
    @PostMapping("/save")
    public String save(@Valid Dosen dosen){
        dosenService.save(dosen);
        return "redirect:/";
    }
    
    @GetMapping("/delete/{nip}")
    public String delete (Model model, @PathVariable("id") String nip){
        dosenService.delete(nip);
        return "redirect:/";
    }
}
