import java.util.Scanner;

public class BankAccount {
    double balance;

    public double addBalance() {
        Scanner scanner = new Scanner(System.in);
        balance = scanner.nextDouble();
        return balance;
    }
}

class ATM extends BankAccount {
    double balance = addBalance();

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("New balance = " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("New balance = " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void checkBalance() {
        System.out.println(balance);
    }
}

class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to deposit, 2 for withdrawal and 3 to check balance");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Enter the amount to deposit");
                atm.deposit(scanner.nextDouble());
                break;
            }
            case 2: {
                System.out.println("Enter the amount to withdraw");
                atm.withdraw(scanner.nextDouble());
                break;
            }
            case 3: {
                atm.checkBalance();
                break;
            }
            default: {
                System.out.println("Invalid Choice");
            }
        }
    }
}