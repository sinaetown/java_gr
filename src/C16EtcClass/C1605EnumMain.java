package C16EtcClass;

public class C1605EnumMain {
    public static void main(String[] args) {
        EnumStudent s1 = new EnumStudent();
        s1.setName("hong1");
        s1.setClassGrade(ClassGrade.a1);

        EnumStudent s2 = new EnumStudent();
        s1.setName("kim1");
        s1.setClassGrade(ClassGrade.a2);

//        타입이 여전히 String 타입이기에 클래스 변수를 사용하지 않을 수도 있음
//        ex) s3.setClassGrade("third");
//        Compile부터 안 되게 막아야함! -> enum 클래스 사용

        EnumStudent s4 = new EnumStudent();
        s1.setName("lee1");
//        String으로 세팅 불가 -> type까지 체크하기 때문
//        enum타입 사용 시에는 final static 변수와 동일한 방법으로 사용
        s4.setRole(Role.GENERAL_USER);
        System.out.println(s4.getRole());
        System.out.println(s4.getRole().getClass());

//        enum값 내부에는 저장된 순서대로 0부터 index값이 내부적으로 할당
        System.out.println(s4.getRole().ordinal());
    }
}

enum Role {
    //    각 열거형 상수는 comma로 구분하고
//    상수 목록 끝에는 semicolon으로 마무리
    GENERAL_USER, ADMIN_USER, SUPER_USER;
}

class EnumStudent {
    private String name;
    private String classGrade;
    private Role role;

    public void setName(String name) {
        this.name = name;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public Role getRole() {
        return role;
    }
}

class ClassGrade {
    final static String a1 = "first_grade";
    final static String a2 = "second_grade";
    final static String a3 = "third_grade";

}
