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

    @Test
    public void marsRoverAtZeroZeroFacingEastWhenMovesReachesOneZero() {
        MarsRover marsRover = new MarsRover(0, 0, 'E');

        marsRover.move();

        assertEquals(new MarsRover(1, 0, 'E').location(), marsRover.location());
    }

    @Test
    public void marsRoverAtOneOneFacingWestWhenMovesReachesZeroOne() {
        MarsRover marsRover = new MarsRover(1, 1, 'W');

        marsRover.move();

        assertEquals(new MarsRover(0, 1, 'W').location(), marsRover.location());
    }
}