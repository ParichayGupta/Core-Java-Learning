package ExceptionHandling.example1;

public class Main {

    public static void main(String[] args) {
        System.out.println(otherMethod(200));
    }
    private static int otherMethod(int n){
        try{
            return n;
        }
        finally {
            System.out.println("Finally Block");
        }
    }
}
