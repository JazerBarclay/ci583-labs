package ci583.lab2.lists;

/**
 * A linked list storing ints. The nodes of the list are instances of the Node class.
 */
public class LinkedList {

	protected Node _head;

	public boolean isEmpty() {
//        throw new UnsupportedOperationException("Method not implemented");
		return (_head == null) ? true : false;
	}

	public int head() {
		//        throw new UnsupportedOperationException("Method not implemented");
		if (_head == null) throw new NullPointerException("Head is null");
		return _head.data;
	}

	public LinkedList tail() {
//        throw new UnsupportedOperationException("Method not implemented");
		if (_head == null) throw new NullPointerException("Head is null");
		if (_head.next == null) return null;
		LinkedList tail = new LinkedList();
		tail._head = _head.next;
		return tail;
	}

	public int length() {
//        throw new UnsupportedOperationException("Method not implemented");
		Node last = _head;
		int i = 0;
		while (last != null) { //loop to the end of the list
			i++;
			last = last.next; //move onto the next node in the list
		}
		return i;
	}

	public void cons(int data) {
//        throw new UnsupportedOperationException("Method not implemented");
		Node oldHead = _head;
		_head = new Node(data);
		_head.next = oldHead;
	}

	public boolean member(int data) {
//        throw new UnsupportedOperationException("Method not implemented");
		Node last = _head;
		while (last != null) {
			if (last.data == data) return true;
			last = last.next;
		}
		return false;
	}

	public int indexOf(int data) {
//        throw new UnsupportedOperationException("Method not implemented");

		Node latest = _head;
		int i = 0;
		while (latest != null) {
			if (latest.data == data) return i;
			latest = latest.next;
			i++;
		}
		return -1;

	}

	public boolean delete(int index) {
//		throw new UnsupportedOperationException("Method not implemented");

		int i = 0;
		if (_head == null) return false;
		if (_head.next == null) return false;
		Node n = _head, l = _head.next;
		while (n != null) {
			if (i == index) {
				if (i == 0) _head = _head.next;
				else l.next = n.next;
				return true;
			}
			l = n;
			n = n.next;
			i++;
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
