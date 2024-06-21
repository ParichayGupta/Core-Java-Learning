package ExceptionHandling.TryWithResources;

import java.io.FileNotFoundException;
import java.util.ConcurrentModificationException;

public class TryWithResources {
    public static void main(String[] args) {
        int i = 10;
        try(AutoCloseAbleCustomException ac = new AutoCloseAbleCustomException()){
            if(i < 18){
                throw new AutoCloseAbleCustomException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
