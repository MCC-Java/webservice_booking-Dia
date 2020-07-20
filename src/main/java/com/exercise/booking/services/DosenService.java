///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.exercise.booking.services;
//
//import com.exercise.booking.entities.Dosen;
//import com.exercise.booking.repositories.DosenRepository;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
///**
// *
// * @author yosef
// */
//@Service
//public class DosenService {
//    @Autowired
//    DosenRepository dosenRepository;
//    
//    //ini method untuk read
//    public List<Dosen> getAll(){
//        return dosenRepository.findAll();
//    }
//    
//    //ini method untuk create dan update
//    public void save(Dosen booking){
//        dosenRepository.save(booking);
//    }
//    
//    //ini method untuk delete
//    public void delete(Integer id){
//        dosenRepository.delete(new Dosen(id));
//    }
//}
//
