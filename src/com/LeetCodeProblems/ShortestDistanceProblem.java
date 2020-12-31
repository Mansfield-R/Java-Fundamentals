package com.LeetCodeProblems;

public class ShortestDistanceProblem {

    public static void main(String[] args) {
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        shortestDistance(words, "coding", "practice");
    }

    public static int shortestDistance(String[] words, String word1, String word2) {

        int word1Position = -1;
        int word2Position = -1;
        boolean done = false;
        int shortestDistance = words.length;

        while(!done){
            for (int i=0; i<words.length; i++) {
                if(words[i].equals(word1)) {
                    word1Position = i;
                }
                if(words[i].equals(word2)) {
                    word2Position = i;
                }
                if (word1Position != -1 && word2Position != -1) {
                    shortestDistance = Math.min(shortestDistance, Math.abs(word1Position - word2Position));
                }
                done = true;
            }
        }
        System.out.println(shortestDistance);
        return shortestDistance;
    }
}
