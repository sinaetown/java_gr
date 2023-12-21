package C15AnonymousLambda;

import java.util.Arrays;

public class C1505StreamAPI1 {
    public static void main(String[] args) {
        int[] arr = {20, 10, 4, 12};
        System.out.println("<With for loop>");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그래밍 방식
//        Java에서 함수형 프로그래밍을 지원하기 위한 라이브러리 -> StreamAPI

//        foreach() : stream의 각 요소를 소모하면서 동작을 수행, 원본에는 영향 없음
//        vs map()은 새로운 객체를 만들어냄 (소모 x)
        System.out.println("<FOREACH With Stream>");
        Arrays.stream(arr).forEach(a -> System.out.println(a));

        System.out.println("<SORTED and FOREACH With Stream>");
        Arrays.stream(arr).sorted().forEach(a -> System.out.println(a));
        String[] myArr = {"hello", "there", "look"};
        String[] newArr = Arrays.stream(myArr).sorted().toArray(String[]::new);

    }
}
