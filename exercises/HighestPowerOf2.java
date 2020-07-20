package training.exercises;

import java.util.Scanner;

/**
 * More efficient way is to use bitwise left shift operator
 */
public class HighestPowerOf2 {

    public static void main (String[] args) {
        System.out.println("Find highest power of 2 for given number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 2;
        int power = 0;
        while (result <= n) {
            result *= 2;
            power++;
        }
        result /= 2;
        System.out.println(String.format("Answer: 2^%s=%s", power, result));
    }

}