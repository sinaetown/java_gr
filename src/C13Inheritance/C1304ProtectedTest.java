package C13Inheritance;

public class C1304ProtectedTest {
    public static void main(String[] args) {
        C1304ProtectedClass c = new C1304ProtectedClass();
        System.out.println(c.st2); //default 접근 가능
        System.out.println(c.st3); //protected 접근 가능
        System.out.println(c.st4); //public 접근 가능

    }
}
