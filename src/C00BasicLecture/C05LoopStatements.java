package C00BasicLecture;

import java.util.*;

public class C05LoopStatements {
    public static void main(String[] args) {
//        int a = 2;
//        while (a < 11) {
//            System.out.println(a);
//            a++;
//        }
//
////        구구단 예제
////        while(true) {
////            Scanner sc1 = new Scanner(System.in);
////            System.out.print("구구단 몇 단? : ");
////            int mul = sc1.nextInt();
////            int i = 1;
////            while (i < 10) {
////                System.out.println(mul + " X " + i + " = " + (mul * i));
////                i++;
////            }
////        }
//
////        if문 예제 : 비밀번호를 맞추면 반복 종료, 그렇지 않으면 계속 물어보기
//        Scanner sc2 = new Scanner(System.in);
//        String password = "0234";
//        int count = 0;
//        while (count < 5) {
//            System.out.print("Enter the door lock password : ");
//            String pwd = sc2.nextLine();
//            if (!pwd.equals(password)) {
//                System.out.println("Wrong!");
//                count++;
//            } else {
//                System.out.println("Door opens!");
//                break;
//            }
//            if (count == 5) {
//                System.out.println("Exceed the limit.");
//            }
//        }
//
////        Do-While문
//        do {
//            System.out.print("Enter the door lock password : ");
//            String pwd = sc2.nextLine();
//            if (!pwd.equals(password)) {
//                System.out.println("Wrong!");
//                count++;
//            } else {
//                System.out.println("Door opens!");
//                break;
//            }
//            if (count == 5) {
//                System.out.println("Exceed the limit.");
//            }
//        } while (count < 5);
//
////        2부터 10까지 출력
//        for (int i = 2; i < 11; i++) {
//            System.out.println("For loop: " + i);
//        }
//
////       홀수 번호만 출력
//        for (int q = 1; q <= 10; q++) {
//            if (q % 2 == 0) {
//                continue;
//            } else {
//                System.out.println("Odd number: " + q);
//            }
//        }
//
////        배열과 Enhanced for문
//        int[] myArr = {1, 5, 7, 9, 10};
//        System.out.println("Index 2 : " + myArr[2]);
//
////        일반 for문
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Index " + i + " : " + myArr[i]);
//        }
//
////        Enhanced for문 -> 순서가 없는 set과 map에서 사용! (물론 Iterator도 사용 가능)
//        for (int j : myArr) {
//            System.out.println("(Enhanced For Loop) Index " + j + " : " + j);
//        }
//
////        모든 값에 +5하기
//        for (int i = 0; i < myArr.length; i++) {
//            myArr[i] += 10;
//        }
//        System.out.println(Arrays.toString(myArr));
//
////        모든 값에 +5하기 (enhanced for loop) -> 안 됨!
//        for (int q : myArr) {
//            q += 10;
//        }
//        System.out.println(Arrays.toString(myArr));
//
////        자바 변수의 유효 범위 : {}
//        int num = 10;
//        if (num > 1) {
//            int abc = 20;
//            num = 20;
//        }
////        System.out.println(num); -> 20 (if문 밖에서 선언된 변수 값을 if안에서 접근해서 변경하는 것은 가능)
////        System.out.println(abc); -> error (if문 안에서 정의된 변수는 밖에서 인지 불가)
//
////        구구단 예제2: 2단~9단 출력, "n단 입니다" 출력(Nested For Loop)
//        for (int m1 = 2; m1 < 10; m1++) {
//            System.out.println();
//            System.out.println(m1 + "단 입니다!");
//            for (int m2 = 1; m2 < 10; m2++) {
//                System.out.println(m1 + " X " + m2 + " = " + (m1 * m2));
//            }
//        }

//        2중 for문을 통해 배열 접근
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

//      라벨문
        loop1:
        for(int i = 0; i < 5; i++){
            loop2:
            for(int j = 0; j < 5; j++){
                System.out.println("Hello World");
                if(j==2){
//                    break; //Hello World 15번 출력
//                    break loop1; //Hello World 3번 출력
                }
            }
        }

//
    }
}
