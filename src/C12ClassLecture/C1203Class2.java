package C12ClassLecture;
public class C1203Class2 {
    public static void main(String[] args) {

//        Person sinae = new Person();
//        sinae.name = "Sinae";
//        sinae.email = "sinae@gmail.com";
//        sinae.password = "1234";
//        sinae.age = 23;
//        sinae.total_num++;
//        sinae.whoIs();
//
//        Person tom = new Person();
//        tom.name = "Tom";
//        tom.email = "tom@gmail.com";
//        tom.password = "5678";
//        tom.age = 29;
//        tom.total_num++;
//        tom.whoIs();

        Person p1 = new Person();
//        변수값에 직접 접근해서 값을 할당하는 방식
        p1.setName("Sinae");
        p1.setEmail("sinae@gmail.com");
        p1.setAge(23);
        System.out.println(p1.getName());
        System.out.println(p1.getEmail());
        System.out.println(p1.getAge());

        Person p2= new Person();
//        변수값에 직접 접근해서 값을 할당하는 방식
        p2.setName("Tom");
        p2.setEmail("tom@gmail.com");
        p2.setAge(29);
        System.out.println(p2.getName());
        System.out.println(p2.getEmail());
        System.out.println(p2.getAge());

    }
}

class Person {

//    static int total_num;
//    보통 변수는 private 하게 설정, 그 변수에 접근할 수 있는 public 메서드 생성
//    validation 위해!
    private String name;
    private String email;
    private String password;
    private int age;

//    setter, getter 패턴
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<=10) this.name = name;
        else System.out.println("Name is too long.");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@")) this.email = email;
        else System.out.println("Wrong format of email.");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=20) this.age = age;
        else System.out.println("Age is too young.");
    }

//    public void whoIs() {
//        System.out.printf("%s의 이메일은 %s, 비밀번호는 %s, 나이는 %d입니다! \n", name, email, password, age);
//    }
}
