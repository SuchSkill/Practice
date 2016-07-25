package proc.dyn.SinglySinkedList;

/**
 * Created by Eugene on 23.07.2016.
 */
public class SinglyLinkedList {

    public static int length(Node head) {
        int result = 0;
        while (head != null) {
            head = head.next;
            result++;
        }
        return result;
    }
    
    
    public static int lengthRec(Node head) {
        return (head == null) ? 0 : (1 + lengthRec(head.next));
    }
    
    
    public static int max(Node head) {
        int result = Integer.MIN_VALUE;
        while (head != null) {
            if (head.data>result) {
                result = head.data;
            }
            head = head.next;
        }
        return result;
    }
    

    public static int sum(Node head) {
        int result = 0;
        while (head != null) {
            result += head.data;
            head = head.next;
        }
        return result;
    }
	
	public static Node add(Node head, int elem) {
		Node resolt = head;
		Node end = head;
		while (head != null) {
			end = head;
			head = head.next;
		}
		end.next = new Node(elem, null);
		return resolt;
	}

	public static Node remove(Node head) {
		Node result = head;
		Node end = head;
		Node BeforeEnd = end;
		while (head != null) {
			BeforeEnd = end;
			end = head;
			head = head.next;
		}
		BeforeEnd.next = null;
		return result;
	}
	
	
	public static final void print(Node head) {
		while (head!=null) {
			System.out.print("("+head.data+")-");
			head = head.next;
		}
			
	}

    public static Node add(Node head, int index, int elem) {
	    Node result = head;
	    Node end = head;
	    for(int i = 0; i<index;i++) {
	    	end = head;
		    head = head.next;
	    }
	    end.next = new Node(elem, head);
	    end = end.next;
	    end.next = head;
	    return result;
    }
	
	public static Node remove(Node head, int index) {
		Node result = head;
		Node end = head;
		for(int i = 0; i<index;i++) {
			end = head;
			head = head.next;
		}
		end.next = head.next;
		return result;
	}


}
