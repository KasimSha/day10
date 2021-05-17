package day10.threads;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
public class ThreadsPractice6 {
	public static void main(String[] args) throws Exception{
		
		Set<String> list=new CopyOnWriteArraySet<>();
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
				
				list.add("Siraj");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		};
		
		Executors.newSingleThreadExecutor().submit(r1);
		
		//main
		System.out.println(Thread.currentThread().getName());
		System.out.println("main "+list);
		
		for(String item : list) {
			System.out.println(item);
			Thread.sleep(5000);
		}
	}

}
