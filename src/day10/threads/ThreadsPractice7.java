package day10.threads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
public class ThreadsPractice7 {
	public static void main(String[] args) throws Exception{
		
		Map<String,String> map=new ConcurrentHashMap<>();
		map.put("a","Kasim");
		map.put("b","karim");
		map.put("c","Roshan");
		map.put("d","Ameer");
		
		Runnable r1=() -> {
			Thread.currentThread().setName("Thread 1");
			
			try {
				Thread.sleep(5000);
				System.out.println(Thread.currentThread().getName());
				System.out.println("child "+map);
				
				map.put("e", "Siraj");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		};
		
		Executors.newSingleThreadExecutor().submit(r1);
		
		//main
		System.out.println(Thread.currentThread().getName());
		System.out.println("main "+map);
		
		for(Map.Entry<String,String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " "+entry.getValue());
			
			Thread.sleep(5000);
		}
	}

}
