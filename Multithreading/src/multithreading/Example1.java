package multithreading;

/**
 * Example of multithreading using the Thread class in Java.
 * Each thread will print its name and a count.
 * 
 * @author C Sandeep Aithal
 */
public class Example1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - Count: " + i);
			try {
				Thread.sleep(1000); // Sleep for 1 second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Example1 thread1 = new Example1();
		Example1 thread2 = new Example1();

		thread1.start();
		thread2.start();
	}
}
