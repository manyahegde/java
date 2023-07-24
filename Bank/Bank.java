package Bank;

import java.util.Scanner;
class Bank{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter acno, name, type, bal");
        BankAccount ba = new BankAccount(s.nextInt(), s.next(), s.next(), s.nextInt());
        System.out.println("Enter the amount to deposit");
        ba.Deposit(s.nextInt());
        System.out.println("Enter the amount to withdraw");
        ba.Withdraw(s.nextInt());
        ba.Display();
    }
}