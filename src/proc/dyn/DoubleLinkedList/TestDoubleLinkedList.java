package proc.dyn.DoubleLinkedList;

/**
 * Created by Shymko Eugene on 26-Jul-16.
 */
public class TestDoubleLinkedList {
	public static void main(String[] args) {
		DoubleNode dn = new DoubleNode(1, null,
				new DoubleNode(2, null,
						new DoubleNode(3, null,
								new DoubleNode(4, null, null))));
		DoubleLinkedListLib.print(dn);
	}
}
