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
public class BookingController {
    @Autowired
    BookingService bookingService;
    
    @GetMapping("")
    public String index(Model model){
        model.addAttribute("booking", new Booking());
        model.addAttribute("bookings", bookingService.getAll());
        return "index";
    }
    
    @PostMapping("/save")
    public String save(@Valid Booking booking){
        bookingService.save(booking);
        return "redirect:/";
    }
    
    @GetMapping("/delete/{id}")
    public String delete (Model model, @PathVariable("id") String id){
        int Id = Integer.parseInt(id);
        bookingService.delete(Id);
        return "redirect:/";
    }
    
@GetMapping("{id}")
    public String getById(Model model, @PathVariable("id") String id){
        int Id = Integer.parseInt(id);
        model.addAttribute("booking", bookingService.getById(Id));
        model.addAttribute("bookings", bookingService.getAll());
        return "index";
    }    
}
