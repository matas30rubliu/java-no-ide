package training.exercises;

import training.exercises.utils.CliParser;
import training.exercises.utils.SinglyLinkedList;
import java.util.Arrays;

/**
 * javac -d ./target utils/*.java exercises/MiddleOfSinglyLinkedList.java
 * java -cp ./target training.exercises.MiddleOfSinglyLinkedList
 */
public class MiddleOfSinglyLinkedList {
    public static void main(String[] args) {
        System.out.println("Enter space-separated integers of the Singly Linked List: ");
        int[] array = CliParser.parseIntArray();
        System.out.println(Arrays.toString(array));
        SinglyLinkedList list = new SinglyLinkedList(array);
        System.out.println("First = " + list.getFirst());
        System.out.println("Next = " + list.getNext());
        System.out.println("Next = " + list.getNext());
        System.out.println("First = " + list.getFirst());
        System.out.println("Next = " + list.getNext());
    }
}