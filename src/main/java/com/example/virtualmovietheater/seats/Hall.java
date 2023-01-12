package com.example.virtualmovietheater.seats;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * created by @author andrey.chernenko 12.01.2023
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Hall {
    @Id
    @SequenceGenerator(name = "hall_seq", sequenceName = "hall_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hall_seq")
    @Column(name = "hall_id", nullable = false)
    private Long id;

    @OneToMany(mappedBy = "hall")
    private List<Seat> seats;

}
