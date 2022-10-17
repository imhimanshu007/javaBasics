package org.example.concurrency;

public class MultiThreadPoint {
    //Print 1-100 3 times in 3 parallel threads

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        };

        //Runnable using Lamda
        Runnable r1 = () -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.start();
        t2.start();
        t3.start();
    }

}
