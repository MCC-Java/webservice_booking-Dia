/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.booking.services;

import com.exercise.booking.entities.Booking;
import com.exercise.booking.repositories.BookingRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author yosef
 */
@Service
public class BookingRestService {
    @Autowired
    BookingRepository bookingRepository;
    
    private final String uri = "http://localhost:1008/api/booking";
    private static final RestTemplate restTemplate = new RestTemplate();
    
    //ini method untuk read
    public List<Booking> getAll(){
        ResponseEntity<List<Booking>> response = restTemplate.exchange(
            uri,
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<Booking>>(){ 
        });
            List<Booking> result = response.getBody();
            return result;
    }
    
    //ini method untuk create dan update
    public void save(Booking booking){
        Booking result = restTemplate.postForObject(uri + "/save", booking, Booking.class);
    }
    
    //ini method untuk delete
    public void delete(Integer id){
        Map<String, Integer> params = new HashMap<>();
        params.put("id", id);
        
        restTemplate.delete(uri + "/{id}", params);
    }
    
    //search
    public Booking getById(Integer id){
        Map<String, Integer> params = new HashMap<>();
        params.put("id", id);
        
        Booking result = restTemplate.getForObject(uri + "/{id}", Booking.class,params);
        return result;
    }   
}
