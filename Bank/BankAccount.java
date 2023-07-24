package Bank;

public class BankAccount {
    int acno;
    String name;
    String type;
    int bal;

    BankAccount() {
        System.out.println("default constructor is called");
    }
  
    BankAccount(int a, String b, String c, int d) {
        acno = a;
        name = b;
        type = c;
        bal = d;
    }
    void Deposit(int a) {
        System.out.println("Balance before deposit is " + bal);
        bal = bal + a;
        System.out.println("Balance after deposit is " + bal);
    }

    void Withdraw(int a) {
        System.out.println("Balance before withdrawal is " + bal);
        bal = bal - a;
        if (bal < 0) {
            System.out.println("Cannot withdraw");
            bal = bal + a;
        } else
            System.out.println("Balance after withdrawal is " + bal);

    }

    void Display() {
        System.out.println("Name is " + name);
        System.out.println("Balance is " + bal);
    }
}


