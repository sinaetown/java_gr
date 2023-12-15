package C00BasicLecture;

public class C06StringBuffer {
    public static void main(String[] args) {

//        StringBuffer는 문자열을 추가하거나 변경할 때 주로 사용하는 객체
//        .append() : 문자열 마지막에 문자열 추가
//        String의 경우 += 통해 재선언! (immutable 이기 때문)
//        .insert() : 특정 n번째 위치에 원하는 문자열 삽입
//        .substring(int start, int end) :
//        .delete(int start, int end) : start~end 앞까지 삭제

        String st1 = "Hello";
        StringBuffer sbuffer = new StringBuffer(st1);
        System.out.println("StringBuffer : " + sbuffer);
        sbuffer.append(" World");
        System.out.println("After .append(): " + sbuffer);
        sbuffer.insert(6, "Java ");
        System.out.println("After .insert(): " + sbuffer);
        System.out.println("After .substring(): " + sbuffer.substring(0, 10));
        sbuffer.delete(6, 11);
        System.out.println("After .delete(): " + sbuffer);

//        성능 : String < StringBuffer < StringBuilder (thread safe X)
        StringBuilder sb2 = new StringBuilder(st1);
        sb2.append(" World");
        System.out.println("StringBuilder : " + sb2);

    }
}
