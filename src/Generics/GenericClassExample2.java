package Generics;

public class GenericClassExample2<T, U> {
    T object1;
    U object2;

    GenericClassExample2(T object1, U object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public void getObject() {
        System.out.println(object1);
        System.out.println(object2);
    }

    public static void main(String[] args) {
        GenericClassExample2<String, Integer> object = new GenericClassExample2<>("Hello", 20);
        object.getObject();
    }
}
