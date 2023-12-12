import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class C07Array {
    public static void main(String[] args) {
//        Expression #1
        int[] int_arr1 = {1, 2, 3, 4};
//        Expression #2
        int[] int_arr2 = new int[4];
        int_arr2[0] = 1;
        int_arr2[1] = 2;
        int_arr2[2] = 3;
        int_arr2[3] = 4;

//        Expression #3
        int[] int_arr3 = new int[]{1, 2, 3, 4};

//        표현불가!
//        int[] int_arr4 = new int[];

//        String Array
//        This will cause a run-time error!

        String[] arr_st = new String[5];
//        arr_st[0]="hello"
//        arr_st[1]="there"
//        arr_st[2]="good"
//        for(int i = 0; i < arr_st.length; i++){
//            if(arr_st[i].isEmpty()){
//                System.out.println("The given array is empty!");
//            }
//        }
        int[] arr_int = new int[5];
        for (int i = 0; i < arr_st.length; i++) {
            arr_int[i] += 10;
        }

//        예제: 배열 안 숫자들의 합과 평균 구하기
        int[] int_arr5 = {85, 65, 90};
        int sum = 0;
        int avg = 0;
        for (int i : int_arr5) {
            sum += i;
        }
        avg = sum / (int_arr5.length);
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + avg);

//        예제: 최댓값, 최솟값 구하기
        int[] int_arr6 = {10, 20, 30, 12, 8, 17};
        int max = int_arr6[0];
        int min = int_arr6[0];
        for (int i : int_arr6) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);

//        예제: 순서 바꾸기
        int[] int_arr7 = {10, 20};
        int temp = int_arr7[0];
        int_arr7[0] = int_arr7[1];
        int_arr7[1] = temp;
        System.out.println("Switching pos : " + Arrays.toString(int_arr7));

//        예제: 첫 element 밀기
        int[] int_arr8 = {10, 20, 30, 40, 50, 60, 70};
        int temp2 = int_arr8[0];
        for (int i = 1; i < int_arr8.length; i++) {
            int_arr8[i - 1] = int_arr8[i];
            int_arr8[i] = temp2;
        }
        System.out.println("Pushing first element : " + Arrays.toString(int_arr8));

//        예제: 순서 뒤집기 -> 신규배열 선언
        int[] int_arr9 = {1, 2, 3, 4, 5};
        int[] int_arr9_2 = new int[int_arr9.length];
        int j = int_arr9.length - 1;
        for (int i = 0; i < int_arr9.length; i++) {
            int_arr9_2[j--] = int_arr9[i];
        }
        System.out.println("Reversed #1 : " + Arrays.toString(int_arr9_2));

//        예제: 순서 뒤집기 -> 기존 배열에
        for (int i = 0; i < (int_arr9.length / 2); i++) {
            int temp3 = int_arr9[int_arr9.length - 1 - i];
            int_arr9[int_arr9.length - 1 - i] = int_arr9[i];
            int_arr9[i] = temp3;
        }
        System.out.println("Reversed #2 : " + Arrays.toString(int_arr9));

//        정렬 : Arrays.sort()
        int[] int_arr10 = {10, 20, 30, 12, 8, 17};
        Arrays.sort(int_arr10); //오름차순 정렬이 기본
        System.out.println("In order : " + Arrays.toString(int_arr10));

//        내림차순
//        Method1) Comparator 클래스 사용
//        객체 타입인 경우에만 Comparator 클래스 사용 가능
        String[] str_arr1 = {"hello", "minions", "bye", "tomorrow"};
        Arrays.sort(str_arr1);
        System.out.println("In order : " + Arrays.toString(str_arr1));
        Arrays.sort(str_arr1, Comparator.reverseOrder());
        System.out.println("Reverse order : " + Arrays.toString(str_arr1));

//        Primitive type (int..) 인 경우에는 사용 불가
//        Arrays.sort(int_arr10, Comparator.reverseOrder());
        Integer[] arr10_integer = {10, 20, 30, 12, 8, 17};
        Arrays.sort(arr10_integer, Comparator.reverseOrder());
        System.out.println("Reverse order using method #1 using Integer : " + Arrays.toString(arr10_integer));

//        Method2) 배열 뒤집기
        int[] new_arr10 = new int[int_arr10.length];
        int a = int_arr10.length - 1;
        for (int i = 0; i < new_arr10.length; i++) {
            new_arr10[a--] = int_arr10[i];
        }
        System.out.println("Reverse order method #2 using changing : " + Arrays.toString(new_arr10));

//        Method3) StreamAPI, lambda를 활용한 내림차순 정렬
        int[] int_arr11 = {10, 20, 30, 12, 8, 17};
//        정렬이 된 int_arr11
        int[] new_arr11 = Arrays.stream(int_arr11) // stream 객체 생성
                .boxed() // Integer로 형변환한 stream 객체 생성
                .sorted(Comparator.reverseOrder()) // 내림차순 정렬
                .mapToInt(z -> z) // Integer를 int로 변환
                .toArray(); // 배열로 변환
        System.out.println("Reverse order using method #3 using stream : " + Arrays.toString(new_arr11));

