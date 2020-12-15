package com.section6.CompositionLesson.Challenge_House;

/*
        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.
 */

public class Main {

    public static void main(String[] args) {

        // Create the objects the Room HAS:
        Dimensions dimensions = new Dimensions(25,50);
        Flooring roomFloor = new Flooring("Mahogony Wood", dimensions, false); // Since room dimensions and floor dimensions will be same, can use same dimensions? (Prob bad idea)
        Chair chair = new Chair("ikea", "silky", "gray", 4);
        Windows window = new Windows(4,2,1,false);
        Door door = new Door("Oak","brown", 1, 2);

        // Finally Create the room:
        Room bedroom = new Room(door, window, roomFloor, chair, dimensions);
        // Open the door to the bedroom:
        bedroom.getDoor().open();

    }
}
