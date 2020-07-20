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
        Integer middleElement = getMiddle(list);
        System.out.println("Middle element = " + middleElement);
    }
    
    private static Integer getMiddle(SinglyLinkedList list) {
        Integer first = list.getFirst();
        if (first == null) {
            return null;
        }
        Integer next = list.getNext();
        int listLength = 1;
        while (next != null) {
            listLength++;
            next = list.getNext();
        }
        int middleIndex = listLength / 2 + 1;
        list.getFirst();
        for (int i = 1; i < middleIndex - 1; i++) {
            list.getNext();
        }
        return list.getNext();
    }
}