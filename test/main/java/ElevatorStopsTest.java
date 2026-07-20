package main.java;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class ElevatorStopsTest {

    @org.junit.jupiter.api.Test
    void minimizedRoute() {
        ElevatorStops elevator = new ElevatorStops();

        assertArrayEquals(
                new int[]{3, 2, 8, 9},
                elevator.minimizedRoute(5, new int[]{2, 8, 3, 9})
        );
        assertArrayEquals(
                new int[]{8, 9, 10, 3, 2, 1},
                elevator.minimizedRoute(6, new int[]{2, 10, 8, 3, 1, 9})
        );
        assertArrayEquals(
                new int[]{3, 4, 6, 8, 9},
                elevator.minimizedRoute(1,  new int[]{4, 8, 3, 6, 9})
        );
        assertArrayEquals(
                new int[]{10, 7, 6, 4, 3, 1},
                elevator.minimizedRoute(12, new int[]{6, 10, 7, 3, 1, 4})
        );
        assertArrayEquals(
                new int[]{10, 9, 8, 6, 5, 2, 12, 19, 23},
                elevator.minimizedRoute(11, new int[]{2, 8, 23, 5, 12, 10, 6, 9, 19})
        );


    }
}