class MyThread extends Thread{
  
  private String taskName;
  
  public MyThread(String name){
    this.taskName = name;
  }
  public void run(){
    System.out.println("Started:" + taskName + "| Thread:" + Thread.currentThread().getName());
    for(int i=0; i<5; i++){
      System.out.println(taskName +  "- count:" + i);
      try{
        Thread.sleep(100);
      } catch(InterruptedException e){
        System.out.println(taskName + "Is Interrupted");
      }
    }
    System.out.println(taskName  +  " finished");
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
   
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available CPU Cores: " + cores);
      t1.start();
    t2.start();
    t3.start();
  }
}
