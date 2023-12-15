package C00BasicLecture;

import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) {
//        OUTPUT
        int a = 20;
//        print는 출력 후 줄바꿈 없음
//        println은 출력 후 줄바꿈
        System.out.print(a);
        String my_string = "Hello There";
        System.out.println(my_string + a);

//        숫자와 숫자를 더하면 더하기 연산이 된다
        System.out.println(10 + 20);

//        INPUT = System.in (키보드 입력) + Scanner (입력을 위한 클래스)
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter anything (string): ");
//        nextLine은 입력 받은 data를 한 줄 읽어서 String으로 리턴
        String inputs = myScan.nextLine(); // 여기서 사용자가 입력
        System.out.println("What you entered (string) : " + inputs);

//         nextInt는 입력 받은 data를 한 줄 읽어서 int로 리턴
        System.out.print("Enter anything (int): ");
        int inputs_int = myScan.nextInt();
        System.out.println("What you entered (int) : " + inputs_int);

//        더하기 실습
        System.out.println("Enter two integers: ");
        int num1 = myScan.nextInt();
        int num2 = myScan.nextInt();
        System.out.printf("%d + %d equals %d", num1, num2, num1 + num2);

//        nextDouble통해서 소수점 입력 후 출력해주세요
        System.out.println("Enter a double: ");
        double double1 = myScan.nextDouble();
        System.out.println("What you entered: " + double1);
        System.out.println("Enter a boolean: ");
        boolean boolean1 = myScan.nextBoolean();
        System.out.println("What you entered: " + boolean1);

//        시스템 메모리 해제
        myScan.close();
    }
}