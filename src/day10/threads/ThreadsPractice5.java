package day10.threads;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
public class ThreadsPractice5 {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("Kasim");
		list.add("karim");
		list.add("Roshan");
		list.add("Ameer");
		
		Runnable r1=() -> {
			Thread.currentThread().setName("Thread 1");
			
			try {
				Thread.sleep(5000);
				System.out.println(Thread.currentThread().getName());
				
				System.out.println("child "+list);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		};
		
		Executors.newSingleThreadExecutor().submit(r1);
		
		//main
		System.out.println(Thread.currentThread().getName());
		System.out.println("main"+list);
	}

}
