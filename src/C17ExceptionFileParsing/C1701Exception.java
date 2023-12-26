package C17ExceptionFileParsing;

import java.util.Scanner;

public class C1701Exception {
    public static void main(String[] args) {
//        ArithmeticException : 0으로 나눌 때
//        System.out.println("<Division program> \nPlease enter the denominator of the number, 10.");
//        int num = 10;
//        Scanner sc = new Scanner(System.in);
////        예외가 발생할 것으로 예상되는 코드에 try catch로 감싼다
//        try {
//            int denominator = Integer.parseInt(sc.nextLine());
//            System.out.println("10 divided by " + denominator + " is " + num / denominator);
//        }
////        catch에는 발생가능한 예외사항을 적어야 정상적으로 catch가 된다
////        Exception은 모든 예외사항의 부모 클래스
////        Exception e 는 가장 하단에 추가! -> 위에서부터 순차적으로 검사하기 때문
//        catch (NumberFormatException e) {
//            System.out.println("Irregular input!");
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException occurred.");
//        } catch (ArithmeticException e) {
//            System.out.println("Arithmetic Exception occurred.");
////            e안에 예외와 관련된 정보들이 들어있음
//            System.out.println(e.getMessage());
////            기존의 에러 메세지 나타남
//            e.printStackTrace();
//        } catch (Exception e) {
//            System.out.println("Exception did occur, but cannot be specified.");
//        } finally {
////           반드시 실행되어야 하는 구문 삽입
//        }
//        System.out.println("Bye!");

        //    <Throw와 Throws 예외>
        String password = "1234";
        try{
            login(password);
        }catch(IllegalArgumentException e){
//            e.getMessage는 login메서드에서 throw new한 곳에서 넘어온 메세지.
            System.out.println(e.getMessage());
        }
    }

//    Unchecked exception에서 throws를 하지 않더라도 예외는 호출한 곳, 즉 여기서는 main으로 예외 처리를 위임한다.
//    throws를 하는 이유는 명시적으로 예외가 발생할 수 있음을 알리는 것일 뿐.

//    Checked exception은 예외처리가 강제되고, 해당 메서드에서 예외처리를 하든지 throws를 통해 호출한 곳으로 위임한다.
//    이 때 호출한 쪽에서는 예외처리가 강제된다.
    static void login(String password) throws IllegalArgumentException {
        if (password.length() < 10) {
            throw new IllegalArgumentException("Password is too short.");
        }
    }
}


