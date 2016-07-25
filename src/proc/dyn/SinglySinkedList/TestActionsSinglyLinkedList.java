package proc.dyn.SinglySinkedList;

/**
 * Created by Eugene on 25.07.2016.
 */
public class TestActionsSinglyLinkedList {
	public static void main(String[] args) {
		Node head = new Node(7,
				new Node(4,
						new Node(3,
								new Node(2,
										new Node(1, null)))));
		
		
		SinglyLinkedList.print(head);
		SinglyLinkedList.add(head, 0);
		System.out.println();
		SinglyLinkedList.print(head);
		System.out.println();
		
		SinglyLinkedList.remove(head);
		SinglyLinkedList.print(head);
		System.out.println();
		SinglyLinkedList.add(head, 1, 42);
		SinglyLinkedList.print(head);
		System.out.println();
		SinglyLinkedList.remove(head, 1);
		SinglyLinkedList.print(head);
		
		
	}
}
