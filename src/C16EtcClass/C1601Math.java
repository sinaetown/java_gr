package C16EtcClass;

import java.util.*;

public class C1601Math {
    public static void main(String[] args) {
        System.out.println("<Printing out Random Values>");
        for (int i = 0; i < 10; i++) {
//            0.0~1.0 미만의 임의의 double형 반환
            double randomValue = Math.random();
            System.out.print((int) (randomValue * 100) + " ");
        }
        System.out.println();

//        abs 메소드 : 절대값 반환
        System.out.println("<Printing out absolute value>");
        System.out.println(Math.abs(-10));

//        floor() : 소수점 내림
//        ceil() : 소수점 올림
//        round() : 소수점 반올림
        System.out.println("<Printing out floor, ceil, round>");

        System.out.println(Math.floor(5.3));
        System.out.println(Math.ceil(5.3));
        System.out.println(Math.round(5.3));

//        max, min
        System.out.println("<Printing out max and min>");

        System.out.println(Math.max(5, 1));
        System.out.println(Math.min(5, 1));

//        pow(a,b) : a의 b제곱
        System.out.println("<Printing out power>");
        System.out.println(Math.pow(2, 5));

//        sqrt() : 제곱근 연산 수행
        System.out.println("<Printing out square root>");
        System.out.println(Math.sqrt(49));

//        ex) 1~n까지의 숫자 중 소수의 개수 구하기
        int n = 100;
        List<Integer> prime_number = new ArrayList<>();
        for(int i= 2; i < (int)Math.sqrt(n); i++){
            if(n%i!=0){
                prime_number.add(i);
            }
        }
        System.out.println(prime_number);

    }
}
