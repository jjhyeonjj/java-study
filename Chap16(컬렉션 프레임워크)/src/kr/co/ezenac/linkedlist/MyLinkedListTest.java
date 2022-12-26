package kr.co.ezenac.linkedlist;

public class MyLinkedListTest {

	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();
		list.addElement("A");
		list.addElement("B");
		list.addElement("C");
		list.printAll();
		
		list.insertElement(2, "D");
		list.printAll();
		
		list.removeElement(2);
		list.printAll();
		
		list.removeElement(2);
		list.printAll();
		
		list.insertElement(0, "A-1");
		list.printAll();
		
		System.out.println(list.getSize());
		list.removeall();
		list.printAll();
		
		list.addElement("보영");
		list.addElement("봉봉");
		list.printAll();
		list.insertElement(1, "곤주");
		list.printAll(); 
	}
}
