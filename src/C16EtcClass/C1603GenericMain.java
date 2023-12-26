package C16EtcClass;

import java.util.Arrays;

public class C1603GenericMain {
    public static void main(String[] args) {
        String[] strArr = {"java", "python", "C"};
        String strTemp = strArr[0];
        strArr[0] = strArr[1];
        strArr[1] = strTemp;
        System.out.println("In main: " + Arrays.toString(strArr));

        Integer[] intArr = {1, 2, 3, 4, 5};
        Integer intTemp = intArr[1];
        intArr[1] = intArr[2];
        intArr[2] = intTemp;
        System.out.println("In main: " + Arrays.toString(intArr));

//        With Method Call
        String[] strArrMethodCall = {"java", "python", "C"};
        Integer[] intArrMethodCall = {1, 2, 3, 4, 5};
        strChange(0, 1, strArrMethodCall);
        intChange(1, 2, intArrMethodCall);
        System.out.println("With method call: " + Arrays.toString(strArrMethodCall));
        System.out.println("With method call: " + Arrays.toString(intArrMethodCall));

//        With Generic Call
        String[] strArrGenericCall = {"java", "python", "C"};
        Integer[] intArrGenericCall = {1, 2, 3, 4, 5};
        genericChange(0, 1, strArrGenericCall);
        genericChange(1, 2, intArrGenericCall);
        System.out.println("With generic call: " + Arrays.toString(strArrGenericCall));
        System.out.println("With generic call: " + Arrays.toString(intArrGenericCall));

        GenericStudent<String> studentOne = new GenericStudent<>();
        GenericStudent<Integer> studentTwo = new GenericStudent<>();

        studentOne.setName("Sinae");
        studentOne.setAge("23");

        studentTwo.setName("Max");
        studentTwo.setAge(51);

        System.out.println("Student #1 Age : " + studentOne.getAge());
        System.out.println(studentOne.getAge().getClass());

        System.out.println("Student #2 Age : " + studentTwo.getAge());
        System.out.println(studentTwo.getAge().getClass());
    }

    //    Swapping with methods
    static void strChange(int a, int b, String[] given) {
        String strTemp = given[a];
        given[a] = given[b];
        given[b] = strTemp;
    }

    static void intChange(int a, int b, Integer[] given) {
        Integer intTemp = given[a];
        given[a] = given[b];
        given[b] = intTemp;
    }

    //    제네릭 메서드 생성 : 반환타입 왼쪽에 <T> 선언
    //    제네릭은 객체 타입이 듥어와야함에 유의!
    static <T> void genericChange(int a, int b, T[] arr) {
        T intTemp = arr[a];
        arr[a] = arr[b];
        arr[b] = intTemp;
    }

}

class GenericStudent<T> {
    String name;
    T age;

    void setName(String name) {
        this.name = name;
    }

    void setAge(T age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public T getAge() {
        return age;
    }

}
