package CC.Multithreading.Executors;

public class ExecutorFramework {

    //Executor Framework = a system to manage threads and tasks efficiently

    /*
    Instead of:
            new Thread(...).start();
   we use:
            executor.execute(task);

            Executor Framework separates:
            Task submission ✅
            Thread management ✅

            Without Executor
we hire worker yourself every time
Manage everything manually 😓
✅ With Executor
we give task to manager
Manager assigns it to workers
👉 we don’t worry about threads 👍

Executor Framework three core interfaces hai:
1. Executor
2. ExecutorService
3. ScheduledExecutorService

Executor Framework = task manager system
we:
Give tasks
Framework handles threads

Real-Life Analogy (Company)
👨‍💼 Executor = worker
🧑‍💼 ExecutorService = manager
⏰ ScheduledExecutorService = manager with calendar
---------------------------------------------------------
Executor (Basic Level)
👉 What it does?
👉 Just runs a task
🔹 Simple Meaning:
👉 “Take this task and run it”

public static void main(String[] args) {
        Executor executor = command -> new Thread(command).start();
        executor.execute(() -> {
            System.out.println("Task executed");
        });
    }

 Only executes task
❌ No control
❌ No result
❌ No shutdown
🎯 One Line
👉 Executor = just run task

-------------------------------------------------
ExecutorService (Most Important 🔥)
👉 What it does?
👉 Full control over tasks + threads
🔹 Features:
✔ Submit tasks
✔ Get result
✔ Shutdown threads
✔ Manage thread pool

public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            System.out.println("Task running: " + Thread.currentThread().getName());
        });
        executor.shutdown();
    }

Key Point
✔ Can return result (Future)
✔ Can stop threads
✔ Most commonly used
🎯 One Line
👉 ExecutorService = smart manager of threads

-----------------------------------------------------------

ScheduledExecutorService (Time-based ⏰)
👉 What it does?
👉 Runs tasks after delay or repeatedly
🔹 Use cases:
✔ Run after 5 sec
✔ Run every 10 sec
✔ Background jobs

public static void main(String[] args) {
        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(1);
        scheduler.schedule(() -> {
            System.out.println("Task after 3 seconds");
        }, 3, TimeUnit.SECONDS);
        scheduler.shutdown();
    }

Key Point
✔ Time-based execution
✔ Repeated execution
🎯 One Line
👉 ScheduledExecutorService = timer-based task manager
-----------------------------------------------------------------

            */
    public static void main(String[] args) {

    }
}
