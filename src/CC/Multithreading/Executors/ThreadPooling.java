package CC.Multithreading.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPooling {
/*
    Thread Pool = a group of reusable threads
👉 Instead of creating new thread every time, we reuse existing threads

Thread Pooling means managing a fixed number of threads and assigning tasks to them

Thread Pooling means managing a fixed number of threads and assigning tasks to them

Without Thread Pool
Every task → hire new worker
Work done → worker leaves
👉 Slow + costly 😓

With Thread Pool
You have fixed workers (say 5)
Tasks come → workers pick tasks
👉 Fast + efficient 🚀

Why Not Create Threads Every Time?
Creating threads is expensive:
Memory cost 💾
CPU overhead ⚙️
Time to create/destroy ⏳

✅ Benefits of Thread Pool
✔ Better performance
✔ Reuse threads
✔ Control number of threads
✔ Avoid system overload
Resource management




*/
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 6; i++) {
            int taskId = i;

            executor.execute(() -> {
                System.out.println("Executing task " + taskId +
                        " by " + Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            });
        }

        executor.shutdown(); // imp

     /*
        What Happens Here?
                Pool size = 3 threads
                Tasks = 6
👉 First 3 tasks run immediately
👉 Next 3 wait in queue


Thread Pool = “Fixed workers handling unlimited tasks”

👉 Thread pooling improves:
Performance 🚀
Resource usage 💾
Scalability 📈

        */
    }
}
