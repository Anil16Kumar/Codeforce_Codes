package CC.Multithreading.Executors;

public class CallableVSRunnable {

    /*
    1. Runnable (Simple Task)
📌 Definition:
👉 A task that does some work but does NOT return anything
📌 Method:
void run();
✅ Example:
Runnable task = () -> {
    System.out.println("Task is running");
};
👉 Used with:
Thread
Executor


2. Callable (Advanced Task)
📌 Definition:
👉 A task that returns a result
📌 Method:
V call() throws Exception;
✅ Example:
Callable<Integer> task = () -> {
    return 10 + 20;
};

Easy Real-Life Analogy
🔹 Runnable
👉 Like:
“Do the work, don’t tell me result”
Example:
Print logs
Send email
Save data


🔹 Callable
👉 Like:
“Do the work and give me result”
Example:
Calculate price
Fetch data from DB
API response

Question: Why Callable when Runnable already exists?
Answer:
“Callable is used when we need a result or want to handle exceptions, while Runnable is used for simple fire-and-forget tasks.”

Shortcut to Remember
👉 Runnable = Run only
👉 Callable = Call + Result

Use Case	Use
Logging / background task ->	Runnable
Calculation / API / DB	-> Callable


Future?
👉 A Future represents a result that will come later
📌 Key point:
It is blocking
Problem with Future

👉 future.get():
Blocks the main thread
No chaining
No async handling

CompletableFuture?
👉 Improved version of Future (Java 8)
📌 Key point:
Non-blocking
Supports chaining
Supports async programming

| Feature            | Future    | CompletableFuture |
| ------------------ | --------- | ----------------- |
| Blocking           | ✅ Yes     | ❌ No              |
| Chaining           | ❌ No      | ✅ Yes             |
| Combine tasks      | ❌ No      | ✅ Yes             |
| Exception handling | ❌ Limited | ✅ Powerful        |
| Async support      | ❌ Basic   | ✅ Advanced        |

Future
👉 Like:
“Wait here until food is ready”

🔹 CompletableFuture
👉 Like:
“Food ready → call me → I’ll eat → then go to gym”

Why CompletableFuture over Future?
Answer:
“CompletableFuture provides non-blocking asynchronous programming with support for chaining,
combining multiple tasks, and better exception handling, which Future lacks.”

👉 Future = wait and get
👉 CompletableFuture = don’t wait, continue and react

    * */

}
