package myThreadsPack;

public class ThreadUsingExtend extends Thread {
    public static void main(String[] args) {
        ThreadUsingExtend thread = new ThreadUsingExtend();
      thread.start();
      System.out.println("This code is outside of the thread");
    }
    public void run() {
      System.out.println("This code is running in a thread");
    }
  }