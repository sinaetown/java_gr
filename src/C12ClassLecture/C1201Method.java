package C12ClassLecture;

public class C1201Method {
    public static void main(String[] args) {
//        for loop 이용해서 1~10까지의 합 출력
//        10~20의 경우도 마찬가지로 중복된 코드가 나옴
//        코드의 중복이 발생하기에 코드의 반복을 피하기 위해 특정 기능 집합을 별도로 분리
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum 1~10 : " + sum);
        int total = sum_acc(100, 200);
        System.out.println("Sum_acc Function call : " + total);

//        같은 클래스 내의 메서드들 사이에서의 호출은 static 메서드라 할지라도 클래스명 생략 가능
//        System.out.println(C1201Method.sum_acc(1,10)); 가 디폴트!

//        메서드 구성요소 : 접근 제어자 (default는 public),
//        클래스 메서드 여부 (static가 있으면 클래스 메서드, 없으면 객체 메서드),
//        반환타입, 매개변수

    }

//    void : doesn't return anything
//    int, String 등 리턴  타입 명시

    public static int sum_acc(int a, int b) { //(public) static void
        int total = 0;
        for (int i = a; i <= b; i++) {
            total += i;
        }
//        return 키워드를 통해서 연산 결과값을 반환
        return total;
    }
}