package C14Interface;

public class StaticFinalInterface {
    public static void main(String[] args) {
        MyImplemnts m = new MyImplemnts();
        m.methodA();
        System.out.println(m.my_constant);

        MyInterface x = new MyImplemnts();
        System.out.println(x.my_constant);

    }
}

interface MyInterface {
    //    아래 변수는 컴파일 타임에 static final이 붙는다 (상수이자 클래스 변수)
    int my_constant = 100;

    void methodA();
}

class MyImplemnts implements MyInterface {

    @Override
    public void methodA() {
        System.out.println("Method A from MyImplements");
    }
}