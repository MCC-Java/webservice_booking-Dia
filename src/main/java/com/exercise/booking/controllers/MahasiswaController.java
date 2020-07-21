/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.booking.controllers;

import com.exercise.booking.entities.Mahasiswa;
import com.exercise.booking.services.MahasiswaService;
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
public class MahasiswaController {
    @Autowired
    MahasiswaService mahasiswaService;
    
    @GetMapping("")
    public String index(Model model){
        model.addAttribute("mahasiswa", new Mahasiswa());
        model.addAttribute("mahasiswas", mahasiswaService.getAll());
        return "index";
    }
    
    @PostMapping("/save")
    public String save(@Valid Mahasiswa mahasiswa){
        mahasiswaService.save(mahasiswa);
        return "redirect:/";
    }
    
    @GetMapping("/delete/{id}")
    public String delete (Model model, @PathVariable("id") String id){
        int Id = Integer.parseInt(id);
        mahasiswaService.delete(id);
        return "redirect:/";
    }
    
    @GetMapping("{id}")
    public String getById(Model model, @PathVariable("id") String id){
        model.addAttribute("booking", mahasiswaService.getById(id));
        model.addAttribute("bookings", mahasiswaService.getAll());
        return "index";
    }    
}
