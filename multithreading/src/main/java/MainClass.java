package main.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import main.java.threadpool.Processor;

/*
 * Thread pool saved the overhead of creating and recycling the threads. As soon as any thread gets free, it starts processing another execution if any is left in the pool.*/

public class MainClass {

	public static void main(String args[]){
		
		ExecutorService exService = Executors.newFixedThreadPool(4);
		for(int i = 0; i<5; i++) {
			exService.submit(new Processor(i));
		}
		
		
		//wait to complete the thread and then terminate.
		exService.shutdown();
		
		System.out.println("All tasks submitted");
		
		try {
			exService.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
