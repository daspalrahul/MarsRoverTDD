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
            if (nextCommand(i) == 'M')
                marsRover.move();
            else if (nextCommand(i) == 'L')
                marsRover.turnLeft();
            else if (nextCommand(i) == 'R')
                marsRover.turnRight();
        }
    }

    private char nextCommand(int i) {
        return drivingInstructions.charAt(i);
    }
}
