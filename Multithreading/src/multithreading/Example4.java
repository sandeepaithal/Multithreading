package multithreading;

public class Example4 extends Thread{
public void run() {
	System.out.println("running...");
}
public static void main(String[] args) {
	 Example4 t1=new Example4();  
	  Example4 t2=new Example4();  
	  System.out.println("Name of t1:"+t1.getName());  
	  System.out.println("Name of t2:"+t2.getName());  
	   
	  t1.start();  
	  t2.start();  
	  
	  t1.setName("CSA");  
	  System.out.println("After changing name of t1:"+t1.getName());  
}
}
