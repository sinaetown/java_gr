package C13Inheritance;

public class C1302SuperChildClass extends SuperParents {
    //    super(), super키워드:부모 클래스 의미
    //    this()는 생성자 호출
    //    super()는 부모의 생성자 호출
    int a;
    int b;

    C1302SuperChildClass() {
        super(100);
        a = 30;
        b = 20;
    }

    void display() {
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        C1302SuperChildClass sc = new C1302SuperChildClass();
        sc.display();
    }
}

class SuperParents {
    int a;

    SuperParents(int a) {
        this.a = a;
    }
}