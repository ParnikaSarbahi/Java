 class RunnableDemo implements Runnable {
 public void run() {
   System.out.println("Running " +  Thread.currentThread().getId());
   try {
     for(int i = 4; i > 0; i--) {
       System.out.println("Thread " + Thread.currentThread().getId() + ": " + i);
       // Let the thread sleep for a while.
       Thread.sleep(50);
     }
   }catch (InterruptedException e) {
     System.out.println("Thread " +  Thread.currentThread().getId() + " interrupted.");
   }    
   
  System.out.println("Thread " +  Thread.currentThread().getId() + " exiting.");
   }
 }
 public class TestThread {
   public static void main(String args[]) {
     RunnableDemo R1 = new RunnableDemo( );
     Thread t1=new Thread(R1,"Thread 1");
     t1.start();
     Thread t2=new Thread(R1,"Thread 2");
     t2.start();
   }   
}
