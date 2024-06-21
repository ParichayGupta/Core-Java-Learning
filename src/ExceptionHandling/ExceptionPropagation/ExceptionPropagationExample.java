package ExceptionHandling.ExceptionPropagation;

public class ExceptionPropagationExample {
    public static void main(String[] args) {
        ExceptionPropagationExample ex = new ExceptionPropagationExample();
        ex.f();
    }

    private void m(){

        int i = 50/0;

    }

    private void n(){
        m();
    }

    private void e(){
        n();
    }

    private void f(){
        try{
            n();
        }catch(Exception e){
            System.out.println("Exception: " + e);
        }
    }

}

