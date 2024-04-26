//Jacob Spaide
//Sin 13
//Race Conditions

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Sin13
{
    private static int counter = 0;
    //mutual exclusion lock
    private static final Lock mutex = new ReentrantLock();

    public static void main(String[] args) 
    {
        //creating two threads
        Thread thread1 = new Thread(new IncrementTask());
        Thread thread2 = new Thread(new IncrementTask());

        thread1.start();
        thread2.start();

        try 
        {
            thread1.join();
            thread2.join();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + counter);
    }

    private static class IncrementTask implements Runnable 
    {
        public void run() 
        {
            //each thread count to 1000
            for (int i = 0; i < 1000; i++) 
            {
                incrementCounter();
            }
        }

        private void incrementCounter() 
        {
            mutex.lock();
            try 
            {
                counter++;
            } 
            finally 
            {
                mutex.unlock();
            }
        }
    }
}
