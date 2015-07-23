package com.marsrover;


public class MarsRover {
    private char facingDirection;
    private int yCoordinate;
    private int xCoordinate;

    public MarsRover(int xCoordinate, int yCoordinate, char facingDirection) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.facingDirection = facingDirection;
    }
    
    public String location() {
        return "Location " + xCoordinate + ", " + yCoordinate + " facing facingDirection " + facingDirection;
    }
}
