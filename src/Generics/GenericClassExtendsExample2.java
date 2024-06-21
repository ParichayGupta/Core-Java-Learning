package Generics;

import java.util.LinkedList;

public class GenericClassExtendsExample2 <T extends Animal> {
    private T object;
    public GenericClassExtendsExample2(T object){
        this.object = object;
    }
    public static void main(String[] args) {
        GenericClassExtendsExample2<WildAnimal> example2 = new GenericClassExtendsExample2<>(new WildAnimal());
        GenericClassExtendsExample2<Animal> example21 = new GenericClassExtendsExample2<>(new Animal());
        GenericClassExtendsExample2<Dog> example22 = new GenericClassExtendsExample2<>(new Dog());
        GenericClassExtendsExample2 whatEverGenericClassExtendsExample2 = new GenericClassExtendsExample2(new Animal());


    }
}

class WhatEver{
    public WhatEver(){
        System.out.println("WhatEver");
    }
}
class Animal extends WhatEver{
    public Animal(){
        System.out.println("Animal");
    }
}

class WildAnimal extends Animal{
    public WildAnimal(){
        System.out.println("WildAnimal");
    }

}

class PetAnimal extends Animal{
    public PetAnimal(){
        System.out.println("PetAnimal");
    }
}

class Dog extends PetAnimal{
    public Dog(){
        System.out.println("Dog");
    }
}

class Tiger extends WildAnimal{
    public Tiger(){
        System.out.println("Tiger");
    }
}