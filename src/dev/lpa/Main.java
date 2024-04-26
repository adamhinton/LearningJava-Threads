package dev.lpa;

public class Main {
    public static void main(String[] args) {

        // Threads are fundamental building blocks of concurrency
        // Perform mult tasks simul within a single process
        // We've been using a thread - the main thread - all along. JVM fires this up every time we use main method

        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getClass().getName());

        System.out.println(currentThread);
        printThreadState(currentThread);

        currentThread.setName("MainGuy");
        // Highest priority is 10. Scale of 1-10
        currentThread.setPriority(Thread.MAX_PRIORITY);
        printThreadState(currentThread);

        // name
        // group ThreadGroup
        // priority int
        // target Runnable (run())
//        private tid int
        // run()
        // start()

    }

    public static void printThreadState (Thread thread){
        System.out.println("----------------");
        System.out.println("Thread ID: " + thread.getId());
        System.out.println("Thread Name: " + thread.getName());
        System.out.println("Thread Priority: " + thread.getPriority());
        System.out.println("Thread State: " + thread.getState());
        System.out.println("Thread Group: " + thread.getThreadGroup());
        System.out.println("Thread Is Alive: " + thread.isAlive());
        System.out.println("----------------");

    }

}