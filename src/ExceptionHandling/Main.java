package ExceptionHandling;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {
        int age = 21;

        if (age < 18) {
            throw new InvalidAgeException("Age must be greater than 18");
        }
    }
}
