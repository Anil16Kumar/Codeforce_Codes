package CC.Multithreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Fairnessoflocks {
    // Change this to true to see FAIR behavior
    // Change this to false to see UNFAIR behavior
    private static final Lock lock = new ReentrantLock(true);

    public static void main(String[] args) {

        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();

            System.out.println(threadName + " is trying to acquire lock");

            lock.lock();
            try {
                System.out.println(threadName + " got the lock");

                // Simulate some work
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(threadName + " released the lock");
                lock.unlock();
            }
        };

        // Create multiple threads
        for (int i = 1; i <= 5; i++) {
            new Thread(task, "Thread: " + i).start();
        }

        /*
        Case 1: Fair Lock
new ReentrantLock(true);
Output (mostly in order):
Thread-1 got the lock
Thread-2 got the lock
Thread-3 got the lock
Thread-4 got the lock
Thread-5 got the lock
✔ Follows queue order (FIFO)

        Case 2: Unfair Lock
new ReentrantLock(false);
Output (random order):
Thread-3 got the lock
Thread-1 got the lock
Thread-5 got the lock
Thread-2 got the lock
❌ Order is NOT guaranteed

        */


    }
}

/*
What is Fairness in Locks?
Fairness means: who gets the lock next? Fairness controls who gets the lock next, not how locking works.

Fair Lock (FIFO – First Come First Serve)
People stand in a line
Whoever comes first → gets ATM first
👉 No cheating
👉 No skipping
✔ This is a fair lock

Unfair Lock (Default behavior)
No strict queue
A new person comes and quickly uses ATM before others
👉 Line exists, but not strictly followed
✔ This is an unfair lock

In Java (ReentrantLock)
When you create lock:
❌ Unfair Lock (default)
Lock lock = new ReentrantLock();
👉 Faster
👉 But some threads may wait longer (starvation)


Fair Lock
Lock lock = new ReentrantLock(true);
👉 Threads get lock in order they requested it

Why Unfair is Faster?
Because:
👉 If lock becomes free
👉 Any thread can grab it immediately
(No need to check queue)

What is Starvation?
👉 One thread keeps waiting because others keep jumping ahead
Example:
Thread A waiting
Thread B keeps getting lock again and again
👉 A never gets chance



*/
