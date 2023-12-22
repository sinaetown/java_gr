package C16EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Locale;

public class C1602Calendar {
    public static void main(String[] args) {
//        날짜 관련 클래스의 종류 : Calendar(java.util),
//        java.time 패키지 안에 있는 LocalDate 클래스
        Calendar time = Calendar.getInstance();
        System.out.println("<Printing out using Time.getTime()>");
        System.out.println(time.getTime());

//        특정 숫자값은 get함수의 input 값으로 줘서 원하는 날자 정보를 출력할 수 있게 해준다
        System.out.println("<Printing out using time.get()>");
        System.out.println(time.get(1)); //년도 출력
        System.out.println(time.get(2) + 1); //전산상으로의 '월'이 출력됨 -> +1을 해줘야함

        System.out.println("<Printing out using Calendar Class>");
        System.out.println("YEAR: " + time.get(Calendar.YEAR));
        System.out.println("MONTH: " + time.get(Calendar.MONTH) + 1);
        System.out.println("DAY_OF_MONTH: " + time.get(Calendar.DAY_OF_MONTH)); //~일
        System.out.println("DAY_OF_WEEK: " + time.get(Calendar.DAY_OF_WEEK)); //요일
        System.out.println("HOUR_OF_DAY: " + time.get(Calendar.HOUR_OF_DAY)); //24시간 기준
        System.out.println("HOUR: " + time.get(Calendar.HOUR)); //12시간 기준
        System.out.println("MINUTE: " + time.get(Calendar.MINUTE));
        System.out.println("SECOND: " + time.get(Calendar.SECOND));

//        java.time 패키지 : Local~ 클래스
        LocalTime presentTime = LocalTime.now();
        System.out.println("<Printing out using LocalTime.now()>");
        System.out.println(presentTime);
//        System.out.println(presentTime.getHour()); .. etc

        System.out.println("<Printing out using LocalDate.now()>");
        LocalDate presentDate = LocalDate.now();
        System.out.println(presentDate);

        System.out.println("<Printing out using LocalDateTime.now()>");
        LocalDateTime presentDateTime = LocalDateTime.now();
        System.out.println(presentDateTime);
    }
}
