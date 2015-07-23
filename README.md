MarsRover
===============

A squad of robotic rovers are to be landed by NASA on a plateau on Mars.
This plateau, which is curiously rectangular, must be navigated by the rovers so that their on-board cameras can get a complete view of the surrounding terrain to send back to Earth.
A rover’s position and location is represented by a combination of x and y co-ordinates and a letter representing one of the four cardinal compass points. 
The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.
In order to control a rover , NASA sends a simple string of letters. The possible letters are ‘L’, ‘R’ and ‘M’. ‘L’ and ‘R’ makes the rover spin 90 degrees left or right respectively, without moving from its current spot. ‘M’ means move forward one grid point, and maintain the same heading.
The output for each rover should be its final co-ordinates and heading.

Requirements
=============

The requirements of this application are:

[1] IntelliJ IDEA

[2] Ant

[3] JUnit 4.11

[4] Hamcrest Core 1.3

Input
=============

The input of the application is initial coordinates of a rover, the dimension of plateau it can move in and the string of command it follows.

Output
========

The application will return the final coordinates of the rover and the facingDirection it is facing.

How to Run?
============

To run the application in your system, just open the application in IntelliJ IDEA,
then goto Run -> Run or you can press options+shift+F10

How to Build
=============

This application using the Ant Build System. You can change your build settings by changing 
the **build.xml** present in the project directory. To build the application, just type following
command in your shell:

    $ ant