public class BankAccountTest {
    
    public static void main(String[] args){

        BankAccount firstUser = new BankAccount();
        BankAccount secondUser = new BankAccount();


        firstUser.getChecking(true);
        firstUser.getSavings(true);
        firstUser.depositChecking(100.00);
        firstUser.depositSavings(100.00);
        firstUser.getChecking(true);
        firstUser.getSavings(true);
        firstUser.depositChecking(100.00);
        firstUser.depositSavings(100.00);

        firstUser.withdrawalChecking(400.00);
        firstUser.withdrawalSavings(400.00);

        secondUser.getChecking(true);
        secondUser.getSavings(true);
        secondUser.depositChecking(5000.00);
        secondUser.depositSavings(3000.00);
        secondUser.getChecking(true);
        secondUser.getSavings(true);
        secondUser.depositChecking(100.00);
        secondUser.depositSavings(100.00);
        
        firstUser.getTotalMoney(true);
        firstUser.getNumberOfAccounts();

        secondUser.getTotalMoney(true);
        secondUser.getNumberOfAccounts();
    }
}