//        숫자 조합의 합 : 각기 다른 숫자의 배열이 있을 때 만들어질 수 있는 2개의 조합의 합을 출력하라
//        재귀적으로도 풀 수 있다!
        int[] int_arr12 = new int[]{10, 20, 30, 40, 50, 60};
        System.out.println("Combination Sum:");
        for (int z = 0; z < int_arr12.length; z++) {
            for (int zz = z + 1; zz < int_arr12.length; zz++) {
                System.out.printf("%d + %d = %d \n", int_arr12[z], int_arr12[zz], (int_arr12[z] + int_arr12[zz]));
            }
        }

//        예제: 중복 제거하기
        int[] int_arr13 = {10, 10, 40, 5, 7};
//        배열 복사
//        int[] new_arr13 = Arrays.copyOfRange(int_arr13, 0, 3); // [10, 10, 40]

        Arrays.sort(int_arr13);
        int index = 0;
        int[] new_arr13 = new int[int_arr13.length];
        for (int i = 0; i < int_arr13.length; i++) {
            if (i == int_arr13.length - 1) {
                new_arr13[index++] = int_arr13[i];
                break;
            }
            if (int_arr13[i] != int_arr13[i + 1]) {
                new_arr13[index++] = int_arr13[i];
            }
        }
        new_arr13 = Arrays.copyOfRange(new_arr13, 0, index);
        System.out.println("Remove repeated number: " + Arrays.toString(new_arr13));

//        예제: 배열의 검색
        int[] int_arr14 = {5, 3, 1, 8, 7};
        int target = 8;

        for (int i = 0; i < int_arr14.length; i++) {
            if (target == int_arr14[i]) {
                System.out.println("Target is at the index of: " + i);
            }
        }
//        Binary Search (이진 검색)
//        사전에 오름차순 정렬이 되어있어야함
//        Arrays.binarySearch();
        int[] int_arr15 = {6, 4, 3, 1, 2, 7, 9, 13, 11, 8};
        Arrays.sort(int_arr15);
        int arr15_answer = Arrays.binarySearch(int_arr15, target);
        System.out.println("Finding Index : " + arr15_answer);

//        배열 비교하기
        int[] arr = {10, 20, 30};
        int[] arr2 = {10, 20, 30};
        System.out.println("Comparing arrays: " + Arrays.equals(arr, arr2));

//        배열 복사 :copyOf(배열, end), copyOfRange(배열, start, end)
        int[] int_arr16 = {10, 20, 30, 40, 50};
        int[] new_arr16_1 = Arrays.copyOf(int_arr16, 10);
        int[] new_arr16_2 = Arrays.copyOfRange(int_arr16, 1, 4);
        System.out.println("Array created with copyOf() : " + Arrays.toString(new_arr16_1));
        System.out.println("Array created with copyOfRange() : " + Arrays.toString(new_arr16_2));

//        2차원 배열 할당
        int[][] int_arr17 = new int[2][3];
        int_arr17[0][0] = 1;
        int_arr17[0][1] = 2;
        int_arr17[0][2] = 3;
        int_arr17[1][0] = 4;
        int_arr17[1][1] = 5;
        int_arr17[1][2] = 6;

        System.out.println("2D array: " + Arrays.deepToString(int_arr17));

//        2차원 가변배열 선언 및 할당
        int[][] int_arr18 = new int[3][];
        int_arr18[0] = new int[1];
        int_arr18[1] = new int[2];
        int_arr18[2] = new int[3];

//        int_arr18[0][0] = 10;
//        int_arr18[1][0] = 20;
//        int_arr18[2][0] = 30; -> 안 됨!

        System.out.println("2D array: " + Arrays.deepToString(int_arr18));

//        가변배열 리터럴 방식
        int[][] int_arr19 = {{10}, {10, 20}, {10, 20, 30}};
        System.out.println("2D array: " + Arrays.deepToString(int_arr19));

//        예제: [3][4] 사이즈의 배열 선언 뒤
//        1,2,3~12까지의 숫자값 각 배열에 할당
        int[][] int_arr20 = new int[3][4];
        int number = 1;
        for (int i = 0; i < int_arr20.length; i++) {
            for (int m = 0; m < int_arr20[i].length; m++) {
                int_arr20[i][m] = number++;
            }
        }
        System.out.println("2D array: " + Arrays.deepToString(int_arr20));

//        예제: 가변 배열 만들기
//        전체 사이즈 : 5
//        각 배열마다 사이즈 1, 2, 3, 4, 5로 커지도록
//        1부터 시작해서 값 집어넣기
        int[][] int_arr21 = new int[5][];
        int size = 1;
        int element = 10;
        for (int i = 0; i < int_arr21.length; i++) {
            int_arr21[i] = new int[size++];
        }
        for (int i = 0; i < int_arr21.length; i++) {
            for (int ii = 0; ii < int_arr21[i].length; ii++) {
                int_arr21[i][ii] = element;
            }
            element += 10;
        }
        System.out.println("2D array: " + Arrays.deepToString(int_arr21));
    }
}