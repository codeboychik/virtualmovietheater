package com.example.virtualmovietheater.seats;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * created by @author andrey.chernenko 12.01.2023
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Seat {
    @Id
    @Column(name = "seat_id", nullable = false)
    @SequenceGenerator(name = "seat_seq", sequenceName = "seat_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seat_seq")
    private Long id;

    @ManyToOne
    private Hall hall;

    @Column(name = "seat_row", nullable = false)
    private Integer seat_row;

    @Column(name = "seat_column", nullable = false)
    private Integer seat_column;

    @Column(name = "available", nullable = false)
    private boolean available;

}
