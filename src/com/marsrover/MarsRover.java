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
        return "Location " + xCoordinate + ", " + yCoordinate + " facing direction " + facingDirection;
    }

    public void move() {
        if (this.facingDirection == 'N')
            this.yCoordinate++;
        else if (this.facingDirection == 'E')
            this.xCoordinate++;
        else if (this.facingDirection == 'W')
            this.xCoordinate--;
    }
}
