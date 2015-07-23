package com.marsrover;


import org.junit.Test;
import static org.junit.Assert.*;


public class MarsRoverTest {

    @Test
    public void marsRoverKnowsAndCanExpressItsLocationAndDirection() {

        assertEquals("Location 0, 0 facing direction N", new MarsRover(0, 0, 'N').location());
    }

    @Test
    public void marsRoverAtZeroZeroFacingNorthWhenMovesReachesZeroOne() {
        MarsRover marsRover = new MarsRover(0, 0, 'N');

        marsRover.move();

        assertEquals(new MarsRover(0, 1, 'N').location(), marsRover.location());
    }
}