package com.example.demo.singleton;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HoangSingleton {
    private static HoangSingleton hoangSingleton;
    private int number;

    private HoangSingleton(int number) {
        this.number=number;
    }

    public static HoangSingleton getInstance() {
        if (hoangSingleton == null) {
            Lock lock = new ReentrantLock();
            lock.lock();
            if(hoangSingleton==null) {
                int x = new Random().nextInt(4) + 1;
                hoangSingleton = new HoangSingleton(x);
            }
            lock.unlock();
        }
        return hoangSingleton;
    }

    public int getNumber() {
        return number;
    }
}
