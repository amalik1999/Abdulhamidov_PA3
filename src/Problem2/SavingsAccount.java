package Problem2;

public class SavingsAccount {

    public SavingsAccount(double amountInAccount) {
        this.savingsBalance = amountInAccount;
    }

    static double annualInterestRate = 0.00;

    private double savingsBalance;

    public void calculateMonthlyInterest() {
        double interest;
        interest = (this.savingsBalance * (annualInterestRate / 100)) / 12;
        this.savingsBalance += interest;
    }

    public static void modifyInterestRate(double newInterest) {
        annualInterestRate = newInterest;
    }

    public void showBalance() {
        System.out.printf("$%.2f", this.savingsBalance);
    }

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(4.0);
        System.out.println("Month \t Saver1 \t Saver2");
        for (int i = 1; i <= 12; ++i) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.print("Month " + i + ": ");
            saver1.showBalance();
            System.out.print("\t");
            saver2.showBalance();
            System.out.println();
        }
        System.out.println();
        System.out.println();

        System.out.println("Interest Rate at 5.0%");
        System.out.println();
        SavingsAccount.modifyInterestRate(5.0);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.print("Month 13: \t");
        saver1.showBalance();
        System.out.print("\t");
        saver2.showBalance();
    }
}

