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
}
