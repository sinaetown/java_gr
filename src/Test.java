import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        int mul = 0;
        int sum = 0;
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        for (int i : A) {
            setA.add(i);
        }
        for (int i : B) {
            setB.add(i);
        }

        System.out.println(setA);
        System.out.println(setB);

        for (int a : setA) {
            for (int b : setB) {
                if (mul > a * b) {
                    mul = a * b;
                }
            }
            sum += mul;
            System.out.println(sum);
        }
    }
}
