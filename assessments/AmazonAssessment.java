package training.assessments;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Iterator;
import training.exercises.utils.CliParser;

/**
 * root_dir>javac -d ./target utils/CliParser.java assessments/AmazonAssessment.java
 * root_dir>java -cp ./target training.assessments.AmazonAssessment
 */
public class AmazonAssessment {

    public static void main(String[] args) {
        System.out.println("Test ID = 23280666561652");
        int flightDuration;

        System.out.println("Enter space-separated movie durations: ");
        // List of durations of N movies
        // Each movie is assigned a unique ID, numbered from 0 to N-1

        // I really want the ArrayList here!
        ArrayList<Integer> movieDurations = new ArrayList<Integer>(
            // this will return List
            Arrays.stream(CliParser.parseIntArray())
                .boxed()
                .collect(Collectors.toList()
            )
        );

        // Passangers watch exactly two movies and no movie is played twice 
        // If there are multiple combinations of movies, select the combination with the longest movie
        // Write an algorithm to output a pair of movie IDs that finish exactly 30 mins before plane lands
        Pair a = new Pair(Integer.valueOf(1), Integer.valueOf(1));
        
        int x1 = findLargestTimeAndRemove(movieDurations);
        int x2 = findLargestTimeAndRemove(movieDurations);
        System.out.println(x1);
        System.out.println(x2);
    }

    private static int findLargestTimeAndRemove(ArrayList<Integer> times) {
        System.out.println("findLargestTimeAndRemove>>>");
        int maxTime = 0;
        Iterator<Integer> iter = times.iterator();
        int index = 1;
        while(iter.hasNext()) {
            Integer time = iter.next();
            System.out.println("[" + index + "] = " + time);
            if (time > maxTime) {
                maxTime = time;
                iter.remove();
            }
            index++;
        }
        return maxTime;
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