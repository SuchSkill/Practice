package proc.dyn.SinglySinkedList;

/**
 * Created by Eugene on 25.07.2016.
 */
public class TestSinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(7,
                new Node(4,
                        new Node(3,
                                new Node(2,
                                        new Node(1, null)))));
        System.out.println(SinglyLinkedList.length(head));
        System.out.println(SinglyLinkedList.lengthRec(head));
        System.out.println(SinglyLinkedList.max(head));
        System.out.println(SinglyLinkedList.sum(head));
        
        

    }
}
