public class C03Operator {
    public static void main(String[] args) {
//        +, *, /, %
        int num1 = 8, num2 = 3;
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 * num2 = " + num1 * num2);
        System.out.println("num1 / num2 = " + num1 / num2);
        System.out.println("num1 / num2 (in double) = " + (double) num1 / num2);
        System.out.println("num1 % num2 = " + num1 % num2);

//        대입연산자
        int n1 = 7, n2 = 7, n3 = 7;
        n1 = n1 - 3;
        n2 -= 3;
        n3 = -3;

//        /=, %=
        int n4 = 10;
        n4 /= 3;
        System.out.println("/= " + n4);

        int n5 = 10;
        n5 %= 3;
        System.out.println("%= " + n5);

//        증감연산자
        int a = 5;
        int b = a++; //후위연산자 : 실행문이 끝나고 증감

        System.out.println("a value: " + a); //6
        System.out.println("b value: " + b); //5

        int aa = 5;
        int bb = ++aa; //전위연산자 : 실행문이 끝나기 전에 증감
        System.out.println("aa value: " + aa); //6
        System.out.println("bb value: " + bb); //6

//
        char char1 = 'a';
        char char2 = 'A';

        System.out.println(char1 == char2 ? true : false);

//        논리연산자 : &&, ||, !
        int i = 10, j = 20;
        boolean result1, result2;
        result1 = (i > 5) && (i < 20);
        result2 = (j > 10) || (j < 30);
        System.out.println("Result 1 : " + result1);
        System.out.println("7" + "3" + 1);
        System.out.println("Result 2 : " + result2);
        System.out.println("NOT Result 2 : " + !result2);

//        비트연산자

        int x1 = 5; // 0000101 (부호 identifier 생략)
        int x2 = 6; // 0000110 (부호 identifier 생략)

        System.out.println("Bit operator &: " + (x1 & x2)); //&, 각 자리에 있는 숫자가 모두 1일 경우만 1이 됨
        System.out.println("Bit operator |: " + (x1 | x2)); //|, 각 자리에 있는 숫자가 하나라도 1일 경우는 1이 됨
        System.out.println("Bit operator ^: " + (x1 ^ x2)); //^, 각 자리에 있는 숫자가 일치하지 않을 경우는 1이 됨
        System.out.println("Bit operator ~: " + ~x1); //첫째 자리(부호 identifier)도 반대로 변함

//        시프트 연산자 : <<. >>은 곱셈과 나눗셈의 효과가 발생
        System.out.println("Shift operator <<: " + (x1 << 1)); // 0001010

        int y1 = 13; // 00001101
        int y2 = 9; //  00001001
        while (y2 != 0) {
            int same_bit = y1 & y2; // finding the carry value
            y1 = y1 ^ y2; // XOR 연산으로 구한 비트값 a에 할당
            y2 = same_bit << 1; // 자리 올림 수
        }
        System.out.println(y1);

//        first loop :
//        same_bit = 1001
//        a: 00100
//        b: 10010

//        second loop:
//        same_bit = 0000
//        a: 10110

//        cf) Difference between & and &&
        int p = 10, q = 20;
//        if(p>20 && q<30) vs if(p>20 & q<30)
        System.out.println();

    }
}
