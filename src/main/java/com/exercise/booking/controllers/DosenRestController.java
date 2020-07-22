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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author yosef
 */
@Controller
public class DosenRestController {
    @Autowired
    DosenService service;
    
    @GetMapping("")
    public Iterable<Dosen> getAll(){
        return service.getAll();
    }
    
    @PostMapping("/save")
    public Dosen save(@Valid @RequestBody Dosen dosen){
        return service.save(dosen);
    }
    
    @DeleteMapping("{nip}")
    @SuppressWarnings("empty-statement")
    public String delete(@PathVariable{"nip"} String nip){
        service.delete(nip);
        return "Dosen" + nip + "has been deleted";
    }
    
    @GetMapping("{nip}")
    @SuppressWarnings("empty-statement")
    public Dosen getById(@PathVariable("nip") String id){
        return service.getById(nip);
    }  
}