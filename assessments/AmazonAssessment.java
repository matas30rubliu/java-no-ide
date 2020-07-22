package training.assessments;

import java.util.ArrayList;

/**
 * root_dir>javac -d ./target assessments/AmazonAssessment.java
 * root_dir>java -cp ./target training.assessments.AmazonAssessment
 */
public class AmazonAssessment {

    public static void main(String[] args) {
        System.out.println("Test ID = 23280666561652");
        int flightDuration;
        
        // List of durations of N movies
        // Each movie is assigned a unique ID, numbered from 0 to N-1
        ArrayList<Integer> movieDurations;

        // Passangers watch exactly two movies and no movie is played twice 
        // If there are multiple combinations of movies, select the combination with the longest movie
        // Write an algorithm to output a pair of movie IDs that finish exactly 30 mins before plane lands
        Pair a = new Pair(Integer.valueOf(1), Integer.valueOf(1));
    }

    static class Pair {
        Integer first;
        Integer second;

        public Pair(Integer first, Integer second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return String.format("<%s,%s>", this.first, this.second);
        }
    }
}