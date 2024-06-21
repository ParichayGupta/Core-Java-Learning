package MultiThreading.Synchronization.sync_block;

public class Sender {

    public void send(String message) {
        System.out.println("Sending message: " + message);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sent message: " + message);
    }
}
