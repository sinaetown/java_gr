package C13Inheritance_Test;

import C13Inheritance.C1304ProtectedClass;

public class ProtectedMain extends C1304ProtectedClass{
    public static void main(String[] args) {
//        C1304ProtectedClass c = new C1304ProtectedClass();
//        System.out.println(c.st4); //public 접근 가능
//        -> ProtectedClass를 extends 해도 객체 자체를 부모 객체를 사용해서 접근하려고 하면 안 됨
//        자식의 객체를 선언 후, protected 접근 가능

        ProtectedMain pm = new ProtectedMain();
        System.out.println(pm.st3);
    }
}
