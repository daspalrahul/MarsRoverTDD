package com.marsrover;


import org.junit.Test;
import static org.junit.Assert.*;

public class RoverControlCenterTest {

    @Test
    public void roverControlCenterShouldKnowLocationOfTheRover() {
        RoverControlCenter roverControlCenter = new RoverControlCenter(0, 0, 'N', "MM");

        assertEquals(new MarsRover(0, 2, 'N').location(), roverControlCenter.locationOfRover());
    }

}