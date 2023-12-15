package C12ClassLecture;

public class C1201MethodPractice {
    public static void main(String[] args) {
//        소수 : 1과 자기자신을 제외해서는 약수가 없는 것
//        System.out.println(isPrime(1)); //when using boolean method below
        isPrime(1); //when using void method below
    }

//    Boolean method
//    public static boolean isPrime(int a) {
//        if (a == 1){
//            return false;
//        }
//        for (int i = 2; i * i <= a; i++) {
//            if (a % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    //    Void method
    public static void isPrime(int a) {
        if (a == 1) {
            System.out.println("not prime");
            return;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
    }
}
