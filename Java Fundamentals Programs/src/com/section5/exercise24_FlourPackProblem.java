package com.section5;

public class exercise24_FlourPackProblem {

    public static void main(String[] args) {

    }

    // Method:
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {
            int bigFlourKilos = bigCount * 5;
            int smallFlourKilos = smallCount * 1;

            if ((bigFlourKilos + smallFlourKilos) == goal) {
                return true;
            } else if ((bigFlourKilos >= goal && bigFlourKilos % goal == 0) || (bigFlourKilos >= goal && goal % 5 <= smallFlourKilos)) {
                return true;
            } else if (smallFlourKilos >= goal) {
                return true;
            } else if (bigFlourKilos + smallFlourKilos > goal && goal % bigFlourKilos <= smallFlourKilos) {
                return true;
            } else {
                return false;
            }
        }
    }
}
