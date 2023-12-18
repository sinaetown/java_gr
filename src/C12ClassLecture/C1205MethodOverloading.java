package C12ClassLecture;

import java.util.*;

public class C1205MethodOverloading {
    public static void main(String[] args) {
        C1205MethodOverloading n = new C1205MethodOverloading();

//        Method 오버로딩을 통해 같은 메서드명 재활용
//        Generic을 통해 타입 재활용 : 어떤 타입이나 들어올 수 있도록 ... (?)

        System.out.println(n.sum(1, 2));
        System.out.println(n.sum(1, 2, 3));
        System.out.println(n.sum(1.2391, 2.4259));

        List<Integer> myList = new ArrayList<>();
    }

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(double a, double b) {
        return a + b;
    }
}
