package training.exercises;

import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Collections;

public class StaircaseExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many steps does the staircase have?");
        try {
            int steps = scanner.nextInt();
            System.out.println("What are the possible stepping sizes?");
            int[] stepSizes = parseStepSizes(scanner);
            int scenarioCount = calculateScenarioCount(steps, stepSizes);
            System.out.println(String.format("You can climb in %s different way(s)", scenarioCount));
        } catch(Exception e) {
            System.out.println("Staircase too complex due: " + e);
        }
    }

    private static int[] parseStepSizes(Scanner scanner) {
        scanner.nextLine();
        String rawSizes = scanner.nextLine();
        String[] strSizesArray = rawSizes.split(" ");
        int[] intSizesArray = Stream.of(strSizesArray)
            .mapToInt(size -> Integer.parseInt(size))
            .toArray();
        Arrays.sort(intSizesArray);
        return intSizesArray;
    }

    private static int calculateScenarioCount(int steps, int[] sizesArray) {
        int smallStepSize = 1;
        int bigStepSize = 2;
        return steps + 1;
    }
}