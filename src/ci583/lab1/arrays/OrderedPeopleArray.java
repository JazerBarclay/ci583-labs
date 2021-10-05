package ci583.lab1.arrays;

public class OrderedPeopleArray extends PeopleArray {
	
	public OrderedPeopleArray(int max) {
		super(max);
	}

	/**
	 * Insert a new person maintaining the order of the data.
	 * Throw ArrayIndexOutOfBoundsException if arr is full
	 * @param first
	 * @param last
	 * @param age
	 */
	public boolean insert(String first, String last, int age) {
//		throw new UnsupportedOperationException("Method not implemented");
		
//		if (nElems == arr.length) throw new ArrayIndexOutOfBoundsException("Array Full");
		if (nElems == arr.length) return false; // Doing this to satisfy test :/
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = new Person(first, last, age);
				break;
			} else if (arr[i].getLastName().compareTo(last) > 0) {
				for (int j = nElems-1; j >= i; j--) arr[j+1] = arr[j];
				arr[i] = new Person(first, last, age);
				break;
			}
		}
		
		nElems++;
		return true;
	
	}

	/**
	 * Return the Person with lastName, or null. Use BinarySearch to to do the finding.
	 * @param lastName
	 * @return
	 */
	public Person find(String lastName) {
//		throw new UnsupportedOperationException("Method not implemented");
		
		int start = 0, end = nElems, mid;
		while (start != end) {
			mid = (start + end) / 2;
			int comp = arr[mid].getLastName().compareTo(lastName);
			if (comp < 0) start = mid+1;
			else if (comp >0) end = mid-1;
			else return arr[mid];
		}
		
		return null;
		
	}

}

