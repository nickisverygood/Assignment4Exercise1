//Your Name          :Bo Ying, Su
//Class and Section  :CIS35A
//Assignment Number  :4

public class SpecialSavings extends SavingsAccount {
    public SpecialSavings(double v) {
        super(v);
        overtenthousansPolicy();
    }

    @Override
    public double calculateMonthlyInterest() {
        //add interest to balance
        overtenthousansPolicy();
        double interest = savingsBalance*(annualInterestRate/12);
        interestEarned += interest;
        savingsBalance = savingsBalance+interest;
        return savingsBalance;
    }

    private void overtenthousansPolicy(){
        //Policy on balance over 10000
        if(getBalance() > 10000){
            modifyInterestRate(0.1);
        }else {
            modifyInterestRate(0.04);
        }
    }

}
