package Mock;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println(exceptionMethod());
    }

    private static int exceptionMethod(){
        try{
            System.out.println("inside Try");
            throw new NullPointerException("");
//            return 2;

        }catch(NullPointerException e){
            System.out.println("inside Catch");
            return 3;
        }
        finally{
            System.out.println("inside Finally");
            return 4;

        }
    }


}

