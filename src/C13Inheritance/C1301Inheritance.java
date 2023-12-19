package C13Inheritance;

//extends 키워드를 통해 상속 관계를 표현
public class C1301Inheritance extends Parents {
    int c = 30;

    public static void main(String[] args) {
        C1301Inheritance ih = new C1301Inheritance();
        System.out.println(ih.c);
        System.out.println(ih.a); //부모꺼
//        sout(ih.b) 는 안 됨 !
//        자식 클래스라고 하더라도 priave 변수는 상속 및 접근이 불가

        ih.parentMethod();
        ih.childMethod();
    }

    void childMethod() {
        System.out.println("자식 클래스입니다");
    }

    //   부모 클래스의 method 명을 동일하게 사용함으로써 메소드 오버라이딩 (덮어쓰기)
    @Override
    void parentMethod() {
        System.out.println("Overriding : 부모 클래스가 아닌, 자식 클래스입니다");
    }

}

class Parents {
    int a = 10;
    private int b = 20;
//    본인 클래스에서만 사용 가능, 자식도 사용할 수 없음
//    default의 경우, 같은 패키지 내에서 사용 가능

    void parentMethod() {
        System.out.println("부모 클래스입니다");
    }
}