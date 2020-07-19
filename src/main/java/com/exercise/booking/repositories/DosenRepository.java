/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.booking.repositories;

import com.exercise.booking.entities.Dosen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author yosef
 */
@Repository
public interface DosenRepository extends JpaRepository<Dosen, String> {
    
}
