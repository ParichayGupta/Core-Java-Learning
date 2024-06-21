package ExceptionHandling.TryWithResources;

import java.io.BufferedReader;

public class AutoCloseAbleCustomException extends Exception implements AutoCloseable {
    AutoCloseAbleCustomException(){
        System.out.println("Inside AutoCloseAbleCustomException constructor");
    }
    @Override
    public void close() throws Exception {
        System.out.println("AutoCloseAbleCustomException");
    }
}
