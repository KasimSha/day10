package day10.threads;

public class ThreadsPractice3 {
	public static void main(String[] args) {
		
		Runnable r1=() -> {
			Thread.currentThread().setName("Thread 1");
			
			try {
				Thread.sleep(10000);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		};
		
		Thread th=new Thread(r1);
		
		th.start();
		
		
		//main
		System.out.println(Thread.currentThread().getName());
	}

}
