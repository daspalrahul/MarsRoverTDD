package com.marsrover;


public class RoverControlCenter {

    private MarsRover marsRover;
    private String drivingInstructions;

    public RoverControlCenter(int xCoordinateOfRover, int yCoordinateOfRover, char directionOfRover, String drivingInstructions) {
        marsRover = new MarsRover(xCoordinateOfRover, yCoordinateOfRover, directionOfRover);
        this.drivingInstructions = drivingInstructions;
    }

    public String locationOfRover() {
        return new MarsRover(0, 2, 'N').location();
    }
}
