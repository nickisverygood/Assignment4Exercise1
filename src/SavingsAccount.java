//Your Name          :Bo Ying, Su
//Class and Section  :CIS35A
//Assignment Number  :4

public class SavingsAccount {
    double annualInterestRate;
    double interestEarned =0;
    double savingsBalance;

    public SavingsAccount(double v) {
        this.savingsBalance = v;
    }


    public double calculateMonthlyInterest(){
        //add interest to balance
        double interest = savingsBalance*(annualInterestRate/12);
        interestEarned += interest;
        savingsBalance = savingsBalance+interest;
        return savingsBalance;
    }

    public void deposit(double depositamt){
        //Deposit
        setSavingsBalance(getBalance()+depositamt) ;
    }

    public void withdraw(double withdrawamt){
        //Withdrawal
        setSavingsBalance(getBalance()-withdrawamt);
    }

    protected void modifyInterestRate(double new_annualInterestRate ){
        //Modify Interest Rate
        annualInterestRate = new_annualInterestRate;
    }

    public void print(){
        System.out.print("\nCurrent Annual Interest Rate: ");
        System.out.print(annualInterestRate+"\n");
        System.out.print("Current Balance:\n");
        System.out.print("$"+this.savingsBalance+"\n");
        System.out.print("Total Interest Earned\n");
        System.out.print(interestEarned+"\n");
    }
    public double getBalance(){
        return this.savingsBalance;
    }
    protected void setSavingsBalance(double value){
        this.savingsBalance = value;
    }
}
