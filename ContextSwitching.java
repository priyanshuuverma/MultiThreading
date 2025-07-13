class MyThread extends Thread{
  
  private String taskName;
  
  public MyThread(String name){
    this.taskName = name;
  }
  public void run(){
    for(int i=1; i<=3; i++){
      System.out.println("Saving state of "+ taskName  + "[before Switching]");
      try{
        Thread.sleep(500);
      } catch(InterruptedException e){
        System.out.println(taskName + "Is Interrupted");
      }
    }
    System.out.println(taskName  +  " Completed");
  }
  
}

class Main{
  public static void main(String[] args){
    MyThread t1 = new MyThread("Process 1");
    MyThread t2 = new MyThread("Process 2");
    MyThread t3 = new MyThread("Process 3");
    
    t1.start();
    t2.start();
    t3.start();
  }
}
