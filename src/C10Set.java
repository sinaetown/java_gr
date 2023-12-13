import java.util.*;

public class C10Set {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("h");
        mySet.add("h");
        mySet.add("e");
        mySet.add("l");
        mySet.add("l");
        mySet.add("o");
        System.out.println("Printing mySet : " + mySet); //순서 안 가짐, 중복도 제거

//        반 학생들이 좋아하는 운동 종목
        List<String> myList = new ArrayList<>();
        myList.add("basketball");
        myList.add("basketball");
        myList.add("basketball");
        myList.add("baseball");
        myList.add("baseball");
        myList.add("tennis");
        myList.add("tennis");

        Set<String> sports = new HashSet<>();
        for (int i = 0; i < myList.size(); i++) {
            sports.add(myList.get(i));
        }
        System.out.println("Sports w/o repetition: " + sports.size());

//        list를 인자값으로 받아 초기값 세팅 가능
//        배열을 인자값으로 받아 set 초기값 세팅

        String[] strArr = new String[]{"Hello", "Java", "World", "Hello", "Java"};
        Set<String> mySet2 = new HashSet<>(Arrays.asList(strArr));
        mySet2.remove("Hello");
        System.out.println("String Array to Set: " + mySet2);

//        int 배열은 형변환 이슈! 하나씩 쪼개서 해주기
        int[] intArr = {1, 2, 3, 4, 4, 3, 2};
        Set<Integer> mySet3 = new HashSet<>();
        for (int a : intArr) {
            mySet3.add(a);
        }
        System.out.println("Int Array to Set: " + mySet3);

//        교집합 : a.retainAll(b) -> a 값이 변경됨
//        합집합 : a.addAll(b) -> a 값이 변경됨
//        차집합 : a.removeAll(b) -> a 값이 변경됨
        Set<String> mySet4 = new HashSet<>(Arrays.asList("java", "python", "javascript"));
        Set<String> mySet5 = new HashSet<>(Arrays.asList("java", "html", "css"));

        Set<String> tempSet = new HashSet<>(mySet4);
        tempSet.retainAll(mySet5);
        System.out.println("After retainAll : " + tempSet);

        tempSet = new HashSet<>(mySet4);
        tempSet.addAll(mySet5);
        System.out.println("After addAll : " + tempSet);

        tempSet = new HashSet<>(mySet4);
        tempSet.removeAll(mySet5);
        System.out.println("After removeAll : " + tempSet);

//        https://school.programmers.co.kr/learn/courses/30/lessons/42577

//        순서가 없기에 enhanced for 문, iterator 사용
//        LinkedHashSet, TreeSet
        Set<String> myTreeSet = new TreeSet<>();
        myTreeSet.add("hello5");
        myTreeSet.add("hello4");
        myTreeSet.add("hello3");
        myTreeSet.add("hello2");
        myTreeSet.add("hello1");
    }
}
