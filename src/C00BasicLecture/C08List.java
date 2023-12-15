package C00BasicLecture;

import java.util.*;
import java.util.stream.Collectors;

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
        System.out.println("Initiating list : " + myList);

//        초기값 생성방법 2) 한꺼번에 add
//        배열을 집어넣고 싶을 때 -> 그냥 배열 자체를 집어 넣으면 형변환 이슈
        String[] myArr1 = {"java", "python", "c"};
        List<String> myList2 = new ArrayList<>(Arrays.asList(myArr1));

//        배열이 Integer가 아닌 int인 경우!
//        List에 그대로 들어갈 수 없음!
//        그냥 하나하나 for loop으로 돌려서 넣어줘도 됨 -> int를 Integer로 auto boxing 해줌
        int[] myIntArr1 = {1, 2, 3};
        List<Integer> myIntList = new ArrayList<>();
        for (int a : myIntArr1) {
            myIntList.add(a);
        }

        System.out.println("Array to list : " + myIntList);

        List<Integer> myList3 = new ArrayList<>();
        myList3.add(10);
        myList3.add(20);
        myList3.add(1, 15); // 중간에 값 삽입 시, 성능 저하, 값들이 하나씩 밀리게 됨

        System.out.println("Adding element #1: " + myList3);

        List<Integer> myList4 = new ArrayList<>();
        myList4.add(30);
        myList4.add(40);
        myList4.add(50);

        System.out.println("Adding element #2 : " + myList4);

//        addAll(Collection 객체) : 특정 리스트의 요소를 모두 add
        List<Integer> myList5 = new ArrayList<>();
        myList5.addAll(myList4);

        System.out.println("addAll() from myList4 : " + myList5);

//        get(int index) : 특정 위치의 요소를 반환
        List<Integer> myList6 = new ArrayList<>();
        myList6.add(10);
        myList6.add(15);
        myList6.add(20);
        myList6.add(30);
        myList6.add(40);
        myList6.add(50);

//        size()는 리스트 안에 들어있는 원소들의 개수 반환
        for (int l = 0; l < myList6.size(); l++) {
            System.out.println("From myList6 : " + myList6.get(l));
        }

//        remove : 요소 삭제
//        value삭제와 index통한 삭제 둘 다 가능
//        index를 찾기의 시간 복잡도 : O(1)
        myList6.remove(0);
        System.out.println("Removing index 0 from myList6 : " + myList6);

//        객체를 통한 삭제 : Intger.valueOf
        myList6.remove(Integer.valueOf(15));
        System.out.println("Removing element 15 from myList6 : " + myList6);

//        set(int index ,E element) : index자리에 값 변경
        myList6.set(myList6.size() - 1, 100);
        System.out.println("Setting last element to 100 myList6 : " + myList6);

//        contains(E element) : 특정 값이 있는지 없는지 boolean return
        System.out.println("Does 30 exist in myList6? : " + myList6.contains(30));

        List<Integer> myList7 = new ArrayList<>();
        myList7.add(10);
        myList7.add(10);
        myList7.add(20);
        myList7.add(30);

//        indexOf() : 몇 번째 index에 위치해 있는지 return
//        값이 없으면 -1을 return
//        값이 중복될 경우 제일 처음으로 등장하는 element 기준
        System.out.println("Where's 10 in myList7? : " + myList7.indexOf(10));

//        값이 비었는지 안 비었는지 확인 : isEmpty()
        System.out.println("Is myList7 empty? : " + myList7.isEmpty());
//        전체 삭제 : clear()
        myList7.clear();
        System.out.println("Clear myList7 : " + myList7);

        System.out.println("Now, is myList7 empty? : " + myList7.isEmpty());

//        Array를 요소로 가지고 있는 List 출력
        List<int[]> myList8 = new ArrayList<>();
        myList8.add(new int[]{1, 2, 3});
        myList8.add(new int[2]);
        myList8.add(new int[3]);
        myList8.get(1)[0] = 10;
        myList8.get(1)[1] = 20;
