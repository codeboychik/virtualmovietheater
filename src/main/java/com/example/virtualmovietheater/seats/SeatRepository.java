package com.example.virtualmovietheater.seats;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created by @author andrey.chernenko 12.01.2023
 */
@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
}
