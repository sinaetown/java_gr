package C13Inheritance;

//public : 프로젝트 전체에서 접근 가능
//protected : 패키지 벗어나도 상속 관게인 경우엔 접근 가능
//default : 패키지 내에서만 접근 가능
//priate : 클래스 내에서만 접근 가능
public class C1304ProtectedClass {
    private String st1 = "hello java1";
    String st2 = "hello java2";

    protected String st3 = "hello java3";
    public String st4 = "hello java4";
}
