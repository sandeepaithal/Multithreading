package multithreading;

/**
 * Example demonstrating the use of getPriority() and setPriority() methods.
 * Threads with different priorities are started to observe their execution order.
 * @author C SANDEEP AITHAL
 */
public class PriorityExample extends Thread {

    public PriorityExample(String name, int priority) {
        super(name);
        setPriority(priority); // Set thread priority
    }

    @Override
    public void run() {
        System.out.println(getName() + " with priority " + getPriority() + " is running.");
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
            System.out.println(getName() + " - Count: " + i);
        }
    }

    public static void main(String[] args) {
        // Create threads with different priorities
        PriorityExample t1 = new PriorityExample("Thread-1", Thread.MIN_PRIORITY);
        PriorityExample t2 = new PriorityExample("Thread-2", Thread.NORM_PRIORITY);
        PriorityExample t3 = new PriorityExample("Thread-3", Thread.MAX_PRIORITY);

        // Start the threads
        t1.start();
        t2.start();
        t3.start();

        try {
            // Wait for all threads to complete
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("All threads have finished execution.");
    }
}

