class RunnableDemo implements Runnable {
 public void run() {
 System.out.println("Running " +  Thread.currentThread().getName());
 for(int i = 2; i > 0; i--) {
 System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
 }
 System.out.println("Thread " +  Thread.currentThread().getName() + " exiting.");
 }
 }
 public class TestThread {
 public static void main(String args[]) {
 RunnableDemo R1 = new RunnableDemo( );
 Thread t1=new Thread(R1,"A");
 Thread t2=new Thread(R1,"B");
 Thread t3=new Thread(R1,"C");
 t1.start();
 t2.start();
 t3.start();
 }   
}
