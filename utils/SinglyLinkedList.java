package training.exercises.utils;

public class SinglyLinkedList {

    private Node firstNode;

    private Node currentNode;

    public SinglyLinkedList(int[] array) {
        this.firstNode = new Node(Integer.valueOf(array[0]));
        this.currentNode = this.firstNode;
        Node previousNode = this.firstNode;
        for (int i = 1; i < array.length; i++) {
            Node nextNode = new Node(Integer.valueOf(array[i]));
            previousNode.next = nextNode;
            previousNode = nextNode;
        }
    }

    public Integer getFirst() {
        Integer firstValue = this.firstNode.value;
        this.currentNode = this.firstNode;
        return firstValue;
    }

    public Integer getNext() {
        if (this.currentNode.next == null) {
            return null;
        }
        Integer nextValue = this.currentNode.next.value;
        this.currentNode = this.currentNode.next;
        return nextValue;
    }

    private class Node {
        Integer value;

        Node next;

        Node(Integer value) {
            this.value = value;
        }
    }
}