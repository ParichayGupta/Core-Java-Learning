package ExceptionHandling.Flow_Control;

public class TryCatchFinallyReturn {
    public static void main(String[] args) {
        int[] arr = new int[4];

        int i = anotherMethod(arr);
        System.out.println(i);
    }

    private static int anotherMethod(int[] arr) {
        int i = arr[3];
        try{
            System.out.println("inside Try Block");
            i = 10;
            return i;
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        }finally{
            System.out.println("Finally block");
        }
        return i;
    }
}
