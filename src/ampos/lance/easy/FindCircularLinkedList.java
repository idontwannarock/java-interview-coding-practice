package ampos.lance.easy;

import java.util.ArrayList;
import java.util.List;

public class FindCircularLinkedList {

    public Node findCircularLinkedList(Node start) {
        // Find the beginning of circular reference of link list.
        // The application must be able to
        // 1. Add the linked list
        // 2. Find the beginning node of the circular linked list

        List<Node> tempList = new ArrayList<>();
        Node currentNode = start;
        while (currentNode.next != null) {
            if (tempList.contains(currentNode)) return currentNode;
            tempList.add(currentNode);
            currentNode = currentNode.next;
        }
        return null;
    }

    public static class Node {

        public String value;
        public Node next;

        public Node(String value) {
            this.value = value;
        }
    }
}
