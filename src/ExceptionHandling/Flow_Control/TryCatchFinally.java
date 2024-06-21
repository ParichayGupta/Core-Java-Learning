package ExceptionHandling.Flow_Control;

public class TryCatchFinally {
    public static void main(String[] args) {
        int arr[] = new int[4];

        try{
            int i = arr[4];
            System.out.println("Inside Try Block");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Inside Catch Block");
        } finally {
            System.out.println("Inside Finally Block");
        }
        System.out.println("Inside Main method");
    }
}
