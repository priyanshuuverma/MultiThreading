import java.util.*;

 class MyThread extends Thread{
  private final String taskName;
  public MyThread(String tName){
    this.taskName = tName;
  }
  
  
  @Override
  public void run(){
    for(int i=1; i<=5; i++ ){
      System.out.println(taskName + "is Running Slice" + i);
      try{
        Thread.sleep(500);
      } catch(InterruptedException e){
        System.out.println(taskName + "Was interrupted");
      }
    }
    System.out.println(taskName + "is Completed");
  }
}
public class Main{
    public static void main(String[] args) {
        MyThread t1 = new MyThread("process1");
        MyThread t2 = new MyThread("process2");
        MyThread t3 = new MyThread("process3");
      
        t1.start();
        t2.start();
        t3.start();
    }
}
