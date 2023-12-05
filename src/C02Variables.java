import java.math.BigDecimal;

public class C02Variables {
    public static void main(String[] args) {
/*//        byte로 썼을 때, -128~127까지의 표현이 가능하고 그 이상을 세팅할 때 오버.언더 플로우 발생.
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
        for(int i = 0; i < 1000; i++){
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
        System.out.println("Double subtraction: " + (bd1-bd2));
        BigDecimal myBig1 = new BigDecimal("1.03"); //메모리에 저장되는 순간 오차가 발생함 -> 어떻게든 오차 안 나오게 하려고
        BigDecimal myBig2 = new BigDecimal("0.42");
        System.out.println("Double subtraction in BigDecimal: "+ myBig1.subtract(myBig2));

        double result = myBig1.subtract(myBig2).doubleValue();
        System.out.println("From BigDecimal to double vallue: "+result);*/

//        문자 : char
        char my_char = '가';
        System.out.println(my_char);
//    boolean : true (1) / false (0)
        boolean my_bool = true;
        System.out.println("my_bool value: "+my_bool);
        if(my_bool){
            System.out.println("The variable my_bool is true!");
        }

        int bool_num1 = 20;
        int bool_num2 = 10;
        if
    }
}
