public class BankAccount {
    private double checking;
    private double savings;

    private static int numberOfAccounts = 0;
    private static double totalMoney = 0;

    //Make New Account
    public BankAccount() {
        checking = 0.0;
        savings = 0.0;
        numberOfAccounts += 1;
    }

    //Checking
    //getter
    public double getChecking(boolean print){
        if (print == true) {
            System.out.println("Checking Account: $" + this.checking);
            }
        return checking;
        //I made this an if statements to easily be able to utilize the code again if I want to pull the data without printing the value, but I also don't have to constantly do System.out.println to print the value, I can simple pass True or False to print. 
        
    }   

    //Checking Deposit
    public void depositChecking(double checking){
        this.checking += checking;
        totalMoney += checking;
    }

    //Checking Withdrawal
    public void withdrawalChecking(double checking){

        if (this.checking < checking) {
            System.out.println("Insufficient Funds, please deposit money to withdrawal $" + checking +" dollars.");
            System.out.println("You're current balance is $" + this.checking + ".");
            System.out.println("You need to deposit $" + (checking - this.checking) + " to withdrawal $" + checking + " dollars.");
            //I kind of got carried away here, but was interested to see if you could easily do math in-line. Spoilers - you can.
        } else {
            this.checking -= checking;
            totalMoney -= checking;
        }
    }

    //Savings
    //getter
    public double getSavings(boolean print){
        if (print == true) {
        System.out.println("Savings Account: $" + this.savings);
        }
        return savings;     
        //I made this an if statements to easily be able to utilize the code again if I want to pull the data without printing the value, but I also don't have to constantly do System.out.println to print the value, I can simple pass True or False to print. 
    }   

    //Deposit savings
    public void depositSavings(double savings){
        this.savings += savings;
        totalMoney += savings;
    }

    //Withdrawal savings
    public void withdrawalSavings(double savings){
        if (this.savings < savings) { 
            System.out.println("Insufficient Funds, please deposit money to withdrawal $" + savings + " dollars.");
            System.out.println("You're current balance is $" + this.savings + ".");
            System.out.println("You need to deposit $" + (savings - this.savings) + " to withdrawal $" + savings + " dollars.");
            //I kind of got carried away here, but was interested to see if you could easily do math in-line. Spoilers - you can. 
        } else {
            this.savings -= savings;
            totalMoney -= savings;
        }
    }



    //Static Getters
    //totalMoney
    public double getTotalMoney(boolean print){
        if (print == true) {
            System.out.println("Total Balance: $" +  totalMoney);
            }
        return totalMoney;
        //I made this an if statements to easily be able to utilize the code again if I want to pull the data without printing the value, but I also don't have to constantly do System.out.println to print the value, I can simple pass True or False to print. 
        
    }  

    //numberOfAccounts
    public double getNumberOfAccounts(){
        System.out.println("Total Accounts Created: " + numberOfAccounts);
        return numberOfAccounts;
    }  
    
}