package C13Inheritance;

import java.util.*;

public class C1303MethodOverriding extends Animal {
    public static void main(String[] args) {
//        상속 관계일 때 부모 클래스 타입을 자식 클래스 객체의 타입으로 지정 가능
//        Animal클래스에 정의된 메소드만 사용가능 (제약 발생)
//
        Animal dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();
//        List안에 들어있는 메소드만 구현 가능
        List<String> myList = new LinkedList<>();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow Meow");
    }
}
