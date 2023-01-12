package com.example.virtualmovietheater.seats;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * created by @author andrey.chernenko 12.01.2023
 */
@Repository
public interface HallRepository extends JpaRepository<Hall, Long> {
/*    @Query("SELECT h FROM Hall h WHERE h.id = :id")
    List<Seat> findAllById(Long id);*/
}
