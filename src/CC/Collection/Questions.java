package CC.Collection;

public class Questions {

    /**
     *

     to cover:
     1.Custome comparator/comparation
     2.streams apis

     ----------------------------------------------------
     1. How to avoid null pointer exception?
     > It occurs when you try to use a null reference
     String str = null;
     System.out.println(str.length()); // ❌ NullPointerException
     We can avoid NullPointerException by performing null checks, using safe comparison patterns like constant.equals(variable),
     initializing variables properly, returning empty collections instead of null, and using Optional or Objects.requireNonNull where appropriate.
    ----------------------------------------------------------------------------
     2.final vs finally vs finalize :
   > | Feature   | `final`                   | `finally`       | `finalize()`               |
     | --------- | ------------------------- | --------------- | -------------------------- |
     | Type      | Keyword                   | Block           | Method                     |
     | Used in   | Variables, methods, class | try-catch       | Object class               |
     | Purpose   | Restriction               | Cleanup code    | Garbage collection         |
     | Execution | Compile-time              | Always executes | Before GC (not guaranteed) |

     Uses of final
     ✅ Final Variable
     final int x = 10;
     // x = 20; ❌ error
     👉 Value cannot be changed

     ✅ Final Method
     final void show() {}
     👉 Cannot be overridden

     ✅ Final Class
     final class Test {}
     👉 Cannot be extended

     -----

     finally (Block)
     👉 Used in exception handling
     👉 Always executes (even if exception occurs or not)
     ✅ Example
     try {
     int a = 10 / 0;
     } catch (Exception e) {
     System.out.println("Error");
     } finally {
     System.out.println("Always runs");
     }
     💡 Output
     Error
     Always runs
     🔥 Key Point
     👉 finally is used for:
     Closing resources
     Cleanup code

     finalize() (Method)
     👉 Method of Object class
     👉 Called before garbage collection
     ✅ Example
     class Test {
     protected void finalize() {
     System.out.println("Object is being garbage collected");
     }
     }
     ⚠️ Important
     👉 finalize() is:
     ❌ Not reliable
     ❌ Deprecated (Java 9+)
     ❌ Not guaranteed to run

     final is a keyword used to restrict modification of variables, methods, and classes.
     finally is a block used in exception handling that always executes for cleanup purposes.
     finalize() is a method called by the garbage collector before object destruction, but it is not reliable and is deprecated in modern Java.
    -----------------
        3. synchronized vs ReentrantLock
     Basic Idea
     synchronized → Simple, built-in locking (automatic)
     ReentrantLock → Advanced locking (manual control)
     Lock Handling
     synchronized → Lock is automatically acquired & released
     ReentrantLock → You must manually lock() and unlock()
     Performance
     Both are fast (modern Java), but:
     ReentrantLock performs better in complex scenarios
     synchronized is simple and automatic, while ReentrantLock gives more control like tryLock, fairness, and manual locking.

     ------------------------

     4. Purpose of volatile in Multithreading
     volatile ensures visibility of changes across threads
     In multithreading:
     Each thread may have its own cached copy of a variable
     So one thread updates it, but others may not see the latest value
     volatile ensures that changes made by one thread are immediately visible to other threads,
     but it does not guarantee thread safety for complex operations.

     ------------------------

     5. How does ThreadLocal work internally?
     ThreadLocal in Java is used to create thread-specific variables each thread gets its own independent copy.

     ThreadLocal<Integer> tl = new ThreadLocal<>();
     tl.set(10);

     Actually, the value is stored inside the Thread object itself
     Internal Structure
     Each Thread has a field:
     Thread.threadLocals  // type: ThreadLocalMap
     So internally:
     👉 Every thread maintains its own ThreadLocalMap
     ThreadLocalMap is a special internal map:
     Key   → ThreadLocal object
     Value → Actual value (e.g., 10)
     Key Points to Remember-
     Each thread has its own ThreadLocalMap
     ThreadLocal is just a key, not storage
     Values are stored inside Thread
     Keys are weak references
     Can cause memory leaks if not removed
     Used in:
     Database connections
     User sessions
     Transaction management
     ThreadLocal works by storing data in a per-thread map inside each Thread, using the ThreadLocal object as the key.
     -----------
     6. Fail-Fast vs Fail-Safe Iterators
     Fail-Fast Iterator:
     Throws exception if collection is modified during iteration.
     👉 How it works:
     Uses a counter (modCount)
     If structure changes → detects mismatch → throws error
     👉 Exception:
     ConcurrentModificationException
     👉 Example Collections:
     ArrayList
     HashMap
     code ex:
     List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
     for (Integer i : list) {
     list.add(4); // ❌ throws exception
     }

     Fail-Safe Iterator:
     Does NOT throw exception if collection is modified.
     👉 How it works:
     Works on a copy of collection
     Original collection can change safely
     👉 Exception:
     ❌ No exception
     👉 Example Collections:
     CopyOnWriteArrayList
     ConcurrentHashMap
     code ex:
     CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(1,2,3));
     for (Integer i : list) {
     list.add(4); // ✅ no exception
     }

     Fail-fast stops iteration on modification, while fail-safe allows it by working on a copy.

     ------------------

     7.Diamond Problem in Java 8
     Happens when a class implements multiple interfaces that have the same default method.
     Interface A
        ↓
     Interface B   Interface C
            \       /
            \     /
            Class D

     👉 If both B and C provide same method → confusion: which one to use?
     interface A {
     default void show() {
     System.out.println("A");
     }
     }

     interface B {
     default void show() {
     System.out.println("B");
     }
     }

     class Test implements A, B {
     }

     This gives compile-time error
     👉 Because Java doesn't know whether to use A or B
     How Java 8 Resolves It
     👉 Java forces us to override the method
     class Test implements A, B {
     public void show() {
     System.out.println("Resolved");
     }
     }
     now no confusion

     Calling Specific Interface Method
     If you want a specific one:
     class Test implements A, B {
     public void show() {
     A.super.show(); // call A's method
     B.super.show(); // call B's method
     }
     }

     Diamond problem occurs due to multiple default methods, and Java resolves it by forcing explicit override.
     ----------------

     8. metaspace vs permgen??
     PermGen (Permanent Generation)
     👉 Used in Java 7 and before
     Stores:
     Class metadata
     Static variables
     String pool (older versions)
     👉 Fixed size
     You must set it manually (-XX:MaxPermSize)
     Can cause OutOfMemoryError: PermGen space

     Metaspace
     👉 Introduced in Java 8
     Stores:
     Class metadata (same purpose)
     👉 Dynamic size (auto grows)
     Uses native memory (outside heap)
     No fixed limit by default
     👉 Error:
     OutOfMemoryError: Metaspace (rare, but possible)
     Why PermGen was Removed?
     👉 Problems:
     Fixed size → frequent memory errors
     Hard to tune
     👉 Solution:
     Replaced with Metaspace → more flexible & efficient

     PermGen was a fixed heap space for class metadata, replaced by Metaspace in Java 8 which uses dynamic native memory.

     ---------------------

     9. How does G1GC differ from CMS garbage collector?
     CMS (Concurrent Mark-Sweep)
     👉 Old GC (before Java 9)
     Works on old generation only
     Phases: mark → sweep (no compaction)
     Runs mostly concurrently with application
     ❌ Problems:
     Memory fragmentation (no compaction)
     Can cause long pauses sometimes
     Deprecated and removed in newer Java

     G1 GC (Garbage First)
     👉 Modern GC (default in Java 9+)
     Divides heap into regions
     Cleans memory region-wise (priority-based)
     Does compaction → avoids fragmentation
     ✔ Benefits:
     Predictable pause times
     Better for large heaps
     More efficient memory usage

     CMS is older, can cause fragmentation, while G1 GC is modern, region-based, and gives better predictable performance.

     -----------------------------------------

     10. What is a functional interface and how does it enable lambda expressions?
     An interface with only one abstract method
     ✔ It can have:
     Default methods
     Static methods
     ❗ But only ONE abstract method

     @FunctionalInterface //@FunctionalInterface is optional but recommended (compile-time check)
     interface MyInterface {
     void sayHello(); // only one abstract method
     }

     Lambda expressions provide implementation of that single method
     Instead of writing:
     MyInterface obj = new MyInterface() {
     public void sayHello() {
     System.out.println("Hello");
     }
     };
     👉 You can write:
     MyInterface obj = () -> System.out.println("Hello");

     Works
     👉 Because compiler knows:
     Interface has only one method
     So lambda = implementation of that method
     🔹 Real Examples in Java
     Runnable → run()
     Callable → call()
     Comparator → compare()

     One abstract method = functional interface
     Lambda = shorthand implementation
     Used heavily in streams & multithreading

     Functional interface has one abstract method, and lambda expressions provide its implementation in a short way.
---------------------------------
     11. Explain effectively final variables in the context of lambdas
     “effectively final” mean?
     👉 A variable is effectively final if:
     Its value is assigned once
     And never changed afterward
     ✔ Even if you don’t write final, it behaves like final

     //valid
     int x = 10;
     Runnable r = () -> {
     System.out.println(x); // allowed
     };
     👉 x is effectively final (not modified)

     //invalid
     int x = 10;
     Runnable r = () -> {
     // System.out.println(x);
     };
     x = 20; // ❌ now NOT effectively final
     👉 This will cause compile-time error

     Why Lambdas Require It
     👉 Lambdas can capture variables from outer scope, but only if they are effectively final.
     Reason (simple):
     Lambdas don’t store variables directly
     They capture values, not changing variables
     Prevents confusion & thread issues

     Behind the Scenes
     👉 Lambda uses a copy of the variable value
     So if changes were allowed:
     It would create inconsistent behavior
     Especially in multithreading

     Effectively final means a variable’s value doesn’t change, which is required for lambdas to safely capture it.

     ---------------------
     12. How would you detect and fix memory leaks in Java?
     Memory Leak?
     👉 Objects are no longer needed but still referenced, so GC can’t remove them

     How to Detect Memory Leaks
     ✔ Symptoms
     Increasing memory usage over time
     Frequent Full GC
     OutOfMemoryError

     Tools
     VisualVM → monitor heap, threads
     JConsole → basic monitoring
     Eclipse MAT → analyze heap dumps
     👉 Take heap dump → find objects not getting freed

     Common Causes
     Static collections holding objects
     Not closing resources (DB, streams)
     Improper use of ThreadLocal
     Caches without eviction
     Listeners not removed

     How to Fix
     ✔ Remove Unused References
     obj = null;
     ✔ Close Resources
     try (BufferedReader br = new BufferedReader(...)) {
     // auto close
     }
     ✔ Fix ThreadLocal Leak
     threadLocal.remove();
     ✔ Use Weak References (if needed)
     WeakHashMap<K, V>
     ✔ Limit Collection Size
     Use cache with eviction (LRU)

     Memory leaks happen when objects are still referenced;
     detect using profiling tools and fix by removing unnecessary references and properly managing resources.

     *
     *
     */
}
