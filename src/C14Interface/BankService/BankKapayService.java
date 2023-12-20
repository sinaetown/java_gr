package C14Interface.BankService;

public class BankKapayService implements BankServiceInterface {
    @Override
    public void deposit(BankAccount b, double d) {
        b.setBalance(b.getBalance()+d);
        System.out.println("카카오페이 사용: " + d + "원 입금 성공!");
    }

    @Override
    public void withdraw(BankAccount b, double w) {
        b.setBalance(b.getBalance()-w);
        System.out.println("카카오페이 사용: " + w + "원 출금 성공!");
    }

}