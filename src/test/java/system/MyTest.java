package system;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class MyTest {
	/*
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
	 * Tests the "Add" method with a  list with on element
	 * element.
	 * 
	 * @see PhonyList#add(Object)
	 * @type Functional
	 * @input list=[]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void TestAdd1(){
		PhonyList<Integer> list =list();
		list.add(1);
		assertTrue(list.contains(1));
	}
	
	/**
	 * Tests the "Add" method with a  list with zero elements
	 * element.
	 * 
	 * @see PhonyList#add(Object)
	 * @type Functional
	 * @input list=[]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void Add2(){
		PhonyList<Integer> list =list();
		list.add(1);
		list.add(2);
		assertTrue(list.contains(2) && list.contains(1));
	}
	/**
	 * Tests the "Size" method with a  list with two elements
	 * element.
	 * 
	 * @see PhonyList#size(Object)
	 * @type Functional
	 * @input list=[]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void sizeTest(){
		PhonyList<Integer> list =list();
		assertTrue(list.size()==0);
	}
	/**
	 * Tests the "Size" method with a  list with two elements
	 * element.
	 * 
	 * @see PhonyList#size(Object)
	 * @type Functional
	 * @input list=[]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void sizeTest2(){
		PhonyList<Integer> list =list();
		list.add(1);
		list.add(2);
		assertTrue(list.size()==2);
	}
	
	/**
	 * Tests the "remove" method with a  list with five elements
	 * element.
	 * 
	 * @see PhonyList#revove(Object)
	 * @type Functional
	 * @input list=[]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void removeTest(){
		PhonyList<Integer> list =list(1,2,3,4,5);
		list.remove(1);
		assertTrue(list.size()==4);
	}
	/**
	 * Tests the "remove" method with a  list with five elements
	 * element.
	 * 
	 * @see PhonyList#revove(Object)
	 * @type Functional
	 * @input list=[]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void removeTest2(){
		PhonyList<Integer> list =list(1);
		list.remove(1);
		assertTrue(list.size()==0);
	}
	
	/**
	 * Tests the "remove" method with a  list with two elements
	 * element.
	 * 
	 * @see PhonyList#revove(Object)
	 * @type Functional
	 * @input list=[1,null]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void removeTest3(){
		PhonyList<Integer> list = list(1,null);
		list.remove(2);
		assertTrue(list.size()==2);
	}
	
	/**
	 * Tests the "remove" method with a  list with two elements
	 * element.
	 * 
	 * @see PhonyList#revove(Object)
	 * @type Functional
	 * @input list=[]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void removeTest4(){
		PhonyList<Integer> list = list(1,null);
		list.remove(null);
		assertTrue(list.size()==1);
	}

	/**
	 * Tests the "removeAll" method with a  list with one elements
	 * element.
	 * 
	 * @see PhonyList#removeAll(Object)
	 * @type Functional
	 * @input list=[]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void removeAllTest(){
		PhonyList<Integer> list = list(1,2,3,4);
		List maListe=new LinkedList();
		maListe.add(1);
		maListe.add(2);
		Collection C = maListe;
		list.removeAll(C);
		assertTrue(list.size()==2);
	}
	
	/**
	 * Tests the "removeRange" method with a  list with 3 elements
	 * by using removeRageAux .
	 * 
	 * @see PhonyList#removeRange(Object)
	 * @type Functional
	 * @input list=[]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void removeRangeTest(){
		PhonyList<Integer> list = list(1,2,3);
		list.romoveRangeAux(1,2);
		assertTrue(list.size()==2);
	}
	
	/**
	 * Tests the "removeAll" method with a  list with one elements
	 * element.
	 * 
	 * @see PhonyList#removeAll(Object)
	 * @type Functional
	 * @input list=[]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void addAllTest(){
		PhonyList<Integer> list = list(3);
		List maListe=new LinkedList();
		maListe.add(1);
		maListe.add(2);
		Collection C = maListe;
		list.addAll(1,C);
		assertTrue(list.size()==3);
	}
	
	/**
	 * Tests the "addAll" method with a  list with one elements
	 * element.
	 * 
	 * @see PhonyList#addAll(Object)
	 * @type Functional
	 * @input list=[]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void addAllTest2(){
		PhonyList<Integer> list = list(4,6,5,7);
		Collection  maListe=new LinkedList();
		maListe.add(1);
		maListe.add(2);
		list.addAll(0,maListe);
		assertTrue(list.size()==6);
	}
	
	/**
	 * Tests the "Empty" method with a  list with zero elements
	 * element.
	 * 
	 * @see PhonyList#revove(Object)
	 * @type Functional
	 * @input list=[]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void EmptyTest1(){
		PhonyList<Integer> list =list();
		assertTrue(list.isEmpty());
	}
	/**
	 * Tests the "empty" method with a  list with two elements
	 * element.
	 * 
	 * @see PhonyList#revove(Object)
	 * @type Functional
	 * @input list=[]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void EmptyTest2(){
		PhonyList<Integer> list =list();
		list.add(1);
		list.add(2);
		assertTrue(!list.isEmpty());
	}
	/**
	 * Tests the "Get" method with a  list with two elements
	 * element.
	 * 
	 * @see PhonyList#Get(Object)
	 * @type Functional
	 * @input list=[1,2]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void GetTest(){
		PhonyList<Integer> list =list();
		list.add(1);
		list.add(2);
		assertTrue(list.get(0)==1);
	}
	/**
	 * Tests the "Set" method with a  list with one elements
	 * element.
	 * 
	 * @see PhonyList#Set(Object,Object)
	 * @type Functional
	 * @input list=[1,2]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void SetTest(){
		PhonyList<Integer> list =list();
		list.add(1);
		list.add(2);
		list.set(1, 3);
		assertTrue(list.get(1)==3);
	}
	/**
	 * Tests the "equals" method with a  list with five elements
	 * element.
	 * 
	 * @see PhonyList#equals(Object)
	 * @type Functional
	 * @input list=[]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void EqualsTest1(){
		PhonyList<Integer> list =list(1,2,3,4,5);
		PhonyList<Integer> list2=list();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		assertTrue(!list.equals(list2));
	}
	/**
	 * Tests the "equals" method with a  list with five elements
	 * element.
	 * 
	 * @see PhonyList#equals(Object)
	 * @type Functional
	 * @input list=[]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void EqualsTest2(){
		PhonyList<Integer> list =list(1,2,3,4,5);
		PhonyList<Integer> list2=list();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		assertTrue(list.equals(list2));
	}
	/**
	 * Tests the "equals" method with a  list with five elements
	 * element.
	 * 
	 * @see PhonyList#equals(Object)
	 * @type Functional
	 * @input list=[]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void EqualsTest3(){
		PhonyList<Integer> list =list(1,3,2,4,5);
		PhonyList<Integer> list2=list();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		assertTrue(!list.equals(list2));
	}
	
	/**
	 * Tests the "equals" method with a  list with one elements
	 * element.
	 * 
	 * @see PhonyList#equals(Object)
	 * @type Functional
	 * @input list=[]
	 * @oracle It must return true.
	 * @passed Yes
	 */
	@Test
	public void EqualsTest4(){
		PhonyList<Integer> list =list(1,3,2,4,5);
		PhonyList<Integer> list2=list;
		assertTrue(list.equals(list2));
	}
	
}

