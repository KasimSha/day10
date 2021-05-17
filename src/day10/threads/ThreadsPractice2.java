package day10.threads;

public class ThreadsPractice2 {
	public static void main(String[] args) {
		
		Runnable r1=() -> {
			Thread.currentThread().setName("Thread 1");
			System.out.println(Thread.currentThread().getName());
		};
		
		Thread th=new Thread(r1);
		
		th.start();
		
		
		//main
		System.out.println(Thread.currentThread().getName());
	}

}
