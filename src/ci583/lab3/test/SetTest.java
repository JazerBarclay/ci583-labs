package ci583.lab3.test;

import ci583.lab3.lists.Set;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetTest {

	@Test
	public void testInsert() {
		Set s = new Set();
		s.insert(1);
		assertTrue(s.member(1));
		s.insert(10);
		s.insert(11);
		assertTrue(s.member(10));
		assertTrue(s.member(11));
	}

	@Test
	public void testUnion() {
		Set s1 = new Set(), s2 = new Set(), union = new Set();
		
		s1.insert(1);
		s1.insert(2);
		s1.insert(3);
		
		s2.insert(2);
		s2.insert(3);
		s2.insert(4);
		
		union = s1.union(s2);

		assertTrue(union.member(1));
		assertTrue(union.member(2));
		assertTrue(union.member(3));
		assertTrue(union.member(4));
	}

	@Test
	public void testIntersection() {
		Set s1 = new Set(), s2 = new Set(), intersect = new Set();

		s1.insert(1);
		s1.insert(3);
		s1.insert(5);
		
		s2.insert(2);
		s2.insert(3);
		s2.insert(4);
		s2.insert(5);
		
		intersect = s1.intersection(s2);

		assertFalse(intersect.member(1));
		assertFalse(intersect.member(2));
		assertTrue(intersect.member(3));
		assertFalse(intersect.member(4));
		assertTrue(intersect.member(5));
	}

	@Test
	public void testDifference() {
		Set s1 = new Set(), s2 = new Set(), diff;
		
		s1.insert(1);
		s1.insert(3);
		s1.insert(5);
		
		s2.insert(2);
		s2.insert(3);
		s2.insert(4);
		s2.insert(5);
		
		diff = s1.difference(s2);

		assertTrue(diff.member(1));
		assertFalse(diff.member(2));
		assertFalse(diff.member(3));
		assertFalse(diff.member(4));
		assertFalse(diff.member(5));
		
		diff = s2.difference(s1);

		assertFalse(diff.member(1));
		assertTrue(diff.member(2));
		assertFalse(diff.member(3));
		assertTrue(diff.member(4));
		assertFalse(diff.member(5));
	}

	@Test
	public void testDupes() {
		Set s = new Set();
		s.insert(1);
		s.insert(1);
		assertEquals(s.length(), 1);
	}
	
}