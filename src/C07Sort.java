import java.util.*;

public class C07Sort {
    public static void main(String[] args) {
//        Selection Sort => O(n^2)
        int[] arr1 = {30, 22, 20, 25, 12};
        int pos = 0;
        while (pos < arr1.length) {
            for (int i = pos + 1; i < arr1.length; i++) { //내림차순
                if (arr1[i] < arr1[pos]) {
                    int temp = arr1[pos];
                    arr1[pos] = arr1[i];
                    arr1[i] = temp;
                }
            }
            pos++;
        }
        System.out.println("Selection Sort : " + Arrays.toString(arr1));

        //    Bubble Sort
        int[] arr2 = {5, 1, 2, 3, 4};
        boolean b = false;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length - 1 - i; j++) {
                b = false;
                if (arr2[j] > arr2[j + 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                    b = true;
                }
            }
            if (!b) {
                System.out.println("breaking");
                break;
            }

        }
        System.out.println("Bubble Sort : " + Arrays.toString(arr2));




    }


}
