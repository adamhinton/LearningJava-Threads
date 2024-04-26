package dev.lpa;

public class CustomThread extends Thread {

    @Override
    public void run() {

        for (int i=1; i<=5; i++){
            System.out.println(" 1 ");
            try{
                // Tells the current thread to sleep (aka do nothing) for x ms
                Thread.sleep(500); // Add 1-sec delay bw each count
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
