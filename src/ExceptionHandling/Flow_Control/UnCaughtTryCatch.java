package ExceptionHandling.Flow_Control;

public class UnCaughtTryCatch {
    public static void main(String[] args) {
        int arr[] = new int[4];

        try{
            int i = arr[4];
            System.out.println("Inside try block");
        } catch (NullPointerException e){
            System.out.println("Inside catch block");
        }finally{
            System.out.println("Inside finally block");
        }
        System.out.println("Inside Main Method");
    }
}
