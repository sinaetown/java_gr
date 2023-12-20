package C14Interface.BankService;

public interface BankServiceInterface {

    //    예금
    void deposit(BankAccount b, double d);

    //    인출
    void withdraw(BankAccount b, double w);

}
