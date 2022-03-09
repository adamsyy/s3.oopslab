package Playground;

public class Demothreads {
    public static void main(String args[]) {

    Thread t1 = new Thread(new Runnable() {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    });
    

    }
}
