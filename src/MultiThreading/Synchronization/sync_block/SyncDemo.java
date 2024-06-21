package MultiThreading.Synchronization.sync_block;

public class SyncDemo {
    public static void main(String[] args) {
        Sender sender = new Sender();

        ThreadedSend threadedSend1 = new ThreadedSend("Hi", sender);
        ThreadedSend threadedSend2 = new ThreadedSend("Bye", sender);

        threadedSend1.start();
        threadedSend2.start();

        try{
            threadedSend1.join();
            threadedSend2.join();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
