package com.marsrover;


import org.junit.Test;
import static org.junit.Assert.*;


public class MarsRoverTest {

    @Test
    public void marsRoverKnowsAndCanExpressItsLocationAndDirection() {

        assertEquals("Location 0, 0 facing direction N", new MarsRover(0, 0, 'N').location());
    }

}