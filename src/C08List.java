import java.util.*;

public class C08List {
    public static void main(String[] args) {
//        List 선언 방법

//        *String in <> can be omitted
//        ArrayList<String> myList = new ArrayList<String>();

//        가장 일반적인 방식
//        왼쪽에는 인터페이스, 오른쪽엔 구현체
        ArrayList<String> myList = new ArrayList<>();

//        초기값 생성방법 1) 하나씩 add
        myList.add("java");
        myList.add("python");
        myList.add("c++");
        System.out.println(myList);

//        초기값 생성방법 2) 한꺼번에 add
        String[] myArr1 = {"java", "python", "c"};
        List<String> myList2 = new ArrayList<>(Arrays.asList(myArr1));

//        배열이 Integer가 아닌 int인 경우!
//        List에 그대로 들어갈 수 없음!
        int[] myIntArr1 = {1, 2, 3};
        List<Integer> myIntList = new ArrayList<>();
        for (int a : myIntArr1) {
            myIntList.add(a);
        }

        System.out.println(myIntList);
    }
}
