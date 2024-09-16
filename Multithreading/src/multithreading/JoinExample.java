package multithreading;

/**
 * Example demonstrating the use of join() in multithreading.
 * This ensures threads execute sequentially by waiting for each to finish.
 * @author C SANDEEP AITHAL
 */
public class JoinExample extends Thread {

    // Override run method to print thread name and count
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
        }
    }

    public static void main(String[] args) {
        // Creating three threads
        JoinExample t1 = new JoinExample();
        JoinExample t2 = new JoinExample();
        JoinExample t3 = new JoinExample();

        // Starting the first thread
        t1.start();
        try {
            // Main thread waits for t1 to complete
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        // Starting the second thread
        t2.start();
        try {
            // Main thread waits for t2 to complete
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        // Starting the third thread
        t3.start();
        try {
            // Main thread waits for t3 to complete
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("All threads have finished execution.");
    }
}
