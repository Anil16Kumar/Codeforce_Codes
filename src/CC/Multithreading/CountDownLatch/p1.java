package CC.Multithreading.CountDownLatch;

public class p1 {
    /*
    CountDownLatch?
👉 It is a class used to make one or more threads wait until some tasks are completed.
📌 Simple definition:
“Wait until count becomes zero, then continue”

Real-Life Analogy
👉 Think of a race starting gate:
3 players are preparing
Referee waits
Once all 3 are ready → race starts
👉 Count = 3 → when it reaches 0 → start

How it works
Initialize with a count
Threads call countDown() when done
Waiting thread calls await()

CountDownLatch?
Answer:
“CountDownLatch is a synchronization aid that allows one or more threads to wait until a set of operations being performed
by other threads completes.”

Latch = Lock until count is zero
//------------------------------------

CyclicBarrier?
👉 It is used to make a group of threads wait for each other before proceeding.
📌 Simple definition:
“All threads wait at a barrier point → once all arrive → all continue together”

Real-Life Analogy
👉 Think of a team meeting:
5 people must join
Nobody starts discussion until all arrive
👉 Once all 5 come → meeting starts together

How it works
Set number of threads (parties)
Each thread calls await()
All threads wait
When last thread arrives → all are released

👉 CountDownLatch
“Main thread waits for workers”

👉 CyclicBarrier
“Workers wait for each other”

CyclicBarrier?
Answer:
“CyclicBarrier is a synchronization aid that allows a group of threads to wait for each other at a common barrier point before continuing execution.”

 Barrier = Everyone stops → then all go together

    * */
}
