/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.booking.repositories;

import com.exercise.booking.entities.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author yosef
 */
@Repository
public interface MahasiswaRepository extends JpaRepository<Mahasiswa, String> {
    
}
