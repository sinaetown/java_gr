package C17ExceptionFileParsing.AuthorException;

import java.util.*;

class AuthorController {
    public static void main(String[] args) {
//        메모리 DB의 데이터 추가/삭제 부분은 repository로 분리
//        Controller -> Service -> Repository
//        Controller에서 입력 받고 객체 생성 (예외 처리)
//        Service (비즈니스 로직 - register, login // 예외 throws)
//        Repository(list에 add)
        AuthorService authorService = new AuthorService();
        boolean b = true;
        while (b) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter 1 for sign up \n 2 for login \n 3 to quit.");
            String service_choice = sc.nextLine();
            if (service_choice.equals("1")) {
                System.out.println("Enter author's name: ");
                String name = sc.nextLine();
                System.out.println("Enter author's email: ");
                String email = sc.nextLine();
                System.out.println("Enter author's password: ");
                String password = sc.nextLine();
                try {
                    Author enrolledAuthor = new Author(name, email, password);
                    authorService.register(enrolledAuthor);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
//                System.out.printf("Sign up completed! \n%s\'s account is newly created!\n", enrolledAuthor.getName());
            } else if (service_choice.equals("2")) {
                System.out.println("Login using author's email : ");
                String input_email = sc.nextLine();
                System.out.println("Login using author's password : ");
                String input_password = sc.nextLine();
                Optional<Author> loggedinAuthor = Optional.empty();
                try {
                    loggedinAuthor = authorService.login(input_email, input_password);
                } catch (NoSuchElementException e) {
                    System.out.println(e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                if (loggedinAuthor.isPresent()) {
                    System.out.println("Welcome! " + loggedinAuthor.get().getName());
                }
                break;
            } else if (service_choice.equals("3")) {
                System.out.println("Program ended. See you!");
                b = false;
            }
        }
    }
}