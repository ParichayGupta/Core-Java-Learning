package ExceptionHandling.Flow_Control;

public class UnCaughtTryCatchFinally {
    public static void main(String[] args) {
        try{
            String s = "123F";
            int num = Integer.parseInt(s);
            System.out.println("Inside Try Block");
        }catch (NumberFormatException e ){
            System.out.println("Inside Catch Block");
        }finally {
            System.out.println("Inside Finally Block");
        }


    }
}
