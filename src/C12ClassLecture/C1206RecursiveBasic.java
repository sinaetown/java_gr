package C12ClassLecture;

public class C1206RecursiveBasic {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;

        }
        System.out.println(add_acc(10));
        System.out.println(factorial(5));
//        1 1 2 3 5 8

//        fibonacci for loop 활용
        int first = 1;
        int second = 1;
        int third = 0;
        for (int i = 2; i < 9; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        System.out.println(first + second);

//        fibonacci 배열 활용
//        memoization (기억 알고리즘, DP)
//        단계마다 계산 결과 값이 필요할 때 메모이제이션 활용
        int[] fibArr = new int[10];
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                fibArr[i] = 1;
            } else if (i == 1) {
                fibArr[i] = fibArr[i - 1];
            } else {
                fibArr[i] = fibArr[i - 2] + fibArr[i - 1];
            }
        }
        System.out.println(fibArr[9]);
        System.out.println(fibonacci(9));
    }

    //    메서드가 자기 자신을 호출하는 메서드 = 재귀함수
//    이런 호출 방식을 재귀 호출이라고 한다.
    static int add_acc(int n) {
        if (n == 1) {
            return 1;
        }
        return n + add_acc(n - 1);
    }

    //    factorial!
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    //    fibonacci 재귀 활용
    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
