package Generics;

public class GenericClassExample1<T> {
    T object;

    GenericClassExample1(T object) {
        this.object = object;
    }

    public T getObject() {
        return this.object;
    }

    public static void main(String[] args) {
        GenericClassExample1<Integer> integerGenericClass = new GenericClassExample1<>(4);
        System.out.println(integerGenericClass.getObject());

        GenericClassExample1<String> stringGenericClass = new GenericClassExample1<>("Hello");
        System.out.println(stringGenericClass.getObject());
    }
}
