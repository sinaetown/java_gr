package C15AnonymousLambda;

import javax.swing.text.html.Option;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;

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

//        스트림의 생성
//        stream<객체> : generic 타입으로 stream 객체가 생성
        String[] stArr = {"HTML", "CSS", "JAVA", "PYTHON"};
        Stream<String> stStream = Arrays.stream(stArr);
        Stream<String> stStream2 = Arrays.stream(stArr);

        int[] intArr = {10, 20, 30, 40, 50};
        IntStream intStream = Arrays.stream(intArr);

        int[] intArr2 = intStream.filter((a) -> a >= 20).toArray();
        System.out.println("<IntStream to Array>");
        System.out.println(Arrays.toString(intArr2));

//        참조변수의 스트림 변환의 경우, generic의 타입 소거 문제 발생
//        generic의 타입 소거란 Java버전의 호환성을 위해 제네릭 타입을
//        런타임 시점에 제거하는 것을 의미

        String[] stArr2 = stStream.filter(a -> a.length() <= 4).toArray(a -> new String[a]);
        System.out.println("<String Array>");
        System.out.println(Arrays.toString(stArr2));

//        메소드 참조 방식으로 표현하는 것이 더 일반적
//        메소드 참조 방식 : 클래스::메서드
        String[] stArr3 = stStream2.filter(a -> a.length() <= 4).toArray(String[]::new);
        System.out.println("<String Array - Method reference>");
        System.out.println(Arrays.toString(stArr3));

//        Stream 중개연산 : filter, map, sorted, distinct

//        distcint : 중복 제거 후, 스트림 반환
        int[] intArr3 = {10, 20, 30, 30, 50};
        int answer = Arrays.stream(intArr3).distinct().sum(); //중복제거 후 숫자들의 총합 반환
        System.out.println(answer);

        String[] stArr4 = {"JAVA", "CSS", "JAVA", "PYTHON", "C++"};
        String[] stArrNo = Arrays.stream(stArr4).distinct().toArray(String[]::new);
        System.out.println(Arrays.toString(stArrNo));

//        중복 제거 후, 길이가 3개 이하인 요소로 제한한 후, 남은 배열의 길이의 총합
//        mapToInt를 통해 IntStream으로 변환이 됨
        int s = Arrays.stream(stArr4).distinct().filter(a -> a.length() <= 3).mapToInt(a -> a.length()).sum();
        System.out.println("Counts : " + s);

//        sorted : 정렬된 스트림 반환
        int[] intArr4 = {5, 1, 2, 3, 5, 7};
        int[] intArr4Sorted = Arrays.stream(intArr4).sorted().toArray();
        System.out.println("Sorted Array : " + Arrays.toString(intArr4Sorted));

        List<Integer> myList = new ArrayList<>(Arrays.asList(5, 1, 2, 3, 5, 7));
//        collect(구체적인_컬렉션_객체_명시)
        List<Integer> myList2 = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Reversed Sorted : " + myList2);

        List<String> stList = new ArrayList<>(Arrays.asList("java", "python", "C++", "javascript"));
//        StreamAPI를 사용해서 문자열의 길이를 기준으로 정렬 후 신규 LIST생성
//
        List<String> stListSorted = stList.stream().filter(a -> a.length() >= 4)
                .sorted((o1, o2) -> o2.length() - o1.length()).collect(Collectors.toList());
        System.out.println("Order by length : " + stListSorted);

        int[] arr_before_plus10 = {1, 2, 3, 4, 5};
        int[] arr_after_plus10 = Arrays.stream(arr_before_plus10).map(a -> a + 10).toArray();
        System.out.println("After plus 10 : " + Arrays.toString(arr_after_plus10));

//        주어진 배열에서 짝수만 골라서 해당 수의 제곱의 종합을 구하라
        int[] arr_powerOf = {3, 2, 9, 6, 4, 8};
        int answerPowerOf = Arrays.stream(arr_powerOf).filter(a -> a % 2 == 0).map(a -> a * a).sum();
        System.out.println(answerPowerOf);

//        스트림 소모 : forEach, reduce
        int[] intArr5 = {10, 20, 30, 40};
        System.out.println("Reduced : ");
        Arrays.stream(intArr5).forEach(System.out::println);

//        reduce : 누적 연산
//        초기값을 지정하지 않으면 optional 객체를 return한다
//        Optional 객체 : 값이 있을 수도, 없을 수도 있다는 것을 명시한 타입 (Java8 이후 추가)
        Optional<String> myOptional = Optional.ofNullable("Hello");
        if (myOptional.isPresent()) {
            System.out.println(myOptional.get().length());
        } else {
            System.out.println("Error caused!");
        }

//        누적 곱
        int result1 = Arrays.stream(intArr5).reduce(1, (a, b) -> a * b); //preferred
        int result1_1 = Arrays.stream(intArr5).reduce((a, b) -> a * b).getAsInt(); //초기값을 가장 첫 element로 설정

        System.out.println("Result acc mul1 : " + result1);
        System.out.println("Result acc mul1_1 : " + result1_1);


