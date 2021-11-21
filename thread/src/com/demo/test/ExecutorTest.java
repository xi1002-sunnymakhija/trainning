package com.demo.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorTest {
    public static void main(String[] a)
    {

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Future<String> result = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Hello";
            }
        });

    }
}
