package training.exercises.utils;

import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;

public class CliParser {

    public static int[] parseIntArray() {
        Scanner scanner = new Scanner(System.in);
        String strArray = scanner.nextLine();
        int[] array = Stream.of(strArray.split(" "))
            .mapToInt(str -> Integer.parseInt(str)).toArray();
        scanner.close();
        return array;
    }
}