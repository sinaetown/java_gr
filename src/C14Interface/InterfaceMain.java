package C14Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        DogImplements myDog = new DogImplements();
        myDog.makeSound();

        CatImplements myCat = new CatImplements();
        myCat.makeSound();

//        다형성이란 ? : 하나의 객체가 여러 개의 참조변수를 가질 수 있음을 의미

        DogMultiImplements myMutliDog = new DogMultiImplements();
//        타입을 AnimalInterface1로 선언
//        하면 AnimalInterface2에 정의된 메서드는 사용 불가

        myMutliDog.makeSound();
        System.out.println(myMutliDog.play("Sofia", "Max"));

        CatMultiImplements myMultiCat = new CatMultiImplements();
//        타입을 AnimalInterface2로 선언하면 AnimalInterface1에 정의된 메서드는 사용 불가

        myMultiCat.makeSound();
        System.out.println(myMultiCat.play("Luke", "Riley"));

//        기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나, 익명 내부 클래스 방식으로 사용 가능 (A->C)
//        AnimalInterface1 ai = new AnimalInterface1() {
//            @Override
//            public void makeSound() {
//
//            }
//        }
    }
}
