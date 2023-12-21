package C15AnonymousLambda;

public class C1503LambdaExpression {
    //    람다 표현식은 함수에 이름이 없는 익명 함수를 구현하기 위해 사용
    public static void main(String[] args) {
//        실행문 1개일 경우는 {}제외+return 필요
//        실행문 2개 이상일 경우 {} 포함+return 필요

//        LambdaInterface li = (str1, str2) -> str1 + str2;
//        li.makeString("Hello", "Minions");

        LambdaInterface li = (str1, str2, num) -> {
            String answer = str1 + " " + str2;
            return answer;
        };

        System.out.println(li.makeString("Hello", "Minions", 0));
    }
}

interface LambdaInterface {
    String makeString(String str1, String str2, int num);
}