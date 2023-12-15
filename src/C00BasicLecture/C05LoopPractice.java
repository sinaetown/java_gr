package C00BasicLecture;

public class C05LoopPractice {
    public static void main(String[] args) {
////        EX1) 짝수의 합 계산하기
//        1~20까지 짝수의 합 출력
//        int sum = 0;
//        for (int i = 0; i <= 20; i++) {
//            sum += i;
//        }
//        System.out.println("Even sum: " + sum);
//
////        EX2) 숫자 뒤집기
//        int number = 1234;
//        int result = 0;
//        int n = 0;
//
//        while (number != 0) {
//            n = number % 10;
//            result = result * 10 + n;
//            number /= 10;
//        }
//        System.out.println(result);
//
////        EX3) 최대공약수 / 최소공배수
//        int num1 = 24;
//        int num2 = 36;
//        int min = 0;
//        int gcd = 0;
//        int lcm = 0;
//        if (num1 > num2) {
//            min = num2;
//        } else {
//            min = num1;
//        }
//        for (int i = min; i > 0; i--) {
//            if (((num1) % i == 0) && ((num2) % i == 0)) {
//                gcd = i;
//                System.out.println("GCD = " + i);
//                break;
//            }
//        }
//        lcm = num1 * num2 / gcd;
//        System.out.println("LCM = " + lcm);

//        EX4) 라벨문 활용1
//        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7}, {8, 9}, {10, 11, 12, 13, 14}};
//        int target = 11;
//
//        loop1:
//        for (int i = 0; i < matrix.length; i++) {
//            loop2:
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] == 11) {
//                    System.out.printf("Number 11 is at position: (%d, %d)", i, j);
//                    break loop1;
//                }
//            }
//        }

//        EX5) 약수 찾기
        int count = 0;
        loop1:
        for (int i = 1; i <= 20; i++) {
            loop2:
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count >= 5) {
                System.out.println("num: " + i);
                break loop1;
            } else {
                count = 0;
            }
        }
    }
}