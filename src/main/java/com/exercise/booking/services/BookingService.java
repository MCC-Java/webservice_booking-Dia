/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.booking.services;

import com.exercise.booking.entities.Booking;
import com.exercise.booking.repositories.BookingRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yosef
 */
@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;
    
    //ini method untuk read
    public List<Booking> getAll(){
        return bookingRepository.findAll();
    }
    
    //ini method untuk create dan update
    public void save(Booking booking){
        bookingRepository.save(booking);
    }
    
    //ini method untuk delete
    public void delete(Integer id){
        bookingRepository.delete(new Booking(id));
    }
    
 //search
    public Booking getById(Integer id){
        return bookingRepository.findById(id).get();
    }   
}
