package training.exercises;

import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;
import static java.lang.System.out;

public class KadaneProblem {

    public static void main(String[] args) {
        out.println("Given int array, find largest contiguous subarray sum.");
        out.println("To pass the array, enter integers seperated by space: ");
        Scanner scanner = new Scanner(System.in);
        String parsedArray = scanner.nextLine();
        int[] array = Stream.of(parsedArray.split(" "))
            .mapToInt(str -> Integer.parseInt(str))
            .toArray();
        int[] heaviestArray = findSumAndCompare(array, array[0], array);
        out.println("The following sub-array, has the largest sum: " + Arrays.toString(heaviestArray));
        int sum = Arrays.stream(heaviestArray).sum();
        out.println("Sum = " + sum);
    }

    private static int[] findSumAndCompare(int[] array, int maxSum, int[] maxArray) {
        int sum = 0;
        //out.println("Array in processing: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum >= maxSum) {
                maxSum = sum;
                maxArray = Arrays.copyOfRange(array, 0, i + 1);
                //out.println("Max array and its sum:");
                //out.println(Arrays.toString(maxArray));
                //out.println(maxSum);
            }
        }
        if (array.length > 1) {
            maxArray = findSumAndCompare(Arrays.copyOfRange(array, 1, array.length), maxSum, maxArray);
        }
        return maxArray;
    }

}