//        누적 합
        int result2 = Arrays.stream(intArr5).reduce(0, (a, b) -> a + b); //preferred
        int result2_1 = Arrays.stream(intArr5).reduce((a, b) -> a + b).getAsInt(); //초기값을 가장 첫 element로 설정

        System.out.println("Result acc sum2 : " + result2);
        System.out.println("Result acc sum2_1 : " + result2_1);

        String[] stArr5 = {"hello", "java", "world"};
//        String stArr5Res = Arrays.stream(stArr5).reduce("", (a, b) -> a + b + ", ");
        Optional<String> stArr5Res = Arrays.stream(stArr5).reduce((a, b) -> a + ", " + b);
        if (stArr5Res.isPresent()) {
            System.out.println(stArr5Res.get());
        }

//        최소/최대/평균/총합/개수 : min/max/average/sum/count
        List<Integer> myList3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

//        myList3.stream().min((o1, o2) -> o1 - o2).get();
        System.out.println(myList3.stream().mapToInt(a -> a).min().getAsInt());

        myList3.stream().mapToInt(a -> a).max().getAsInt();
        System.out.println(myList3.stream().max((o1, o2) -> o1 - o2).get());

//        myList3.stream().reduce(0, (a, b) -> a + b);
        System.out.println(myList3.stream().mapToInt(a -> a).sum());

//         myList3.stream().reduce(0, (a, b) -> a + 1);
        System.out.println(myList3.stream().mapToInt(a -> a).count());

        System.out.println(myList3.stream().mapToInt(a -> a).average().getAsDouble());

//        findFirst -> return값: optional
        List<Student> myStudents = new ArrayList<>();
        myStudents.add(new Student("Sally", 23));
        myStudents.add(new Student("Thomas", 37));
        myStudents.add(new Student("Penny", 58));
        myStudents.add(new Student("Zack", 51));
        myStudents.add(new Student("Owen", 33));


        Student s1 = myStudents.stream().filter(a -> a.getAge() >= 30).findFirst().get();
        System.out.println(s1);

//        나이가 가장 어린 사람 찾기
        Student youngest = myStudents.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).findFirst().get();
        System.out.println("Youngest : " + youngest);
//        30대가 몇 명인지 출력
        double thirties = myStudents.stream().filter(a -> a.getAge() >= 30).count();
        System.out.println("People in their thirties : " + (int) thirties);

//        모든 객체의 평균 나이 출력
        double studentAvg = myStudents.stream().mapToInt(a -> a.getAge()).average().getAsDouble();
        System.out.println("Average age : " + studentAvg);

//        30세 이하 선착순 누구인지 출력
        Student s2 = myStudents.stream().filter(a -> a.getAge() <= 30).findFirst().get();
        System.out.println(s2);

//        기존 Java의 null처리
        String st = null;
//        System.out.println(st.compareTo("abc"));

//        Java8 이후에 나온 Optional 객체를 통해 특정 객체에 값이 없을지도 모른다는 것을 명시적으로 표현
//        Optional 객체에 빈값을 명시적으로 넣는 방법 : Optional.empty();
        Optional<String> opt1 = Optional.empty();

//        빈값인지 아닌지 check하는 메서드 : isPresent();
        if (opt1.isPresent()) {
            System.out.println(opt1.get().compareTo("abc"));
        } else {
            System.out.println("No such value found!");
        }

//        Optional객체 생성
        Optional<String> opt2 = Optional.ofNullable("hello"); //null일 수도 있다는 것을 의미

//        orElse관련 메서드 사용해서 null 처리
//        orElse(), orElseGet(), orElseThrow()

//        orElse() : 값이 있으면 해당값 return, 없으면 default 지정값 return
        System.out.println(opt2.orElse("").compareTo("abc"));

//        orElseGet() :  값이 있으면 해당값 return, 없으면 람다/메소드 함수 실행
//        매개변수로 람다함수 또는 메소드 참조
        System.out.println(opt1.orElseGet(() -> new String()).compareTo("abc"));

//        orElseThrow() : 값이 있으면 해당값 return, 없으면 지정된 예외 강제 발생
//        int result = opt1.orElseThrow(() -> new NoSuchElementException("객체에 값이 없어요!")).compareTo("abc");
//        System.out.println(result);

//        OptionalInt, OptionalDouble
        OptionalInt oi = new ArrayList<>(Arrays.asList(1, 2, 3, 4)).stream().mapToInt(a -> a).max();

//        1) 방법1: isPresent()로 체크
//        if(oi.isPresent()){
//
//        }else{
//
//        }

//        2) 방법2: orElse등 방법 활용
        System.out.println(oi.orElseThrow(() -> new NoSuchElementException("nope!")));
    }
}
