package proc.dyn.DoubleLinkedList;

/**
 * Created by Shymko Eugene on 26-Jul-16.
 */
public class DoubleLinkedListLib {
//	public static DoubleNode add(DoubleNode head, int elem) {
//
//	}
//	public static DoubleNode remove(DoubleNode head) {}
public static void print(DoubleNode head) {
	while (head!=null) {
		System.out.print("("+head.value+")-");
		head = head.next;
	}
	
}
//	public static DoubleNode add(DoubleNode head, int index, int elem) {}
	
//	public static DoubleNode remove(DoubleNode head, int index) {}
}
