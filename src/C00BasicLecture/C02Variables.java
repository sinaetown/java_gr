package C00BasicLecture;

import java.math.BigDecimal;

public class C02Variables {
    public static void main(String[] args) {
//        byte로 썼을 때, -128~127까지의 표현이 가능하고 그 이상을 세팅할 때 오버.언더 플로우 발생.
        byte b1 = 127;
        byte b2 = -128;
        b1++;
        b1--;
        System.out.println("b1 value: " + b1);
        System.out.println("b2 value: " + b1);

//        실수: float, double(기본)
        float f = 1.123456789f;
        double d = 1.123456789;
        System.out.println("f value: " + f);
        System.out.println("d value: " + d);

//        부동 소수점 오차 테스트
        double double_num = 0.1;
//        미세 오차는 조정되어 정상적으로 출력
        System.out.println("Checking error with double: " + double_num);

//        반복적인 연산시 오차가 확대되어 오차 확인 가능
        double m1 = 0;
        for (int i = 0; i < 1000; i++) {
            m1 += double_num;
        }
        System.out.println("When added 1000 times (with error): " + m1);

        double m2 = 0;
        for (int i = 0; i < 1000; i++) {
            m2 += (double_num * 10);
        }
        m2 /= 10;
        System.out.println("When added 1000 times (without error): " + m2);

//        저장할 때에는 문자열 -> 연산할 때에는 정수로 변환 -> 최종 결과는 실수로 반환
        double bd1 = 1.03;
        double bd2 = 0.42;
        System.out.println("Double subtraction: " + (bd1 - bd2));
        BigDecimal myBig1 = new BigDecimal("1.03"); //메모리에 저장되는 순간 오차가 발생함 -> 어떻게든 오차 안 나오게 하려고
        BigDecimal myBig2 = new BigDecimal("0.42");
        System.out.println("Double subtraction in BigDecimal: " + myBig1.subtract(myBig2));

        double result = myBig1.subtract(myBig2).doubleValue();
        System.out.println("From BigDecimal to double vallue: " + result);

//        문자 : char
        char my_char = '가';
        System.out.println("Printing out character: " + my_char);
//    boolean : true (1) / false (0)
        boolean my_bool = true;
        System.out.println("my_bool value: " + my_bool);
        if (my_bool) {
            System.out.println("The variable my_bool is true!");
        }

        int bool_num1 = 20;
        int bool_num2 = 10;
        if (bool_num1 > bool_num2) {
            System.out.println("The given conditional is true.");
        }

        boolean[] my_boolean_arr = new boolean[5];
        System.out.println(my_boolean_arr[1]);
//        묵시적 타입 변환
        char ch1 = 'a';
//        In ASCII : a = 97 , A = 65
        int ch1_num = ch1;
        System.out.println("For comparing uppper/lowercased alphabet: " + ('A' > 'a')); //false
        System.out.println("Converting char to int (=> into ASCII code): " + ch1_num);

        int my_int1 = 10;
//        int -> double 가능
        double my_double1 = my_int1;
        System.out.println("Converting int to double: " + my_double1);

//        double -> int 자동으로는 불가, 명시적으로는 가능
//        에러 발생
//        my_int1 = my_double1;
//        명시적 타입은 가능 : 소수점값 손실발생 가능성이 있다
        my_int1 = (int) my_double1;

        double my_double2 = 7.2f;
        System.out.println("Converting float to double: " + my_double2);

//        명시적 타입 변환
        char my_char2 = 'b';
        int char_num = (int) my_char2;
//        int first가 1, int second가 4일 때 둘을 나눈 값을 int에 담아 출력, double에 각각 담아 출력
        int first = 1;
        int second = 4;
        int res1 = first / second;
        double res2 = (double) first / second;
        System.out.println("Divison as int result: " + res1);
        System.out.println("Divison as double result: " + res2);

//        변수와 상수

//        선언과 동시에 초기화
        int var1 = 10;
//        변수값 변경
        var1 = 20;
//        선언만 한 뒤에 나중에 초기화
        int var2; // 지역변수는 int는 선언만 했을 경우, 값은 0으로 초기화되지 않으나 객체로 선언될 때는 0으로 초기화
//        <-> string일 경우는 null, boolean일 경우는 false로 초기화
        var2 = 20;
//        객체로 만들 때는 0으로 초기화
        int[] arr = new int[5];
        System.out.println("When just declared: " + arr[0]);

//        cf) class의 멤버 변수 인 경우 int, String 등의 자료형들이 초기화됨,
//        기본형 변수는 기본형의 타입에 맞게 초기화, 참조형 데이터는 null로 초기화

//        cf) 지역변수인 경우 초기화 되지 않음
//        상수
        final int AGES = 20;
//        상수는 값의 재할당이 불가능 AGES = 30 -> 에러 발생
//        상수는 선언만 한 뒤에 나중에 초기화 하는 방식은 JAVA8 이후로 가능해짐
        final int AGES2;
        AGES2 = 20;
    }
}
