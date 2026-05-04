package CC.Multithreading.ThreadSafty;

public class ThreadSaftyExample {
    public static void main(String[] args) {
        /*
        What is Thread-Safe?
👉 Thread-safe = safe to use by multiple threads at the same time without problems
✔ No incorrect data
✔ No race condition
✔ No unexpected behavior

If multiple threads access a resource and the result is always correct → it is thread-safe

Real-Life Analogy (Bank Account 💰)
❌ Not Thread-Safe
Balance = 1000
Thread A withdraws 500
Thread B withdraws 500

👉 Both read 1000 at same time
👉 Final balance becomes WRONG ❌

✅ Thread-Safe
Only one thread updates at a time

👉 Final balance = 0 ✔ correct

What Problem Happens? (Race Condition)
👉 Two threads race to update same data
Thread A → read → modify → write
Thread B → read → modify → write
👉 Result becomes unpredictable

How to Make Code Thread-Safe
✅ 1. Using synchronized
public synchronized void increment() {
    count++;
}
👉 Only one thread allowed at a time

✅ 2. Using Locks (ReentrantLock)
lock.lock();
try {
    count++;
} finally {
    lock.unlock();
}

✅ 3. Using Atomic Classes
import java.util.concurrent.atomic.AtomicInteger;
AtomicInteger count = new AtomicInteger(0);
count.incrementAndGet();
👉 No locking needed ✔

✅ 4. Using Immutable Objects
String str = "hello";
👉 Cannot change → always safe ✔

Thread-safe = “No matter how many threads run, result is always correct"

*/
    }
}
