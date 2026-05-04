package CC.Multithreading.Locks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class ReadWriteLockExample {
    private static final ReadWriteLock lock = new ReentrantReadWriteLock();
    private static int value = 0;

   /*
   A ReadWriteLock allows:
✅ Multiple threads to read at the same time
❌ Only one thread to write at a time
❌ No reading when writing is happening


Real-Life Analogy (Library)
 Readers (Students)
Many students can read the same book together
No problem 👍
 Writer (Editor)
Only one editor can modify the book
While editing → no one can read ❌

Rules (Very Important)
✅ Multiple readers allowed
❌ Only one writer allowed
❌ Writer blocks readers
❌ Readers block writer (until all readers finish)

ReadWriteLock improves performance by allowing parallel reads but controlled writes
*/

    public static void main(String[] args) {

        // Reader Task
        Runnable readTask = () -> {
            lock.readLock().lock();
            try {
                System.out.println(Thread.currentThread().getName() +
                        " reading value: " + value);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.readLock().unlock();
            }
        };

        // Writer Task
        Runnable writeTask = () -> {
            lock.writeLock().lock();
            try {
                value++;
                System.out.println(Thread.currentThread().getName() +
                        " writing value: " + value);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.writeLock().unlock();
            }
        };

        // Create multiple readers
        for (int i = 1; i <= 3; i++) {
            new Thread(readTask, "Reader-" + i).start();
        }

        // Create writers
        for (int i = 1; i <= 2; i++) {
            new Thread(writeTask, "Writer-" + i).start();
        }
    }
}
