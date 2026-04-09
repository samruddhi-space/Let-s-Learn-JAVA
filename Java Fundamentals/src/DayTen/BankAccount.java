package DayTen;

//HIERARCHICAL INHERITANCE
    //one parent class has multiple chile classes
    //one parent class is inherited by multiple subclasses

    public class BankAccount {
        String owner;
        float balance;// in dollars $ and can be decimal like 1112.34 $

        void deposit(float amount) {
            System.out.println("The Money is Deposited ! ");
            balance = balance + amount;// after deposit of a specific amount balance will increase
        }
        void withdraw(float amount) {
            System.out.println("The Money is Withdrawn ! ");
            balance = balance - amount;// balance will decrease after withdraw
        }

        public static void main(String[] args) {
            BankAccount b = new BankAccount();
            b.deposit(3000);
            b.withdraw(500);

            CheckingAccount c = new CheckingAccount();
            c.deposit(500);
            c.withdraw(10);
            c.processCheck();

            SavingsAccount s = new SavingsAccount();
            s.deposit(1000);
            s.withdraw(200);
            System.out.println("Balance is "+s.balance);
            s.depositMonthlyInterest();
        }

    }
    class CheckingAccount extends BankAccount {
        float insufficientFundsFee;// if account is empty
        String checkToProcess;
        void processCheck(){
            System.out.println("Checking Account ");
        }
    }

    class SavingsAccount extends BankAccount {
        float annualInterestRate;//in percentage

        void depositMonthlyInterest(){
            balance = balance + (annualInterestRate / 12); // after annual interrest/12 i.e monthly interest balance will increse in savings account


        }

    }

