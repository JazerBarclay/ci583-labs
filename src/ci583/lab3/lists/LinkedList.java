package ci583.lab3.lists;

/**
 * A linked list storing ints. The nodes of the list are instances of the Node class.
 */
public class LinkedList extends LinkedCollection {

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

	public void cons(int data) {
//        throw new UnsupportedOperationException("Method not implemented");
		Node oldHead = _head;
		_head = new Node(data);
		_head.next = oldHead;
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
	
}
