package Generics;
public class GenericClassExtendsExample<T extends A & MyInterface & MyInterface2> {
    T myObj;
    GenericClassExtendsExample(T myObj) {
        this.myObj = myObj;
    }
    public static void main(String[] args) {
        GenericClassExtendsExample<B> list = new GenericClassExtendsExample<>(new B(100, "Hello"));
        System.out.println(list.myObj.getClass().getName());
        System.out.println(list.myObj.bId);
        System.out.println(list.myObj.bName);
    }
}

class A implements MyInterface, MyInterface2 {
    int id;
    String name;

    public A(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void printA(){
        System.out.println(this.id);
        System.out.println(this.name);
    }
    public A(){}

    @Override
    public void saySomething() {
        System.out.println("Hello World");
    }
}

class B extends A{
    int bId;
    String bName;
    public B(int bId, String bName) {
        this.bId = bId;
        this.bName = bName;
    }

    public void printB(){
        System.out.println(this.bId);
        System.out.println(this.bName);
    }
    public B(){}

}

class C extends B{
    int cId;
    String cName;
    public C(int cId, String cName) {
        this.cId = cId;
        this.cName = cName;
    }

    public void printC(){
        System.out.println(this.cId);
        System.out.println(this.cName);
    }
    public C(){}

}

class D extends C{
    int dId;
    String dName;

    public D(int dId, String dName) {
        this.dId = dId;
        this.dName = dName;
    }
    public void printD(){
        System.out.println(this.dId);
        System.out.println(this.dName);
    }

    public D(){}
}

interface MyInterface {
    void saySomething();
}

interface MyInterface2{

}