//Your Name          :Bo Ying, Su
//Class and Section  :CIS35A
//Assignment Number  :4

public class Driver {

    public static void main(String[] args) {
        //Decalre 2 Savings Account
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        //Modify & Calculate Interest Rate
        saver1.modifyInterestRate(0.04);
        saver2.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        //Print Balance
        saver1.print();
        saver2.print();

        //Modify & Calculate Interest Rate
        saver1.modifyInterestRate(0.05);
        saver2.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        //Print Balance
        saver1.print();
        saver2.print();

        //Decalre 2 Special Savings Account
        SavingsAccount ssaver1 = new SpecialSavings(2000.00);
        SavingsAccount ssaver2 = new SpecialSavings(3000.00);

        // Calculate Interest Rate
        ssaver1.modifyInterestRate(0.05);
        ssaver2.modifyInterestRate(0.05);
        ssaver1.calculateMonthlyInterest();
        ssaver2.calculateMonthlyInterest();

        //Print Balance
        ssaver1.print();
        ssaver2.print();

        //Do some deposits and witdrawings and calculate Monthly Interest and print Balance
        ssaver1.deposit(10000);
        ssaver2.deposit(30000);
        ssaver1.calculateMonthlyInterest();
        ssaver2.calculateMonthlyInterest();
        ssaver1.print();
        ssaver2.print();

        ssaver1.withdraw(6000);
        ssaver2.withdraw(30500);
        ssaver1.calculateMonthlyInterest();
        ssaver2.calculateMonthlyInterest();
        ssaver1.print();
        ssaver2.print();

    }
}

