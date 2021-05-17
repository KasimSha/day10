package day10.threads;
import java.util.concurrent.Executors;
public class ThreadsPractice4 {
	public static void main(String[] args) {
		
		Runnable r1=() -> {
			Thread.currentThread().setName("Thread 1");
			
			try {
				Thread.sleep(5000);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		};
		
		Executors.newSingleThreadExecutor().submit(r1);
		
		//main
		System.out.println(Thread.currentThread().getName());
	}

}
