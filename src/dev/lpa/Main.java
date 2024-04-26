package dev.lpa;

public class Main {
    public static void main(String[] args) {

        // Threads are fundamental building blocks of concurrency
        // Perform mult tasks simul within a single process
        // We've been using a thread - the main thread - all along. JVM fires this up every time we use main method

        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getClass().getName());


        // name
        // group ThreadGroup
        // priority int
        // target Runnable (run())
//        private tid int
        // run()
        // start()

    }
}