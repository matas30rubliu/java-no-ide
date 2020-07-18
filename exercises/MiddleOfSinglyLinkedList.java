package training.exercises;

import training.exercises.utils.CliParser;
import java.util.Arrays;

public class MiddleOfSinglyLinkedList {
    public static void main(String[] args) {
        System.out.println("Enter space-separated integers of the Singly Linked List: ");
        int[] array = CliParser.parseIntArray();
        System.out.println(Arrays.toString(array));
    }
}