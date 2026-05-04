package CC.Multithreading.Deadlock;

public class DeadlockFixed {

    /*

    Current situation:
Thread 1 → lock1 → lock2
Thread 2 → lock2 → lock1
👉 Different order = 🔁 circular wait = 💀 deadlock

BEST FIX: Use Same Lock Order
👉 Both threads should acquire locks in same order

Why This Works
Now both threads follow:
👉 lock1 → lock2
So:
Thread 1 gets lock1
Thread 2 waits for lock1 (instead of taking lock2)

👉 No circular dependency
👉 No deadlock
------------------------
Simple Analogy
Earlier:
Person A: Room 1 → Room 2
Person B: Room 2 → Room 1
💀 Clash → deadlock

Now:
Both: Room 1 → Room 2
✔ One waits, other finishes
✔ No deadlock

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
            synchronized (lock1) {  // ✅ SAME ORDER
                System.out.println("Thread 2 acquired lock1");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (lock2) {
                    System.out.println("Thread 2 acquired lock2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
