package C15AnonymousLambda;

public class C1502AnonymousClass {
    public static void main(String[] args) {

//        클래스명이 Animal이 아닌 이름 없는 익명 클래스와 객체를 동시에 생성
        Animal dog = new Animal() {
            @Override
            public void makesound(int n) {
                System.out.println("Warf " + n);
            }
        };

//        익명 객체에 구현 메서드가 1개밖에 없을 경우에 람다 표현식 (화살표 함수)로 표현 가능
//        ()부분에 매개변수 지정하여 구현체에서 활용
//        변수의 개수가 많을 경우, 개수에 맞춰서 지정
        Animal cat = (n) -> System.out.println("Meow " + n);
        dog.makesound(10);
        cat.makesound(20);
    }
}

interface Animal {
    void makesound(int n);

}