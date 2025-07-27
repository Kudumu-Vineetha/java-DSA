class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accNo,double bal) {
        accountNumber=accNo;
        balance=bal;
    }

    void deposit(double amount) {
        balance+=amount;
        System.out.println("Deposited:"+amount);
    }

    void withdraw(double amount) {
        if(balance>=amount) {
            balance-=amount;
            System.out.println("Withdrawn:"+amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Balance:"+balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accNo,double bal,double rate) {
        super(accNo,bal);
        interestRate=rate;
    }

    void addInterest() {
        double interest=balance*interestRate/100;
        balance+=interest;
        System.out.println("After Interest:"+balance);
    }
}

class CheckingAccount extends BankAccount {
    double overdraftLimit;

    CheckingAccount(int accNo,double bal,double limit) {
        super(accNo,bal);
        overdraftLimit=limit;
    }

    void withdraw(double amount) {
        double overdraftUsed=0;
        if(balance+overdraftLimit>=amount) {
            if(amount>balance) {
                overdraftUsed=amount-balance;
                balance=0;
            } else {
                balance-=amount;
            }
            System.out.println("Withdrawal:"+amount);
            System.out.println("Overdraft Used:"+overdraftUsed);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}

class FDAccount extends BankAccount {
    int termInYears;
    double fdInterestRate;

    FDAccount(int accNo,double bal,int term,double rate) {
        super(accNo,bal);
        termInYears=term;
        fdInterestRate=rate;
    }

    void displayMaturityAmount() {
        double maturity=balance+(balance*fdInterestRate*termInYears/100);
        System.out.println("Maturity Amount(after "+termInYears+" years at "+(int)fdInterestRate+"%):"+maturity);
    }
}

public class Bank {
    public static void main(String[] args) {
        System.out.println("Savings Account");
        SavingsAccount sa=new SavingsAccount(101,1000.0,5.0);
        sa.displayBalance();
        sa.addInterest();

        System.out.println("\nChecking Account");
        CheckingAccount ca=new CheckingAccount(102,2000.0,1000.0);
        ca.displayBalance();
        ca.withdraw(2500.0);

        System.out.println("\nFD Account");
        FDAccount fd=new FDAccount(103,5000.0,2,6.0);
        fd.displayBalance();
        fd.displayMaturityAmount();
    }
}
