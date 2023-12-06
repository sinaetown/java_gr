import java.util.*;

public class C04IfStatements {
    public static void main(String[] args) {

//        Password as INT
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password: ");
        int pwd = sc.nextInt();

        if (pwd == 1234) {
            System.out.println("UNLOCKED! The door is now opened.");
        } else {
            System.out.println("Wrong Password!");
        }

//        Password as STRING
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the password (string is also fine!): ");
        String pwd2 = sc2.nextLine();

        if (pwd2.equals("0234")) {
            System.out.println("UNLOCKED! The door is now opened.");
        } else {
            System.out.println("Wrong Password!");
        }

//        묵시적 타입 변환
//        a: 97, A: 65
//        b: 98, B: 66 ...
//        사용자한테 알파벳을 입력받고, 그 알파벳이 대문자인지 소문자인지 판별
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter any alphabet: ");
        int alpha = sc3.nextLine().charAt(0);
        if ((alpha >= 'A') && (alpha <= 'Z')) {
            System.out.println("This is an UPPERCASED alphabet.");
        } else if ((alpha >= 'a') && (alpha <= 'z')) {
            System.out.println("This is a LOWERCASED alphabet.");
        } else {
            System.out.println("This is NOT an alphabet.");
        }

//        버스카드 예제 : 내 돈 얼마 있는지 입력 -> 버스 요금은 1500원, 도난 여부 확인
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter your money left in the card: ");
        int money_left = sc4.nextInt();
        boolean robbed = true;

//        Method 1) AND
        if (money_left >= 1500 && !(robbed)) {
            System.out.println("Hop right in!");
        } else {
            System.out.println("Sorry, you can't ride in.");
        }

//        Method 2) OR
//        if(money_left < 1500 || (robbed)){
//            System.out.println("Sorry, you can't ride in.");
//
//        }
//        else {
//            System.out.println("Hop right in!");
//        }

//        Method 3) 삼항연산자 Ternary Operator
//        String msg_result = (money_left >= 1500 & !(robbed)) ? "Hop right in!" : "Sorry, you can't ride in.";
//        System.out.println("Usinig Ternary Operator: " + msg_result);

//        Else if, Else 활용
        int my_money = 10000, taxi = 10000, bus = 3000, kickboard = 2000, walk = 0;
        if (my_money >= taxi) {
            System.out.println("Taxi recommended.");
        } else if (my_money >= bus) {
            System.out.println("Bus recommended.");
        } else if (my_money >= kickboard) {
            System.out.println("kickboard recommended.");
        } else {
            System.out.println("Just walk.");
        }

//        Switch문
        Scanner s5 = new Scanner(System.in);
        System.out.println("고객센터 상담 연결을 위한 번호를 누르세요: ");
        int pressed = s5.nextInt();
        switch (pressed) {
            case 1:
                System.out.println("1번! 대출서비스");
                break;
            case 2:
                System.out.println("2번! 예금 서비스");
                break;
            case 3:
                System.out.println("3번! 적금 서비스");
                break;
            case 4:
                System.out.println("0번! 상담사 연걸");
                break;
            default:
                System.out.println("잘못된 번호입니다");
                break;
        }
    }
}
