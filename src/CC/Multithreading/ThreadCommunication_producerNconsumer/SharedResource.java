package CC.Multithreading.ThreadCommunication_producerNconsumer;

class SharedResource {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) {
        while (hasData) {
            try { wait(); } catch (Exception e) {}
        }

        data = value;
        System.out.println("Produced: " + value);
        hasData = true;

        notify(); // wake consumer
    }

    public synchronized void consume() {
        while (!hasData) {
            try { wait(); } catch (Exception e) {}
        }

        System.out.println("Consumed: " + data);
        hasData = false;

        notify(); // wake producer
    }

    /*
    Why Use while (Not if)?
    👉 To avoid spurious wakeups
            */

}
