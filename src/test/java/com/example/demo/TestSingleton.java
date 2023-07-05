package com.example.demo;

import com.example.demo.singleton.HoangSingleton;
import junit.framework.TestCase;

public class TestSingleton extends TestCase {

    public void testThreads() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1: "+HoangSingleton.getInstance().getNumber());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2: "+HoangSingleton.getInstance().getNumber());
            }
        });

        thread1.start();
        thread2.start();
    }
}
