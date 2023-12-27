package C18Thread;

public class Library {
    static int bookCount = 100;

    //    public static void borrowBook() {
//    synchronized 키워드를 통해 해당 method (자원)에 한해서는 lock을 걸도록 설정
    static synchronized void borrowBook() {
        if (bookCount > 0) {
//            책을 빌리는 시간을 10밀리 초로 가정
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            bookCount -= 1;
            System.out.println("Success!");
            System.out.println("Books left : " + bookCount);

        } else {
            System.out.println("Borrowing is not allowed.");

        }
    }
}
