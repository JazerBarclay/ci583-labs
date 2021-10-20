package ci583.lab3.lists;

public class LinkedCollection {

	protected Node _head;
	
	public boolean isEmpty() {
		return (_head == null) ? true : false;
	}
	
	public int length() {
		Node last = _head;
		int i = 0;
		while (last != null) { //loop to the end of the list
			i++;
			last = last.next; //move onto the next node in the list
		}
		return i;
	}
	
	public boolean member(int data) {
		Node last = _head;
		while (last != null) {
			if (last.data == data) return true;
			last = last.next;
		}
		return false;
	}
	
	public void printList() {
		Node n = _head;
		int i = 0;
		while (n.next != null) {
			System.out.println(i + " : " + n.data);
			n = n.next;
			i++;
		}
		System.out.println("");
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node n = _head;
		while (n != null) {
			sb.append(n.data+":");
			n = n.next;
		}
		return sb.toString();
	}
	
}
