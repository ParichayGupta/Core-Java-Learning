package MultiThreading.Synchronization.sync_method;

public class Sender {

    public synchronized void send(String message) {
        System.out.println("Sending message: " + message);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sent message: " + message);
    }
}
