package ampos.lance.easy;

import ampos.lance.easy.FindCircularLinkedList.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FindCircularLinkedListTest {

    private List<Node> list;

    @Before
    public void init() {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;
        list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
    }

    @Test
    public void shouldReturnB() {
        FindCircularLinkedList finder = new FindCircularLinkedList();
        Node firstCircularNode = finder.findCircularLinkedList(list.get(0));
        System.out.println("The first node of the circularly linked list is " + firstCircularNode.value);
        assert firstCircularNode.value.equals(new Node("B").value);
    }
}
