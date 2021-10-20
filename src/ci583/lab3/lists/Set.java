package ci583.lab3.lists;

public class Set extends LinkedCollection {

	public void insert (int data) {

		Node newNode = new Node(data);
		
		if (_head == null) {
			_head = newNode;
			return;
		}

		Node n = _head, l = null;
		while (n != null) {
			if (n.data == data) return;
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
	
	public Set union(Set s2) {
		
		Set combined = new Set();
		
		Node n = _head;
		while (n != null) {
			combined.insert(n.data);
			n = n.next;
		}

		n = s2._head;
		while (n != null) {
			combined.insert(n.data);
			n = n.next;
		}
			
		return combined;
	}
	
	public Set intersection (Set s2) {
		
		Set intersect = new Set();

		Node n = _head;

		while (n != null) {
			if (s2.member(n.data)) intersect.insert(n.data);
			n = n.next;
		}

		return intersect;

	}

	public Set difference (Set s2) {
		Set diff = new Set();

		Node n = _head;
		while (n != null) {
			if (!s2.member(n.data)) diff.insert(n.data);
			n = n.next;
		}

		return diff;
	}

	public boolean equals(Object o) {
		// If the object is compared with itself then return true
		if (o == this) return true;

		/* Check if o is an instance of Set or not
	      "null instanceof [type]" also returns false */
		if (!(o instanceof Set)) return false;

		// typecast o to Set so that we can compare it to this
		Set s2 = (Set) o;

		//check that the two sets are the same length
		if(this.length() != s2.length()) return false;

		//loop through the current set and check that every element is an element of the other set
		Node n = _head;
		while(n != null) {
			if(!s2.member(n.data)) return false;
			n = n.next;
		}
		return true;
	}

}
