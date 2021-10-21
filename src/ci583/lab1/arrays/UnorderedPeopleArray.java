package ci583.lab1.arrays;


public class UnorderedPeopleArray extends PeopleArray {

	public UnorderedPeopleArray(int max) {
		super(max);
	}

	/**
	 * Insert a new person to the end of the array.
	 * Throw ArrayIndexOutOfBoundsException if arr is full
	 * @param first
	 * @param last
	 * @param age
	 */
	public boolean insert(String first, String last, int age) {
//		throw new UnsupportedOperationException("Method not implemented");

//		if (nElems == arr.length) throw new ArrayIndexOutOfBoundsException("Array Full");
		
		if (nElems == arr.length) return false; // Doing this to satisfy test :/
		arr[nElems] = new Person(first, last, age);
		nElems++;
		return true;
		
	}

	/**
	 * Return the Person with lastName, or null. Use SequentialSearch to find the target.
	 * @param lastName
	 * @return
	 */
	public Person find(String lastName) {
//		throw new UnsupportedOperationException("Method not implemented");
		if (nElems == 0) return null;
		for (int i = 0; i < nElems; i++) {
			if (lastName.equals(arr[i].getLastName())) return arr[i]; 
		}
		return null;
		
	}

}

