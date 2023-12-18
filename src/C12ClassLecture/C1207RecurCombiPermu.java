package C12ClassLecture;

import java.util.*;

public class C1207RecurCombiPermu {
    static int count = 0;
    static int answer = 0;

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
//        Combination
//        for (int i = 0; i < myList.size(); i++) {
//            temp.add(myList.get(i));
//            for (int j = i + 1; j < myList.size(); j++) {
//                temp.add(myList.get(j));
//                combinations.add(new ArrayList<>(temp));
//                temp.remove(temp.size() - 1);
//            }
//            temp.remove(temp.size() - 1);
//        }
//        System.out.println(combinations);

//        combiRecur(myList, combinations, temp, 2, 0);
//        System.out.println(combinations);

        int balls = 5;
        int share = 3;

        ballsRecur(balls, share, 0);
        System.out.println(answer);
    }

    static void ballsRecur(int balls, int share, int start) {
        if (count == share) {
            answer++;
            return;
        }
        for (int i = start; i < balls; i++) {
            count += 1; //tracker
            ballsRecur(balls, share, i + 1);
            count -= 1;
        }
    }

    static void combiRecur(List<Integer> myList, List<List<Integer>> combinations,
                           List<Integer> temp, int n, int start) {
        if (temp.size() == n) {
            combinations.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < myList.size(); i++) {
            temp.add(myList.get(i));
            combiRecur(myList, combinations, temp, n, i + 1);
            temp.remove(temp.size() - 1);
        }
//            combiRecur(new ArrayList<>(l.remove(l.size()-1)), n-1);
    }
}

