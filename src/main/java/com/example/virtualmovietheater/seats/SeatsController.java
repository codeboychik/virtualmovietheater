package com.example.virtualmovietheater.seats;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

/**
 * created by @author andrey.chernenko 12.01.2023
 */
@RestController
@Slf4j
public class SeatsController {
    @Autowired
    private HallService hallService;


    @GetMapping("/seats")
    public List<Seat> getAllSeats(){
        log.debug("Accessing 'getAllSeats' endpoint:");
        return hallService.getAllSeats(1L);
    }

    @PostMapping("/newHall")
    public void addHall(){
        log.debug("Accessing 'addHall' endpoint:");
        hallService.addNewHall();
    }
}
