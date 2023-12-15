package C12ClassLecture;

public class C1202Class {
    public static void main(String[] args) {

//        아래 MyCalculator의 total 변수와 메서드가 static일 때
//        MyCalculator.sum_acc(10);
//        MyCalculator.sum_acc(20);
//        MyCalculator.sum_acc(30);
//        MyCalculator.sum_acc(40);
//        System.out.println("Sum_acc : " + MyCalculator.sum_acc(50));

//        클래스 변수를 공용으로 사용하다보니, 변수와 메서드의 고유성이 보장되지 않음

//        A부서
        MyCalculator MyCalA = new MyCalculator();
        MyCalA.sum_acc(10);
        MyCalA.sum_acc(20);
        MyCalA.sum_acc(30);
        System.out.println("MyCalA total: " + MyCalA.total);
//        B부서
        MyCalculator MyCalB = new MyCalculator();
        MyCalB.sum_acc(40);
        MyCalB.sum_acc(50);
        MyCalB.sum_acc(60);
        System.out.println("MyCalB total: " + MyCalB.total);
    }
}

//내부 클래스
class MyCalculator {
//    static이 붙어있는 변수는 class 변수
//    static이 붙어있지 않은 변수는 객체 변수
    int total = 0;

    public int sum(int a, int b) {
        return a + b;
    }

    public void sum_acc(int total) {
//        this객체 그 자신을 의미
        this.total += total;
    }
}