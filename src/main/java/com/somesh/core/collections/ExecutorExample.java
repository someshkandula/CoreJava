package com.somesh.core.collections;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample {

	public ExecutorExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(4);
		ExecutorCompletionService<String> pool = new ExecutorCompletionService<>(executor);
		Future<String> contentsFuture = null;
		for (int i = 0; i < 10; i++) {
			pool.submit(new SimpleThread());
		}
		
		for (int i = 0; i < 10; i++) {
			try {
				String batchStatus = pool.take().get();
				System.out.println("batchStatus: "+batchStatus);
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(executor != null)
			executor.shutdown();
		
	}
	
	

}

class SimpleThread implements Callable<String>{

	@Override
	public String call() throws Exception {
		System.out.println("Run method: "+Thread.currentThread().getName());
		return "Done: "+Thread.currentThread().getName();
	}
	
}
