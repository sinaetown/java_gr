package C00BasicLecture;

public class C1101StackFunction1 {
    public static void main(String[] args) {
        System.out.println("Main Function Start");
        function1();
        System.out.println("Main Function End");

    }

    static void function1() {
        System.out.println("function1 Start");
        function2();
        System.out.println("function1 End");
    }

    static void function2() {
        System.out.println("function2 Start");

        System.out.println("function2 End");
    }
}
