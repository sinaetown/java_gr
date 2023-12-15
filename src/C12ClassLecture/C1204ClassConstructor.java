package C12ClassLecture;

public class C1204ClassConstructor {
    public static void main(String[] args) {
        Calendar cal1 = new Calendar("2020", "03", "15");
        Calendar cal2 = new Calendar("2023", "12");
        Calendar cal3 = new Calendar();

        System.out.println(cal1.getYear());
        System.out.println(cal2.getYear());
        System.out.println(cal2.getMonth());
    }
}

class Calendar {
    private String year;
    private String month;
    private String day;

    //    Constructors
//    메서드 오버로딩을 통해 같은 이름의 생성자 생성 가능
    Calendar(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    Calendar(String year, String month) {
        this.year = year;
        this.month = month;
    }

//    this() 키워드 사용해서 클래스 내 매개변수에 맞는 생성자 호출 가능
//    Calendar(String year) {
//        this(year, null, null);
//    }

    Calendar() { //default constructor

    }

    //    Getters
    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }
}