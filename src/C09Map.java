import java.util.*;

public class C09Map {
    public static void main(String[] args) {
//        <String, String> -> Map
//        삽입된 데이터에 순서는 없음
        Map<String, String> myMap = new HashMap<>();
        myMap.put("Basketball", "농구");
        myMap.put("Soccer", "축구");
        myMap.put("Baseball", "야구");
        System.out.println("myMap : " + myMap);
        System.out.println("Basketball's value : " + myMap.get("Basketball"));

//        size(), isEmpty() 사용 가능

//        이미 key가 있을 경우 put을 하면 덮어쓰기
        myMap.put("Basketball", "탁구");
//        Key값이 없으면 put해라
        myMap.putIfAbsent("Baseball", "배구");
        System.out.println("myMap after putIfAbsent: " + myMap);

//        getOrDefault : key가 없으면 default값 return
        System.out.println("Using getOrDefault : " + myMap.getOrDefault("Tennis", "Tennis not here!"));

//        containsKey() : boolean으로 리턴
        System.out.println("Is Tennis here? : " + myMap.containsKey("Tennis"));

        myMap.remove("Baseball");
        System.out.println("myMap after removal : " + myMap);

//        key 목록만 보기
        System.out.println("myMap keySet : " + myMap.keySet());

//        value 목록만 보기
        System.out.println("myMap values : " + myMap.values());

//        enhanced for : key값 하나씩 출력
        System.out.println("---enhanced for loop---");
        for (String s : myMap.keySet()) {
            System.out.println(s);
            System.out.println(myMap.get(s));
        }
        System.out.println("------");

//        iterator 통해 key값 하나씩 출력

        Map<String, String> myMap2 = new HashMap<>();
        myMap2.put("Basketball", "농구");
        myMap2.put("Soccer", "축구");
        myMap2.put("Baseball", "야구");

        Iterator<String> my_iter = myMap2.keySet().iterator();
        System.out.println("myMap2 : " + myMap2);
//        next()는 데이터를 소모시키면서 return
//        System.out.println("Iterator next() : " + my_iter.next());
        System.out.println(my_iter);
//        hasNext() : Iterator 안에 값이 있는지 없는지 확인 (boolean으로 return)
        while (my_iter.hasNext()) {
            System.out.println("Iterator hasnext() : " + my_iter.next());
        }

//        예제: 아래 리스트를 가지고 좋아하는 운동 종목과 사람 숫자를 map 형태로 나타내시오
        List<String> myList = new ArrayList<>();
        myList.add("basketball");
        myList.add("basketball");
        myList.add("basketball");
        myList.add("baseball");
        myList.add("baseball");
        myList.add("tennis");
        myList.add("tennis");

        Map<String, Integer> Students = new HashMap<>();
        for (int i = 0; i < myList.size(); i++) {
            if (Students.containsKey(myList.get(i))) {
                int count = Students.get(myList.get(i));
                count += 1;
                Students.put(myList.get(i), count);
            } else {
                Students.put(myList.get(i), 1);
            }
        }

//        Students.put(a, Students.getOrDefault(a, 0)+1);
        System.out.println("Students: " + Students);

//        LinkedHashMap : 데이터 삽입 순서 유지
        System.out.println("---LinkedHashMap and TreeMap---");
        Map<String, Integer> linkedMap1 = new LinkedHashMap<>();
        linkedMap1.put("hello5", 1);
        linkedMap1.put("hello4", 1);
        linkedMap1.put("hello3", 1);
        linkedMap1.put("hello2", 1);
        linkedMap1.put("hello1", 1);
        System.out.println("Printing LinkedMap1 : " + linkedMap1);

        Map<String, Integer> treeMap1 = new TreeMap<>();
        treeMap1.put("hello5", 1);
        treeMap1.put("hello4", 1);
        treeMap1.put("hello3", 1);
        treeMap1.put("hello2", 1);
        treeMap1.put("hello1", 1);
        System.out.println("Printing treeMap1 : " + treeMap1);

    }
}