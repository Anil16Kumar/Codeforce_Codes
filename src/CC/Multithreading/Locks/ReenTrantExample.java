package CC.Multithreading.Locks;

import java.security.PrivateKey;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenTrantExample {

    private final Lock lock=new ReentrantLock();

    public void outerMethod(){
        lock.lock(); // it is like similar to synchronization
        try {
            System.out.println("inside outer method");
            innerMethod();
        }finally {
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();// jo lock pehale se lock kiya hai usse hum phir se lock kar rahe hai hum...
        // yani me aapna hi wait kar raha hu ke me kaab khatam hauga...
        // main thread (chalaega outerMethod thread)-> outerMethod thread pe aaega -> lock.lock() execute hoga khod ko lock karega ->
        // then "inside outer method" print hoga phir innerMethod() method call hoga -> then ye thread innerMethod() me lock.lock(); par aaega -> ye thread wait karega lock ke realse hone ka ->
        // i.e. ye apne par hi depend ho raha hai that is -> DEADLOCK(Me kisi pe depend kar raha hu, aur wo mere pe depend kar raha hai...)-> outerMethod() depend on innerMethod() to finish while innerMethod() waits for outterMethod to finish..
        // Deadlock hota par because of java we have used ReentrantLock() class implementation Re-entrant, ye dubara se enter kar sakta hai-> ye innerMethod() ke lock.lock() ko chala sakta hai...

        try {
            System.out.println("inside inner method");
        }finally {
            lock.unlock();
        }

        // jab hum ReentrantLock() lock use karte hai to hum ek count maintain karte hai, ki lock kitni baar aquire kiya gaya hai
        //lock tab realse hota hai? jab har lock match ho jaega unlock se
    }

    public static void main(String[] args) {
        ReenTrantExample reenTrantExample=new ReenTrantExample();
        reenTrantExample.outerMethod();

        /*
        A ReentrantLock is a lock that:
👉 Allows the same thread to acquire the lock multiple times
👉 But it must release (unlock) the same number of times

     Think of a room with a lock
There is 1 key (lock), A person (thread) enters the room and locks the door

Case 1: Normal Lock (non-reentrant)
Person enters → locks door
Inside, he tries to lock again ❌
He is already inside → now he blocks himself
👉 Deadlock 💀

Case 2: ReentrantLock (your case)
Person enters → locks door (count = 1)
Inside → locks again (count = 2) ✅ allowed
Finishes inner work → unlock (count = 1)
Finishes outer work → unlock (count = 0 → fully released)
👉 Same person can re-enter again and again

CODE FLOW STEPS :-
Step 1: outerMethod()
lock.lock();  // count = 1
Thread acquires lock
👉 prints:
inside outer method

Step 2: Calls innerMethod()
Now same thread tries:
lock.lock();  // count = 2
👉 Allowed because same thread

Step 3: innerMethod() executes
inside inner method

Step 4: Unlocking
Inside innerMethod():
lock.unlock();  // count = 1
Back to outerMethod():
lock.unlock();  // count = 0 (lock fully released)

Lock will be fully released only when:
number of lock() calls == number of unlock() calls


ReentrantLock = Same thread can enter the lock multiple times without blocking itself
"Reentrant = Re-enter"
✔ Same thread → re-enter allowed
❌ Different thread → blocked

Without reentrant property → deadlock
With ReentrantLock → NO deadlock

Q.) Why NO Deadlock Happens Here?
>> Because the same thread is allowed to take the lock again in ReentrantLock.

🔑 Think of it like your own room
You enter your room → lock the door
Now you go inside another section of your room
Do you need permission again?
👉 No — it’s already YOUR room


When would deadlock happen?
Deadlock happens if:
👉 Thread A holds lock
👉 Thread A waits for SAME lock again
👉 But system does NOT allow re-entry
👉 Then:
Thread waits for itself forever


Why it DOES NOT happen here
Because ReentrantLock says:
“If YOU already own the lock, you can enter again"

Deadlock does not happen because the thread is not waiting for another thread — it is continuing with its own lock.
ReentrantLock prevents deadlock here because the same thread can reuse the lock instead of waiting for itself.

*/
    }
}
