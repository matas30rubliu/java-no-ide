package training.exercises;

import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Collections;

/**
 * @see <a href="https://youtu.be/5o-kdjv7FD0">Explanation</a>
 */
public class StaircaseExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many steps does the staircase have?");
        try {
            int steps = scanner.nextInt();
            System.out.println("What are the possible stepping sizes?");
            int[] stepSizes = parseStepSizes(scanner);
            //int scenarioCount1 = calculateScenarioCount1(steps, stepSizes);
            //System.out.println(String.format("METHOD1: You can climb in %s different way(s)", scenarioCount1));
            
            int scenarioCount2 = calculateScenarioCount2(steps, stepSizes);
            System.out.println(String.format("METHOD2: You can climb in %s different way(s)", scenarioCount2));
        } catch(Exception e) {
            System.out.println("Staircase too complex due: " + e);
        }
    }

    private static int calculateScenarioCount2(int steps, int[] ascendingSizes) {
        return 0;
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

    private static int calculateScenarioCount1(int steps, int[] ascendingSizes) {
        /* 
         * (example values: steps 11, step sizes: 2, 4, 7)
         * 0) Give the biggest step size
         * 1) Take the given step size and begin the operation
         * 2) Check how many steps you can make: 
         *   2.1) if you can go to the top, increase the counter and CONTINUE the operation by giving next lower step size to 1)
         *   2.2) if step size is less than the staircase, take the remaining staircase and start NEW operation 1) with next lower step
         *   2.3) if step size is bigger than the staircase, CONTINUE the operation by giving next lower step size to 1)
         *   2.4) if there is no lower step size, start NEW operation 1) with lower step
         */
        System.out.println(String.format("--- New operation: steps = %s, ascendingSizes = %s", steps, Arrays.toString(ascendingSizes)));
        int scenarioCounter = 0;
        for (int operation = ascendingSizes.length - 1; operation >= 0; operation--) {
            System.out.println(String.format("Operation index = %s", operation));
            System.out.println(String.format("Operation step size = %s", ascendingSizes[operation]));
            int givenStepSize = ascendingSizes[operation];
            if (givenStepSize > steps) {
                continue;
            }

            int numOfSteps = steps / givenStepSize;
            int remainingSteps = steps % givenStepSize;
            boolean isAtTheTop = remainingSteps == 0;
            if (isAtTheTop) {
                scenarioCounter++;
            } else {
                // scenarioCounter += (numOfSteps + 1 )* calculateScenarioCount1(remainingSteps, Arrays.copyOfRange(ascendingSizes, 0, ascendingSizes.length - 1));
                for (int stepsUsed = 1; stepsUsed <= numOfSteps; stepsUsed++) {
                    scenarioCounter += (stepsUsed + 1) * calculateScenarioCount1(steps - stepsUsed * givenStepSize, Arrays.copyOfRange(ascendingSizes, 0, ascendingSizes.length - 1));
                }
            }
        }
        System.out.println(String.format("--- Ending operation: steps = %s, ascendingSizes = %s", steps, Arrays.toString(ascendingSizes)));
        System.out.println(String.format("------ Resulting in %s scenarios", scenarioCounter));
        return scenarioCounter;
    }
}