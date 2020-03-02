package main.java.threadpool;

/*
 * Thread pool saved the overhead of creating and recycling the threads. As soon as any thread gets free, it starts processing another execution if any is left in the pool.*/

public class Processor implements Runnable {

	private int i;

	public Processor(int i) {
		this.i = i;
	}

	public void run() {
		System.out.println("Completed" + i);

	}

}
