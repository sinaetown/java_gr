package C15AnonymousLambda;

public class C1501InnerClass {
    public static void main(String[] args) {
        MemberInnerClass.staticInnerClass si = new MemberInnerClass.staticInnerClass();
        si.setData(530);
        si.display();

        MemberInnerClass mi = new MemberInnerClass();
        System.out.println(mi.a);
    }

    static class staticInnerClass {
        //        static 내부 클래스
//        이 클래스는 C1501InnerClass의 정적 멤버처럼 활용
        private int data;

        void display() {
            System.out.println("Data Value : " + data);
        }
    }
}

//        알번 내부 클래스
class MemberInnerClass {
    static class staticInnerClass {
        //        static 내부 클래스
//        이 클래스는 C1501InnerClass의 정적 멤버처럼 활용
        private int data;

        void display() {
            System.out.println("Data Value : " + data);
        }

        public void setData(int data) {
            this.data = data;
        }
    }

    int a = 10;
}