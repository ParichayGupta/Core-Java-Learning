package MultiThreading.Basics.example1;

public class Thread1 implements Runnable{

    @Override
    public void run() {
        try{
            System.out.println("Thread "+Thread.currentThread().getName()+" is running");
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Exception is Caught");
        }
    }
}
