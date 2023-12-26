package C16EtcClass;

import java.util.*;

public class C1604Iterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

//        enhanced for 문 : 원본 변경 X -> remove 불가
        for (String s : myList) {
            System.out.println(s);
//            remove 메서드 없음
        }

        Iterator<String> iter = myList.iterator();
        while (iter.hasNext()) {
            if (iter.next().equals("banana")) {
                iter.remove(); //해당 요소가 삭제됨 ->
            }

        }
        System.out.println(myList);
    }
}
