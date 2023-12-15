package C12ClassLecture;

import java.math.BigDecimal;

public class C1204BankClass {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("12345");
//        ba1.setAccount_number(1234); // 생성자 없는 경우!
        System.out.println("Get bankaccount number: " + ba1.getAccount_number());
        ba1.setBalance(100);
        ba1.deposit(200);
        ba1.withdraw(550);
        double left = ba1.getBalance();
        System.out.println(left);
    }
}

class BankAccount {
    private double balance; //잔고
    private String account_number; //계좌번호

//    별도의 생성자를 만들지 않으면 매개변수가 없는 기본 생성자가 숨겨져 있다.
//    생성자란 클래스가 객체화될 때 자동으로 실행되는 메서드
//    클래스명(){} : 생성자의 형태

    BankAccount(String account_number){ //새로운 생성자를 추가할 때, 기본 생성자는 없어짐 -> 추가적으로 또 만들어 줘야함
        this.account_number = account_number;
    }

//    예금
    void deposit(double d) {
        balance += d;
    }

//    인출
    void withdraw(double w) {
        if (balance < w) System.out.println("You don't have enough money!");
        else balance -= w;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}