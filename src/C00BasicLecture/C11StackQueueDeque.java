package C00BasicLecture;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11StackQueueDeque {
    public static void main(String[] args) {
        Stack<Integer> mySt = new Stack<>();
        mySt.push(10);
        mySt.push(20);
        mySt.push(30);
        System.out.println("Stack : " + mySt);
//        pop : 스택에서 요소를 제거 후 해당 요소 반환
        System.out.println("Pop : " + mySt.pop()); //30
//        peek : 스택에서 마지막 요소 반환
        System.out.println("Peek : " + mySt.peek()); //20
        System.out.println("Stack after pop : " + mySt);

//
        Stack<String> mySt2 = new Stack<>();
        System.out.println("---Printing out stack using while loop---");
        mySt2.push("hello");
        mySt2.push("minions");
        mySt2.push("i");
        mySt2.push("love");
        mySt2.push("bananas!");
        while (!mySt2.isEmpty()) {
            System.out.println(mySt2.pop());
        }

//        방문한 사이트 출력 + history
//        뒤로가기 기능 구현
//        스캐너로 신규사이트 방문 or 뒤로가기
//        신규사이트 방문일 경우, 해당 주소 push
//        뒤로 가기일 경우 해당 주소 pop

//        Stack<String> myHistory = new Stack<>();
//        Stack<String> myHistory2 = new Stack<>();
//
//        Scanner sc = new Scanner(System.in);
//        boolean b = true;
//        while (b) {
//            System.out.println("Enter 1 for visiting website or 2 to go backwards or 3 to go forward:");
//            int choice = sc.nextInt();
//            String last_website = "";
//            String forward = "";
//            String w  = "";
//            if (choice == 1) {
//                Scanner sc2 = new Scanner(System.in);
//                System.out.print("Enter new website that you want to visit: ");
//                String new_website = sc2.nextLine();
//                myHistory.push(new_website);
//                System.out.printf("You are currently on %s.\n", myHistory.peek());
//            } else if (choice == 2) {
//                if (myHistory.size() == 1) {
//                    System.out.println("You are currently on the last visited page.");
//                } else {
//                    w = myHistory.pop();
//                    myHistory2.push(w);
//                    last_website = myHistory.peek();
//                    System.out.printf("Going backwards! You are on the %s that you recently visited.\n", last_website);
//                }
//            } else if (choice == 3) {
//                forward = myHistory2.pop();
//                System.out.printf("Going forward! You are on the %s site.\n", forward);
//                myHistory.push(forward);
//            } else if (choice == 0) {
//                System.out.println("Program ended! See ya!");
//                b = false;
//            }
//        }
//         Queue 선언
        Queue<Integer> myQ = new LinkedList<>();
        myQ.add(10);
        myQ.add(20);
        myQ.add(30);
        System.out.println("Queue : " + myQ);
        System.out.println("Poll : " + myQ.poll());
        System.out.println("Queue after poll() : " + myQ);

//        프린트 대기열 예제:
//        문서 1 추가, 문서 2 추가, 문서 3 추가
//        while문 사용해서 현재 인쇄 중인 문서 출력
        Queue<Integer> printer = new LinkedList<>();
        printer.add(1);
        printer.add(2);
        printer.add(3);
        printer.add(4);
        while (!printer.isEmpty()) {
            System.out.println("Now Printing .. Document #" + printer.poll());
        }

//        길이의 제한이 있는 Queue : ArrayBlockingQueue
        Queue<String> blockingQ = new ArrayBlockingQueue<>(3); //길이는 5로 제한
//        add와 offer의 차이 : add는 길이가 다 찼을 때 에러가 발생, offer는 공간이 충분할 때만 추가

        blockingQ.add("Hello 1");
        blockingQ.add("Hello 2");
        blockingQ.add("Hello 3");
//        blockingQ.add("Hello 4"); //에러 발생
        blockingQ.offer("Hello 4"); //에러 발생시키지 않고 3개까지만 추가됨

        System.out.println(blockingQ);

//        PriorityQueue
        System.out.println("---PriorityQueue---");
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(50);
        System.out.println("Priority Queue : " + pq);

        while (!pq.isEmpty()) {
            System.out.println("Priority Queue when polling : " + pq.poll());
        }
//        Deque
//        ArrayDeque은 양방향에서 데이터를 삽입 / 제거할 수 있다
//        성능 빠름
        System.out.println("---ArrayDeque---");
        Deque<Integer> myDeque = new ArrayDeque<>();
        myDeque.addFirst(10);
        myDeque.addFirst(20);
        myDeque.addLast(30);
        System.out.println("ArrayDeque : " + myDeque);
        myDeque.pollFirst(); //20 out
        myDeque.pollLast(); //30 out
        System.out.println("ArrayDeque after poll() : " + myDeque);

    }
}
