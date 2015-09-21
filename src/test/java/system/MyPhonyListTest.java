package system;

import org.junit.Test;

import static org.junit.Assert.*;


public class MyPhonyListTest {

	/**
	 * Helper method to create lists.
	 */
	private PhonyList<Integer> list(Integer... content) {
		PhonyList<Integer> list = new PhonyList<>();
		for (Integer i : content)
			list.add(i);
		return list;
	}
	
	
	/*
	 * Helper method to create a big list [1,2,3,...,10000]
	 */
	private PhonyList<Integer> thousandElementsList() {
		PhonyList<Integer> thousandElementsList = new PhonyList<>();
		for (int i = 1; i <= 10000; i++) {
			thousandElementsList.add(i);
		}
		return thousandElementsList;
	}
	
	
	/**
	 * Tests the "add" method: adding one object.
	 * 
	 * @see PhonyList#add(Object)
	 * @type Functional
	 * @input [1]
	 * @oracle The list must contains the added element.
	 * @passed Yes
	 */
	@Test
	public void add_OneElement() {
		PhonyList<Object> testedList = new PhonyList<>();
		testedList.add("A");
		assertTrue(testedList.contains("A"));
	}

	/**
	 * Tests the "add" method: adding two objects.
	 * 
	 * @see PhonyList#add(Object)
	 * @type Functional
	 * @input [2]
	 * @oracle The list must contains the added elements.
	 * @passed Yes
	 */
	@Test
	public void add_TwoElements() {
		PhonyList<Object> testedList = new PhonyList<>();
		testedList.add("A");
		testedList.add("B");
		assertTrue(testedList.contains("A") && testedList.contains("B") );
	}
	
	/**
	 * Tests the "contains" method with an empty list.
	 * 
	 * @see PhonyList#contains(Object)
	 * @type Functional
	 * @input []
	 * @oracle the contains method should return false.
	 * @passed Yes
	 */
	@Test
	public void containsEmpty() {
		PhonyList<Object> testedList = new PhonyList<>();
		assertFalse(testedList.contains("X"));
	}
	
	/**
	 * Tests the "contains" method with an one element list.
	 * 
	 * @see PhonyList#contains(Object)
	 * @type Functional
	 * @input [1]
	 * @oracle The list must contains the added element.
	 * @passed Yes
	 */
	@Test
	public void containsOneElement() {
		PhonyList<Object> testedList = new PhonyList<>();
		testedList.add("A");
		assertTrue(testedList.contains("A"));
	}

	
	/** Tests the "size" method with an empty list.
	 * 
	 * @see PhonyList#size()
	 * @type Functional
	 * @input []
	 * @oracle The size method should return 0.
	 * @passed Yes
	 */
	@Test
	public void sizeOnEmptyList() {
		PhonyList<Object> testedList = new PhonyList<>();
		assertTrue(testedList.size() == 0);
	}

	/** Tests the "size" method with a five element list.
	 * 
	 * @see PhonyList#size()
	 * @type Functional
	 * @input [5, 6, 42, 0, 5]
	 * @oracle The size method should return 5.
	 * @passed Yes
	 */
	@Test
	public void sizeOnFiveElementList() {
		PhonyList<Integer> testedList = list(5, 6, 42, 0, 5);
		assertTrue(testedList.size() == 5);
	}

	/** Tests the "size" method with a thousand element list.
	 * 
	 * @see PhonyList#size()
	 * @type Functional
	 * @input []
	 * @oracle The size method should return 10 000.
	 * @passed Yes
	 */
	@Test
	public void sizeOnThousandElementList() {
		PhonyList<Integer> testedList = thousandElementsList();
		assertTrue(testedList.size() == 10000);
	}

	
	
}
