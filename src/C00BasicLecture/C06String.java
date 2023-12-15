package C00BasicLecture;

import java.util.*;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {

//        참조자료형 : 기본 자료형을 제외한 모든 자료형
//        Wrapper Class : 기본형 타입에 없는 다양한 기능을 지원하기 위한 클래스

//        Integer와 int간의 형변환
        int a = 10;
        Integer b = new Integer(20);
//        Auto Unboxing (자동으로 기본 자료형으로 풀어줌) : Integer -> int
        int c = b;
//        Unboxing : Integer -> int
        int d = b.intValue();
//        Auto Boxing : int -> Integer
        Integer e = a;
//        Boxing : int -> Integer
        Integer f = Integer.valueOf(a);

//        String과 int의 형변환
//        String.valueOf() 도 사용
        int l = 10;
        String st_l = Integer.toString(10);
        String st_l2 = String.valueOf(10); //차이?
        System.out.println(st_l); //"10"
        System.out.println(st_l2); //"10"

        int p = Integer.parseInt(st_l);
        System.out.println(p); //10

//        참조자료형에 원시자료형을 담을 때는 wrapper클래스를 써야한다. ex) CollectionFramework(list, set, map..)
        List<Integer> list_a = new ArrayList<>();
        list_a.add(10);
        list_a.add(20);
        list_a.add(30);
        System.out.println(list_a);

        String mystr1 = new String("hello");
        String mystr2 = new String("hello");
        String mystr3 = "hello";
        String mystr4 = "hello";
        String mystr5 = mystr1;

        System.out.println(mystr1 == mystr2); //false
        System.out.println(mystr1 == mystr3); //false
        System.out.println(mystr3 == mystr4); //true
        System.out.println(mystr1 == mystr5); //true

        System.out.println();
        System.out.println(mystr1.equals(mystr2)); //true
        System.out.println(mystr1.equals(mystr3)); //true
        System.out.println(mystr3.equals(mystr4)); //true
        System.out.println(mystr1.equals(mystr5)); //true

//        문자열 길이 : length();
        String myst = " hello ";
        System.out.println("Length : " + myst.length());

//        문자열에서 특정 문자열이 포함되어 있는지의 여부를 리턴  : indexOf();
        String myst2 = "hello java";
        System.out.println("Index of 'java': " + myst2.indexOf("java"));

//        특정 문자열이 있는지 여부를 boolean으로 리턴 : contains();
        String target = "hello world";
        String finder = "world";
        System.out.println("Check if contains : " + target.contains(finder));

//        문자열에서 특정 위치의 문자를 리턴 : charAt();
        String h = "hello";
        char myChar = h.charAt(1);
        System.out.println("Character using charAt() : " + myChar);

//        EX)특정 문자열에서 'a'의 개수 찾기
        String given = "abcdefabaadf";
        int count = 0;
        for (int i = 0; i < given.length(); i++) {
            if (given.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Number of 'a's : " + count);

//        a이상 b미만의 index를 자르기 : substring(a,b);
        String st1 = "Hello World";
        System.out.println("Substring 1 - : " + st1.substring(0, 5));
        System.out.println("Substring 2 - : " + st1.substring(6, st1.length()));


//        왼쪽과 오른쪽에 있는 공백을 다 제거 : trim(), strip()
//        strip() is better than trim()
//        trim()은 유니코드의 공백을 인식하지 못함
        String trimStr = "       hello world      ";
        String trimmed_ver = trimStr.trim();
        System.out.println("Trimmed version : " + trimmed_ver);

        String stripStr = "       hello world      ";
        String stripped_ver = stripStr.strip();
        System.out.println("Stripped version : " + stripped_ver);

//        문자열 소문자 / 대문자 : toUpperCase(), toLowerCase()
        String x = "Hello";
        String x1 = x.toUpperCase();
        String x2 = x.toLowerCase();
        System.out.printf("Lower/Uppercase : %s %s %s", x, x1, x2);
        System.out.println();

//        문자열 더하기
        String first = "hello";
        first += " world";
        System.out.println("Connecting Strings : " + first);

//        char -> String 형변환
        char c1 = 'a';
        String s1 = Character.toString(c1);

//        예제
        String str1 = "01abc123한글123";
        String str2 = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
                continue;
            }
            str2 += str1.charAt(i);
        }

        System.out.println("Result without any alphabet : " + str2);

//        a문자를 b문자로 대체 : replace(a,b);
        String m = "Hello World";
        String n1 = "Java";
        String changed_ver = m.replace("World", n1);
        System.out.println("Changed_version : " + changed_ver);

//        replaceAll() : replace와 동일한 기능, regex 사용 가능
        String n2 = "Python";
        String changed_ver2 = n2.replaceAll("World", n2);
        System.out.println("Changed_version2 : " + changed_ver2);

        String m2 = "01abc123한글123";
        String m3 = m2.replaceAll("[a-z]", "");
        System.out.println("Without alphabet : " + m3);

        String m4 = m2.replaceAll("[가-힣]", "");
        System.out.println("Without hangeul : " + m4);

        String m5 = m2.replaceAll("[^가-힣]", "");
        System.out.println("Only hangeul : " + m5);

        String m6 = m2.replaceAll("[0-9]", "");
        System.out.println("Without numbers : " + m6);

        String m7 = m2.replaceAll("[0-9a-zA-Z]", "");
        System.out.println("Without numbers and alphabets : " + m7);

//        Pattern Class
//        알파벳로만 이루어져있는지 체크
        boolean matcher = Pattern.matches("[a-z]+", "helloworld");
        System.out.println("check regex if alphabets: " + matcher);

//        전화번호 검증
//        \d: 숫자, {}: 연속으로
        boolean matcher2 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", "010-1234-5678");
        System.out.println("check regex if phone_number: " + matcher2);

//        이메일 검증
        boolean matcher3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", "hello@naver.com");
        System.out.println("check regex if email: " + matcher3);

//        String -> String[] :split
        String aa = "a:b:c:d";
        String[] a_arr = aa.split(":");
        System.out.println("Splitted ':' : " + Arrays.toString(a_arr));

        String bb = " a  b c d";
        String[] b_arr = bb.split(" ");
        System.out.println("Splitted space : " + Arrays.toString(b_arr));

        String[] c_arr = bb.split("\\s+");
        System.out.println("Splitted space : " + Arrays.toString(c_arr));

        String dd = bb.trim();
        String[] d_arr = dd.split("\\s+");
        System.out.println("Splitted space : " + Arrays.toString(d_arr));

//        문자열이 비어있는지 여부 : isEmpty()
//        null과 구분!
        String my_s = null;
        String my_s2 = "";

        System.out.println("my_s and null? : " + (my_s == null)); //true
        System.out.println("my_s2 and null? : " + (my_s2 == null)); //false
//        System.out.println("my_s length : " +my_s.length()); //NullPointerException
        System.out.println("my_s2 length : " + my_s2.length()); //0
//        System.out.println("my_s isEmpty? : " +my_s.isEmpty()); //NullPointerException
        System.out.println("my_s2 isEmpty? : " + my_s2.isEmpty()); //true

        String[] s_arr = new String[5];
        s_arr[0] = "hello";
        s_arr[1] = "world";

//        String[] -> String : join()
        String[] sarr = {"Java", "C", "Python", "C++", "C#",
                "HTML", "CSS", "JavaScript", "Ocaml"};
        String s_res = "These are programming languages that I know : " + String.join(" ", sarr);
        System.out.println(s_res);
    }
}
