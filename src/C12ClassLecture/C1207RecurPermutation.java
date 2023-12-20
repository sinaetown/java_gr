package C12ClassLecture;

import java.util.*;

public class C1207RecurPermutation {
    static int max = 0;
    static int answer = 0;

    public static void main(String[] args) {
//        Permutation For loop
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int n = 2;

        List<List<Integer>> permu = new ArrayList<>();
        boolean[] visited = new boolean[l.size()];
        List<Integer> temp = new ArrayList<>();

        permuRecur(l, n, permu, visited, temp);
        System.out.println("Permutation print: " + permu);


//        합계가 6 이상인 2개의 순열만 add
        List<List<Integer>> overSixList = new ArrayList<>();
        boolean[] overSixVisited = new boolean[l.size()];
        List<Integer> overSixTemp = new ArrayList<>();
        overSix(l, n, overSixList, overSixVisited, overSixTemp);
        System.out.println("Permutation over 6 print: " + overSixList);

//        합계가 6이상 모든 순열 add
        List<List<Integer>> overSixAll = new ArrayList<>();
        boolean[] overSixAllVisited = new boolean[l.size()];
        List<Integer> overSixAllTemp = new ArrayList<>();
        for (int limit = 0; limit < l.size(); limit++) {
            overSixAll(l, n, overSixAll, overSixAllVisited, overSixAllTemp, limit + 1);
        }
        System.out.println("Permutation over 6 print (all): " + overSixAll);

//        전체 순열에서 합계가 가장 값 (합) 찾기
        List<Integer> findMaxList = new ArrayList<>();
        boolean[] findMaxVisited = new boolean[l.size()];
        List<Integer> findMaxTemp = new ArrayList<>();
        for (int limitMax = 0; limitMax < l.size(); limitMax++) {
            findMax(l, n, findMaxList, findMaxVisited, findMaxTemp, limitMax + 1);
        }

        int max = findMaxList.get(0);
        for (int i = 0; i < findMaxList.size(); i++) {
            if (max < findMaxList.get(i)) {
                max = findMaxList.get(i);
            }
        }
        System.out.println(max);

//        3개 순열에서 합계가 가장 값 (합) 찾기
        boolean[] findMax2Visited = new boolean[l.size()];
        List<Integer> findMax2Temp = new ArrayList<>();
        findMax2(l, 3, findMax2Visited, 0, 0);
        System.out.println(answer);
    }


    //    전체 순열에서 합계가 가장 값 (합) 찾기
    static void findMax2(List<Integer> l, int n,
                         boolean[] findMax2Visited, int temp, int count) {
        if (count == n) {
            if (answer < temp) {
                answer = temp;
            }
            return;
        } else {
            for (int i = 0; i < l.size(); i++) {
                if (!findMax2Visited[i]) {
                    findMax2Visited[i] = true;
                    temp += l.get(i);
                    findMax2(l, n, findMax2Visited, temp, count + 1);
                    findMax2Visited[i] = false;
                    temp -= l.get(i);

                }
            }
        }
    }

    //    3개 순열에서 합계가 가장 값 (합) 찾기
    static void findMax(List<Integer> l, int n, List<Integer> findMaxList,
                        boolean[] findMaxVisited, List<Integer> findMaxTemp, int limitMax) {
        int sum = 0;
        if (findMaxTemp.size() == limitMax) {
            sum = 0;
            for (int i = 0; i < findMaxTemp.size(); i++) {
                sum += findMaxTemp.get(i);
            }
            findMaxList.add(sum);
            return;
        } else {
            for (int i = 0; i < l.size(); i++) {
                if (!findMaxVisited[i]) {
                    findMaxVisited[i] = true;
                    findMaxTemp.add(l.get(i));
                    findMax(l, n, findMaxList, findMaxVisited, findMaxTemp, limitMax);
                    findMaxVisited[i] = false;
                    findMaxTemp.remove(findMaxTemp.size() - 1);
                }
            }
        }
    }

    //    합계가 6이상 모든 순열 add
    static void overSixAll(List<Integer> l, int n, List<List<Integer>> overSixAll,
                           boolean[] overSixAllVisited, List<Integer> overSixAllTemp, int limit) {
        int sum = 0;
        if (overSixAllTemp.size() == limit) {
            for (int i : overSixAllTemp) {
                sum += i;
            }
            if (sum >= 6) {
                overSixAll.add(new ArrayList<>(overSixAllTemp));
            }
            return;
        } else {
            for (int i = 0; i < l.size(); i++) {
                if (!overSixAllVisited[i]) {
                    overSixAllVisited[i] = true;
                    overSixAllTemp.add(l.get(i));
                    overSixAll(l, n, overSixAll, overSixAllVisited, overSixAllTemp, limit);
                    overSixAllVisited[i] = false;
                    overSixAllTemp.remove(overSixAllTemp.size() - 1);
                }
            }
        }
    }

    //        합계가 6 이상인 2개의 순열만 add
    static void overSix(List<Integer> l, int n, List<List<Integer>> overSixList,
                        boolean[] overSixVisited, List<Integer> overSixTemp) {
        int sum = 0;
        if (overSixTemp.size() == n) {
            for (int i : overSixTemp) {
                sum += i;
            }
            if (sum >= 6) {
                overSixList.add(new ArrayList<>(overSixTemp));
            }
            return;
        } else {
            for (int i = 0; i < l.size(); i++) {
                if (!overSixVisited[i]) {
                    overSixVisited[i] = true;
                    overSixTemp.add(l.get(i));
                    overSix(l, n, overSixList, overSixVisited, overSixTemp);
                    overSixVisited[i] = false;
                    overSixTemp.remove(overSixTemp.size() - 1);
                }
            }
        }
    }

//        Permutation For loop

    static void permuRecur(List<Integer> l, int n, List<List<Integer>> permu,
                           boolean[] visited, List<Integer> temp) {
        if (temp.size() == n) {
            permu.add(new ArrayList<>(temp));
        } else {
            for (int i = 0; i < l.size(); i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    temp.add(l.get(i));
                    permuRecur(l, n, permu, visited, temp);
                    visited[i] = false;
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/87946
//class Solution {
//    static int answer;
//
//    public int solution(int k, int[][] dungeons) {
//        boolean[] visited = new boolean[dungeons.length];
//        recur(dungeons, visited, k, 0, 0);
//        System.out.println(answer);
//        return answer;
//    }
//
//    static void recur(int[][] dungeons, boolean[] visited, int k, int count, int p) {
//        if (count == dungeons.length) {
//            if (answer < p) {
//                answer = p;
//            }
//            return;
//        } else {
//            for (int i = 0; i < dungeons.length; i++) {
//                 if (!visited[i] && (dungeons[i][0] <= k)){
//                    visited[i] = true;
//                    k = k - dungeons[i][1];
//                    p++;
//                    recur(dungeons, visited, k, count + 1, p);
//                    k = k + dungeons[i][1];
//                    p--;
//                    visited[i] = false;
//                }
//                recur(dungeons, visited, k, count + 1, p);
//            }
//        }
//    }
//}