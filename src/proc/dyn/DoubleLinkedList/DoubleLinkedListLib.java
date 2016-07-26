package proc.dyn.DoubleLinkedList;

/**
 * Created by Shymko Eugene on 26-Jul-16.
 */
public class DoubleLinkedListLib {
	public static DoubleNode add(DoubleNode head, int elem) {
			DoubleNode result = head;
			DoubleNode end = head;
			while (head != null) {
				end = head;
				head = head.next;
			}
			end.next = new DoubleNode(elem, end, null);
			return result;
	}
	
	public static DoubleNode remove(DoubleNode head, int index) {
		DoubleNode result = head;
		DoubleNode end = head;
		DoubleNode beforeEnd = head;
		if (index == 0){
			head = head.next;
			head.prev = null;
			return head;
		}
		for (int i = 0; i < index+1; i++) {
			beforeEnd = end;
			end = head;
			head = head.next;
			if (head == null) {
				beforeEnd.next=null;
				return result;
			}
		}
		beforeEnd.next = head;
		head.prev = beforeEnd;
		return result;
	}
	
	public static DoubleNode add(DoubleNode head, int index, int elem) {
		DoubleNode result = head;
		DoubleNode end = head;
		int i = 0;
		while (i < index && head!=null) {
			end = head;
			head = head.next;
			i++;
		}
		DoubleNode node = new DoubleNode(elem, end,head);
		head.prev = node;
		if (index == 0) {
			node.prev = null;
			System.out.println("12");
			return node;
		} else {
			end.next = node;
		}
		
		
		return head;
	}
		
	public static DoubleNode remove(DoubleNode head) {
		DoubleNode result = head;
		DoubleNode end = head;
		DoubleNode buff = head;
		while (head != null) {
			end=buff;
			buff=head;
			head = head.next;
		}
		end.next=null;
		return result;
	}
	
	
	public static void print(DoubleNode head) {
		while (head!=null) {
			System.out.print("("+head.value+")-");
			head = head.next;
		}
		
	}
}
