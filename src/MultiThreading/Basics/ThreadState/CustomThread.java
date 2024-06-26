package MultiThreading.Basics.ThreadState;

public class CustomThread implements Runnable {

    public void run() {
        // moving thread2 to timed waiting state
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(
                "State of thread1 while it called join() method on thread2 -"
                        + Main.thread1.getState());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}