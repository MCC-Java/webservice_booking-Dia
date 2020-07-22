/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.booking.controllers;

import com.exercise.booking.entities.Booking;
import com.exercise.booking.services.BookingService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yosef
 */
@RequestMapping("api/booking")
@RestController
public class BookingRestController {
    
    @Autowired
    BookingService service;
    
    @GetMapping("")
    public Iterable<Booking> getAll(){
        return service.getAll();
    }
    
    @PostMapping("/save")
    public Booking save(@Valid @RequestBody Booking booking){
        return service.save(booking);
    }
    
    @DeleteMapping("{id}")
    @SuppressWarnings("empty-statement")
    public String delete(@PathVariable{"id"} String id) {
        service.delete(Integer.parseInt(id));
        return "Booking" + id + "terhapus";
    }
    
    @GetMapping("{id}")
    @SuppressWarnings("empty-statement")
    public Booking getById(@PathVariable("id") String id){
        return service.getById(Integer.parseInt(id));
    }  
}