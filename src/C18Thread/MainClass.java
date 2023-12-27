package C18Thread;

public class MainClass {
    public static void main(String[] args) {
//        상속방식으로 스레드 생성
        Thread etc1 = new ExtendsThreadClass();
        etc1.start();
        Thread etc2 = new ExtendsThreadClass();
        etc2.start();
        new ExtendsThreadClass().start();
//        스레드 실행 시, 순차적으로 실행되지 않음에 유의

//        thread 생성자로 Runnable객체를 주입하는 방식
//        thread클래스에 Runnable객체가 전달되어 사용자가 직접 정의한 run 메서드가 실행
        new Thread(new RunnableImplementsClass()).start();
        Thread rt1 = new Thread(new RunnableImplementsClass());
        rt1.start();

        new Thread(() -> System.out.println("Anonymous Thread here")).start();

//        thread의 동시성 이슈 테스트
//        단일 스레드 일반 호출
//        for (int i = 0; i < 1000; i++) {
//            Library.borrowBook();
//        }
//        System.out.println("최종 남은 수량: " + Library.bookCount);

//        멀티 스레드 호출
        for (int i = 0; i < 1000; i++) {
            Thread th = new Thread(() -> Library.borrowBook());
            th.start();
//        join메서드를 통해 다른 스레드의 완료 전까지 새로운 스레드가 실행되지 않도록 막음
//            try {
//                th.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
        System.out.println("최종 남은 수량: " + Library.bookCount);

    }
}
