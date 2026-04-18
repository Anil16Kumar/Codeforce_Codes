package CC.Multithreading.Deadlock;


public class DeadlockExample {
    /*
    Deadlock?
 👉 Deadlock = when two or more threads are stuck forever waiting for each other
None of them can move forward
Program gets stuck/hangs

Two cars on a narrow road
Car A is waiting for Car B to move
Car B is waiting for Car A to move
👉 Both are stuck
👉 No one moves
that is: Deadlock

*/
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 acquired lock1");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (lock2) {
                    System.out.println("Thread 1 acquired lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 acquired lock2");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (lock1) {
                    System.out.println("Thread 2 acquired lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }

    /*

    What Happens Here?
    Step-by-step:
    Thread 1 → takes lock1
    Thread 2 → takes lock2
    Now:
    Thread 1 → waiting for lock2
    Thread 2 → waiting for lock1
👉 Both waiting forever

Deadlock happens when:
✔ Threads are waiting on each other
✔ No one can proceed
✔ System gets stuck forever


Conditions for Deadlock (Important for Interview)
All must be true:
1. 🔒 Mutual Exclusion
Only one thread can use a resource at a time

2. ✋ Hold and Wait
Thread holds one lock and waits for another

3. 🚫 No Preemption
Lock cannot be forcibly taken away

4. 🔁 Circular Wait
Thread A → waiting for B
Thread B → waiting for A
👉 This creates cycle 🔁


how to resolve (fix) deadlock:
1. Always Follow Lock Order (BEST METHOD)
👉 All threads should take locks in the same order
Wrong (causes deadlock)
Thread 1: lock1 → lock2
Thread 2: lock2 → lock1
Correct (no deadlock)
Thread 1: lock1 → lock2
Thread 2: lock1 → lock2
✔ No circular waiting
✔ Deadlock gone

2. Use tryLock() (Avoid waiting forever)
👉 Try to get lock, if not available → skip or retry
if(lock1.tryLock()) {
    try {
        if(lock2.tryLock()) {
            try {
                // safe work
            } finally {
                lock2.unlock();
            }
        }
    } finally {
        lock1.unlock();
    }
}

3. Use Timeout Lock
👉 Wait only for limited time
if(lock.tryLock(2, java.util.concurrent.TimeUnit.SECONDS)) {
    try {
        // work
    } finally {
        lock.unlock();
    }
}
✔ Prevents permanent blocking

4. Reduce Nested Locks
❌ Problem:
Lock inside lock → risky
✅ Solution:
👉 Avoid multiple locks if possible

5. Use Single Lock (Simplify)
Instead of:
lock1 + lock2
👉 Use:
one common lock
✔ No circular dependency



*/
}
