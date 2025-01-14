package multithreading;

/**
 * Example2 demonstrates creating threads by implementing the Runnable
 * interface. Each thread prints a count from 0 to 4 with a 1-second delay
 * between prints.
 * 
 * @author C SANDEEP AITHAL
 */
public class Example2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - Count: " + i);
			try {
				Thread.sleep(1000); // Sleep for 1 second
			} catch (InterruptedException e) {
				e.printStackTrace();
				Thread.currentThread().interrupt(); // Set the interrupt flag
			}
		}
	}

	public static void main(String[] args) {
		// Creating two threads using Example2 as the Runnable target
		Thread thread1 = new Thread(new Example2(), "Thread-1");
		Thread thread2 = new Thread(new Example2(), "Thread-2");

		// Starting the threads
		thread1.start();
		thread2.start();
	}
}
