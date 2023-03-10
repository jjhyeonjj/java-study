package kr.co.ezenac.thread01;

public class RunnableInterface {

	public static void main(String[] args) {
		
		Runnable task = () -> {							// Runnable 변수에 람다식을 대입.
			try {
				Thread.sleep(3000);						// 스레드 실행이 3초 동안 일시 정지했다가 다시 진행됨.
			} catch (InterruptedException e) {}
			
			int sum = 0;
			for(int i=1; i<=10; i++)
				sum += i;
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + sum);
		};
		
		Thread thread = new Thread(task);
		thread.start();
		
		System.out.println("main : " + Thread.currentThread().getName());
	}
}
