package MultiThreading.Synchronization.sync_block;

public class ThreadedSend extends Thread{

    private String msg;
    final Sender sender;
    public ThreadedSend(String msg, Sender sender) {
        this.msg = msg;
        this.sender = sender;
    }

    public void run() {
        synchronized(sender){
            sender.send(msg);
        }
    }
}
