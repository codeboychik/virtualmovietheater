DROP table seat;

CREATE TABLE seat (
                      seat_id BIGSERIAL PRIMARY KEY,
                      hall_id BIGINT REFERENCES hall(hall_id),
                      seat_row INTEGER NOT NULL,
                      seat_column INTEGER NOT NULL,
                      available BOOLEAN NOT NULL
);