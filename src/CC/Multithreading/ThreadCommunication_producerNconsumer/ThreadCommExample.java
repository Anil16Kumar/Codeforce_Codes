package CC.Multithreading.ThreadCommunication_producerNconsumer;

public class ThreadCommExample {
    /*

    in a multithreaded environment threads often need to communicate and coordinate with each other to
    accomplish a task, without proper communication mechanisms threads might end up in inefficent busy-waiting status
    leads to busy CPU resources and potential deadlocks

    method used in threads communication in syncronization context:
    wait(), notify(), notifyAll()


Chef (Producer)
Prepares food
🧑 Customer (Consumer)
Waits for food

❌ Without wait/notify
Customer keeps asking:
👉 “Food ready? Food ready? Food ready?” 😵

✅ With wait/notify
Customer: “Wake me when food is ready” → wait()
Chef: “Food ready!” → notify()
✔ No unnecessary checking
✔ Efficient

wait():->
lock.wait();
👉 Thread goes to waiting state
👉 Releases lock
👉 Sleeps until notified

notify():->
lock.notify();
👉 Wakes up one waiting thread

notifyAll():->
lock.notifyAll();
👉 Wakes up all waiting threads


    */
    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                resource.produce(i);
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                resource.consume();
            }
        });

        producer.start();
        consumer.start();


        /*

        What Happens Internally:
        Consumer starts → no data → wait()
        Producer produces → notify()
        Consumer wakes → consumes
        Loop continues 🔁

        */
    }
}
