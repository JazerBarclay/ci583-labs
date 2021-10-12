package ci583.lab2.lists;

/**
 * A set implemented as linked list.
 */

public class SortedList extends LinkedList {

	public void insert (int data) {
//        throw new UnsupportedOperationException("Method not implemented");

		Node newNode = new Node(data);
		
		if (_head == null) {
			_head = newNode;
			return;
		}

		Node n = _head, l = null;
		while (n != null) {
			if (n.data > data) {
		        if(l == null) {
		            _head = newNode;
		            newNode.next = n;
		        } else {
		            l.next = newNode;
		            newNode.next = n;
		        }
				return;
			}
			l = n;
			n = n.next;
		}
		
		l.next = newNode;
		
	}
	
	public SortedList tail() {
//      throw new UnsupportedOperationException("Method not implemented");
		if (_head == null) throw new NullPointerException("Head is null");
		if (_head.next == null) return null;
		SortedList tail = new SortedList();
		tail._head = _head.next;
		return tail;
	}
	

}
