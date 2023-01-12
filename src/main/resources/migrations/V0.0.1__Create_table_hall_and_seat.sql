CREATE TABLE hall (
                      hall_id BIGSERIAL PRIMARY KEY
);

CREATE TABLE seat (
                      seat_id BIGSERIAL PRIMARY KEY,
                      hall_id BIGINT REFERENCES hall(hall_id),
                      row INTEGER NOT NULL,
                      "column" INTEGER NOT NULL,
                      available BOOLEAN NOT NULL
);