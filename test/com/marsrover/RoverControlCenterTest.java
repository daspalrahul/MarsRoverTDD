package com.marsrover;


import org.junit.Test;
import static org.junit.Assert.*;

public class RoverControlCenterTest {

    @Test
    public void roverControlCenterShouldKnowLocationOfTheRover() {
        RoverControlCenter roverControlCenter = new RoverControlCenter(0, 0, 'N', "MM");

        roverControlCenter.driveRover();

        assertEquals(new MarsRover(0, 2, 'N').location(), roverControlCenter.locationOfRover());
    }

    @Test
    public void roverControlCenterShouldKnowHowToDriveARover() {
        RoverControlCenter roverControlCenter = new RoverControlCenter(0, 0, 'N', "MMMMM");

        roverControlCenter.driveRover();

        assertEquals(new MarsRover(0, 5, 'N').location(), roverControlCenter.locationOfRover());
    }
}