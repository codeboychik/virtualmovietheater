package com.example.virtualmovietheater.seats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by @author andrey.chernenko 12.01.2023
 */
@Service
public class HallService {

    @Autowired
    private HallRepository hallRepository;

    @Autowired
    private SeatRepository seatRepository;

    public List<Seat> getAllSeats(Long id) {
         return this.hallRepository.findById(id).get().getSeats();
    }

    public void addNewHall(){
        Hall hall = new Hall();
        this.hallRepository.save(hall);
        for(int i = 0;i<9;i++) {
            for(int j = 0;j<9;j++){
                Seat seat = new Seat();
                seat.setHall(hall);
                seat.setSeat_row(i);
                seat.setSeat_column(j);
                seat.setAvailable(true);
                this.seatRepository.save(seat);
            }
        }
    }

}