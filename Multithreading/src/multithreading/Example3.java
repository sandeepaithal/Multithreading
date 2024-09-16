package multithreading;

/**
 * Example demonstrating the use of the run() method directly.
 * This does not start new threads; it executes in the main thread.
 * @author C SANDEEP AITHAL
 */
public class Example3 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Exception occurred: " + e.getMessage());
            }
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
        }
    }

    public static void main(String[] args) {
        Example3 t1 = new Example3();
        Example3 t2 = new Example3();

        // Running run() method directly, not creating new threads
        t1.run();
        t2.run();
    }
}