//        myList8.get(1)[2] = 30; // 이건 불가! get(1)자리는 array의 길이가 2
//        System.out.println("myList8 : " + myList8); -> 주소값 리턴

//        Method1) List안에 들어있는 배열 한 개씩 프린트
//        for(int i = 0; i < myList8.size(); i++){
//            System.out.println(Arrays.toString(myList8.get(i)));
//        }

//        Method2) List안에 들어있는 배열 한 개씩 프린트
        System.out.println("-----List 8 printing-----");
        for (int[] a : myList8) {
            System.out.println(Arrays.toString(a));
        }

//        List를 요소로 가지고 있는 List 출력
        List<List<Integer>> myList9 = new ArrayList<>();
        myList9.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        myList9.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        myList9.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        System.out.println("-----List 9 printing-----");

//        Method1)
        System.out.println(myList9);

//        Method2)
        for (List<Integer> l : myList9) {
            System.out.println(l);
        }

//        예제: 123 102030 100200300 넣기
        List<int[]> myList10 = new ArrayList<>();
        myList10.add(new int[3]);
        myList10.add(new int[3]);
        myList10.add(new int[3]);

        System.out.println("-----List 10 printing-----");
        int num = 1;
        for (int i = 0; i < myList10.size(); i++) {
            num = 1 * (int) Math.pow(10, i);
            for (int j = 0; j < myList10.get(i).length; j++) {
                myList10.get(i)[j] = num;
                num += 1 * (int) Math.pow(10, i);
            }
        }
        for (int[] a : myList10) {
            System.out.println(Arrays.toString(a));
        }

//        정렬
        List<Integer> myList11 = new ArrayList<>(Arrays.asList(5, 3, 2, 1, 5));
//        리스트 정렬 1: Collections.sort()
        Collections.sort(myList11);
        System.out.println("Sorting myList11 #1: " + myList11);
        Collections.sort(myList11, Comparator.reverseOrder());
        System.out.println("Reversing myList11 #1: " + myList11);

//        리스트 정렬 2: 객체.sort()
        myList11.sort(Comparator.naturalOrder());
        System.out.println("Sorting myList11 #2: " + myList11);

        myList11.sort(Comparator.reverseOrder());
        System.out.println("Sorting myList11 #2: " + myList11);

//        1. String 배열을 list로 변환
        String[] str_arr = {"python", "C", "java"};

//        1-1. Arrays.asList()
        List<String> myList12 = new ArrayList<>(Arrays.asList(str_arr));
        System.out.println("Converting String Array to String List : " + myList12);

//        1-2. for 문 담기
        List<String> myList13 = new ArrayList<>();
        for (int i = 0; i < str_arr.length; i++) {
            myList13.add(str_arr[i]);
        }
        System.out.println("Converting String Array to String List with for loop: " + myList13);

//        1-3. StreamAPI (참고)
        List<String> myList14 = Arrays.stream(str_arr).collect(Collectors.toList());
        System.out.println("Converting String Array to String List with streamAPI: " + myList14);


//        2. int배열을 list로 변환
//        2-1. Arrays.asList() 사용 불가 ->
//        2-2. for 문 사용 가능
//        2-3. StreamAPI
        int[] int_arr = {1, 2, 3, 4, 5};
        List<Integer> myList15 = Arrays.stream(int_arr).boxed().collect(Collectors.toList());
        System.out.println("Converting int Array to int List with streamAPI: " + myList15);

//        3. String리스트를 String배열로 전환
//        3-1.for문 사용 가능
        List<String> myList16 = new ArrayList<>();
        myList16.add("hello");
        myList16.add("hi");

        String[] arr16 = new String[myList16.size()];
        for (int i = 0; i < myList16.size(); i++) {
            arr16[i] = myList16.get(i);
        }

        System.out.println("Converting String List to String Array: " + Arrays.toString(arr16));

//        3-2. StreamAPI
        String[] arr16_stream = myList16.stream().toArray(a -> new String[a]);

//        4. int 리스트를 int 배열로 반환
//        4-1. for 문 사용 가능
//        4-2. streamAPI로 변환

    }
}
