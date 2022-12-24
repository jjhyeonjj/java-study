package kr.co.ezenac.interfacee7;

public class MyBookshelf extends Bookshelf implements Queue {

	public void enQueue(String title) {
		bookshelf.add(title);
	}

	public String deQueue() {
		
		return (String) bookshelf.remove(0);
	}

	
}
