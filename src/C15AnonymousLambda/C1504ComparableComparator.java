package C15AnonymousLambda;

import java.util.*;

public class C1504ComparableComparator {
    public static void main(String[] args) {
//        [자바에서는 비교를 위한 인터페이스가 대표적으로 2개 제공 : Comnaprable, Comaparator]

//        Comparable 인터페이스는 compareTo 메서드 선언, Java의 많은 클래스에서 구현하고 있음
//        일반적으로 클래스 내에서 직접 구현해서 사용하는 방식을 취함

//        Comparator 인터페이스에는 compare 메서드 선언
//        일반적으로 익명 객체를 만들어서 활용

//        두 문자열의 각 문자를 앞에서부터 순차적으로 비교
//        문자열의 자릿수의 차이가 발생할 경우, 그 문자의 유니코드/ASCII 값의 차이를 반환

        String a = "hello";
        String b = "world";
        System.out.println("compareTo with String : " + a.compareTo(b));

        Integer intA = 1;
        Integer intB = 1;
        System.out.println("compareTo with int : " + intA.compareTo(intB));

        List<String> my_list = new ArrayList<>();
        my_list.add(a);
        my_list.add(b);

        Collections.sort(my_list); // -> Comparable의 compareTo 메서드 활용 (String 고유의 compareTo 사용)
        Collections.sort(my_list, Comparator.reverseOrder());
        my_list.sort(Comparator.naturalOrder());
        my_list.sort(Comparator.reverseOrder());

//        Student 객체 정렬
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Sinae", 23));
        studentList.add(new Student("Johnny", 30));
        studentList.add(new Student("Luke", 55));
        studentList.add(new Student("Tina", 42));
        studentList.add(new Student("Elle", 17));

        System.out.println("Before sort : " + studentList); //toString을 override한 경우

//        for (Student student : studentList) {
////            System.out.println(student.getName() + " " + student.getAge()); // 밑에서 override하지 않았을 경우
//            System.out.println(student); // 밑에서 override한 경우
//        }

//        방법1. Comparator를 익명 객체 방식으로 활용하여 정렬 (매개 변수 2개)
//        1) 나이로 정렬
        studentList.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println("After sorting in age order : " + studentList);
//        2) 이름으로 정렬
        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("After sorting in name order : " + studentList);

//        3)글자 길이 수로 정렬
        String[] arr = {"hello", "java", "C", "world"};
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());
        System.out.println("After sorting in word length order : " + Arrays.toString(arr));

//        4)priority queue 글자길이 내림차순
        Queue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

//        방법2. Comparable 인터페이스 implements 후 compareTo 메서드 구현 (매개 변수 1개)
        Collections.sort(studentList);
        System.out.println("After sorting in name order : " + studentList);

//        Thread 구현 방식 : Thread 상속, Runnable 방식
        new Thread(() -> System.out.println("This is newly created thread" +
                " using lambda expression.")).start();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is newly created thread.");
            }
        });

        t1.start();
        System.out.println("This is the thread from main;().");
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //    조상 클래스인 Object 클래스의 toString을 overriding하여 객체 호출 시 자동으로 toString 메서드 호출
    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

    @Override
    public int compareTo(Student o) { // 객체 (Student)에 해당하는 compareTo
        return this.name.compareTo(o.getName()); // String에 내장되어 있는 compareTo
    }
}