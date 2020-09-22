package com.in28minutes.threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "\nHello " + name;
	}

}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		Future<String> welcomeFuture = executorService.submit(new CallableTask("in28Minutes"));

		System.out.print("\nnew CallableTask(\"in28Minutes\") executed");

		String welcomeMessage = welcomeFuture.get();

		System.out.print(welcomeMessage);

		System.out.print("\nMain Completed");
		executorService.shutdown();
	}

}
