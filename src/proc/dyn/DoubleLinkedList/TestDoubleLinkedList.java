package proc.dyn.DoubleLinkedList;

/**
 * Created by Shymko Eugene on 26-Jul-16.
 */
public class TestDoubleLinkedList {
	public static void main(String[] args) {
		DoubleNode dn = new DoubleNode(1, null, null);
		DoubleNode dn2 = new DoubleNode(2, dn, null);
		dn.next = dn2;
		dn2.next = new DoubleNode(3, dn2, null);
		
		

		DoubleLinkedListLib.print(dn);
		DoubleLinkedListLib.add(dn, 4);
		System.out.println();
		DoubleLinkedListLib.print(dn);
		
		System.out.println();
		DoubleLinkedListLib.print(DoubleLinkedListLib.remove(dn, 3));
		System.out.println();
		
		
		System.out.println();
		DoubleLinkedListLib.print(DoubleLinkedListLib.remove(DoubleLinkedListLib.add(dn, 0, 42)
));
		
		
	}
}
