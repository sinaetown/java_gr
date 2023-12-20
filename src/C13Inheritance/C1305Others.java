package C13Inheritance;
//import java.util.*; // 가능 (util 하위의 모든 클래스/인터페이스 파일 import 가능)
//import java.*; // 특정 패키지의 하위 패키지의 모든 파일까지 import는 불가능
//Final class는 상속 불가
//public class C1305Others extends FinalClass {
//
//}

public class C1305Others {
    public static void main(String[] args) {
        C1305Dog myDog = new C1305Dog();
        myDog.makeSound1();
        myDog.makeSound2();

        C1305Animal myAnimal = new C1305Animal() {
            @Override
            void makeSound1() {

            }
        };
        System.out.println(myDog.getClass());
        System.out.println(myAnimal.getClass()); //익명객체 whatthe

    }
}

final class FinalClass {

}

abstract class C1305Animal {
//    final void makeSound() {
//        System.out.println("Makes animal sound");
//    }

    abstract void makeSound1();

    void makeSound2() {
        System.out.println("makeSound2 from Animal");
    }
}

class C1305Dog extends C1305Animal {
    @Override
    void makeSound1() {
        System.out.println("makeSound from Dog");
    }

//    Final method는 overriding 불가
//    @Override
//    void makeSound() {
//        System.out.println("Doggy sound");
//    }
}