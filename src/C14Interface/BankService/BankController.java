package C14Interface.BankService;

import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome! Bank Program is now executed!");
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter the account number that you want to work on: ");
        String accountNum = sc.nextLine();

        BankAccount newAccount = new BankAccount(name, accountNum);
        BankServiceInterface bc = new BankCardService();
        BankServiceInterface bk = new BankKapayService();

        System.out.println("-------------------------------------------");
        System.out.println(name + "'s new account number " + accountNum + " created!");
        System.out.println("No money yet!");
        System.out.println("-------------------------------------------");

        while (true) {
            System.out.println("Enter 1 for KaKaoPay, 2 for Card, 3 to QUIT: ");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                System.out.println("KaKaoPay selected!");
                System.out.println("-------------------------------------------");
                System.out.println("Enter the amount that you want to deposit: ");
                int deposit_money = Integer.parseInt(sc.nextLine());
                bk.deposit(newAccount, deposit_money);
                System.out.println("After deposit: " + newAccount.getBalance());
                System.out.println("-------------------------------------------");


                System.out.println("Enter the amount hat you want to withdraw: ");
                int withdraw_money = Integer.parseInt(sc.nextLine());
                if (newAccount.getBalance() < withdraw_money) {
                    System.out.println("You don't have enough money. :(");
                } else {
                    bk.withdraw(newAccount, withdraw_money);
                    System.out.println("After withdrawal: " + newAccount.getBalance());
                }

                System.out.println("-------------------------------------------");

            }
            if (choice == 2) {
                System.out.println("Card selected!");
                System.out.println("-------------------------------------------");
                System.out.println("Enter the amount that you want to deposit: ");
                int deposit_money = Integer.parseInt(sc.nextLine());
                bc.deposit(newAccount, deposit_money);
                System.out.println("After deposit: " + newAccount.getBalance());
                System.out.println("-------------------------------------------");

                System.out.println("Enter the amount hat you want to withdraw: ");
                int withdraw_money = Integer.parseInt(sc.nextLine());
                if (newAccount.getBalance() < withdraw_money) {
                    System.out.println("You don't have enough money. :(");
                } else {

                    System.out.println("After withdrawal: " + newAccount.getBalance());
                }

                System.out.println("-------------------------------------------");

            }
            if (choice == 3) {
                System.out.println("Program ended. See you!");
                return;
            }
        }


    }
}


class BankAccount {
    private double balance; //잔고
    private String account_number; //계좌번호
    private String name;

    BankAccount(String name, String account_number) {
        this.name = name;
        this.account_number = account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}