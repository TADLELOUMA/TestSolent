## About The Project
MowItNow has decided to develop an automatic lawnmower for rectangular surfaces. 
The mower can be programmed to cover the entire surface. The position of the mower is represented by a combination of coordinates (x,y) and a letter indicating orientation in English cardinal notation (N, E, W, S).

## Prerequisites
- Java
- Junit
- maven

## Problem description
The lawn is divided into grids to simplify navigation. For example, the position of the mower might be ‘0, 0, N’, meaning that it is in the bottom left-hand corner of the lawn, facing north.

## Controls
To control the mower, send it a simple sequence of letters:

* D: Turn the mower 90° to the right.
* L: Turns the mower 90° to the left.
* A: Moves the mower forward one square in the direction it is facing.

## Restrictions

* If the position after movement is outside the lawn, the mower does not move, retains its orientation and processes the next command.
* We assume that the square directly north of position (x, y) has coordinates (x, y+1).

## Input File
To program the mower, we provide it with an input file constructed as follows:

- The first line corresponds to the coordinates of the top right-hand corner of the lawn, those of the bottom left-hand corner are assumed to be (0,0).
- The rest of the file is used to control all the mowers deployed. Each mower has two lines:
- The first line gives the initial position of the mower, as well as its orientation (e.g.: 1 2 N).
- The second line is a series of instructions telling the mower to explore the lawn (e.g. GAGAGAGAA).

## Sequence

* Each mower moves sequentially: the second mower does not move until the first has completed its series of instructions.
* When a mower completes a series of instructions, it communicates its final position and orientation.

## Author
* Thierno Amadou DIALLO - [TADLELOUMA](https://github.com/TADLELOUMA/PROJETS)

## Clone project
* git clone git@github.com:TADLELOUMA/TestSolent.git
* cd mow-it-now-program

