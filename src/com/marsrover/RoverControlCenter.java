package com.marsrover;


public class RoverControlCenter {

    private MarsRover marsRover;
    private String drivingInstructions;

    public RoverControlCenter(int xCoordinateOfRover, int yCoordinateOfRover, char directionOfRover, String drivingInstructions) {
        marsRover = new MarsRover(xCoordinateOfRover, yCoordinateOfRover, directionOfRover);
        this.drivingInstructions = drivingInstructions;
    }

    public String locationOfRover() {
        return marsRover.location();
    }

    public void driveRover() {
        for (int i = 0; i < drivingInstructions.length(); i++) {
            if (drivingInstructions.charAt(i) == 'M')
                marsRover.move();
            else if (drivingInstructions.charAt(i) == 'L')
                marsRover.turnLeft();
            else if (drivingInstructions.charAt(i) == 'R')
                marsRover.turnRight();
        }
    }
}
