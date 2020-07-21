/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.booking.services;

import com.exercise.booking.entities.Mahasiswa;
import com.exercise.booking.repositories.MahasiswaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yosef
 */
@Service
public class MahasiswaService {
    @Autowired
    MahasiswaRepository mahasiswaRepository;
   
    //ini method untuk read
    public List<Mahasiswa> getAll(){
        return mahasiswaRepository.findAll();
    }
    
    //ini method untuk create dan update
    public void save(Mahasiswa mahasiswa){
        mahasiswaRepository.save(mahasiswa);
    }
    
    //ini method untuk delete
    public void delete(String id){
        mahasiswaRepository.delete(new Mahasiswa(id));
    }

    public Object getById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
