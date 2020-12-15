package com.section6.CompositionLesson.Part2_Computer;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("H510 Elite", "NZXT", "850 Watt", dimensions);
        Monitor theMonitor = new Monitor("GL850",
                "LG",
                27, new Resolution(2560, 1440)); // This created an instance of a class without using a variable

        Motherboard motherboard = new Motherboard("BJ-200", "ASUS", 4, 3, "v2.44");

        // Create our PC:
        PC thePC = new PC(theCase, theMonitor, motherboard);
        // How do we access methods in Monitor? Or maybe another class?
        // We are accessing the methods from within the PC object since we have created them above

        thePC.powerUp();
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 10");
//        thePC.getTheCase().pressPowerButton();

    }

}
