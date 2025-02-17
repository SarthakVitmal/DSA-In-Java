package OoPs;

class Account{
    private double balance;
    public double getBalance(double balance){
        //withdrawing the money
        boolean result = validate("saltshaker","saltshaker123");
        if(result){
            this.balance -= balance;
            System.out.println("Withdrawing "+balance+" Amount");
        }else{
            System.out.println("Something Went Wrong..Try Again!!!");
        }
        return balance;
    }
    public void setBalance(double balance){
        //depositing the money
        boolean result = validate("saltshaker","saltshaker123");
        if(result){
            this.balance = this.balance + balance;
            System.out.println("Credited Rs." + this.balance+ " into Your account");
        }else{
            System.out.println("Something Went Wrong..Try Again!!!");
        }
    }
    private boolean validate(String userName,String password){
        return userName.equals("saltshaker") && password.equals("saltshaker123");
    }
}

public class datahiding {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(1000);
        acc.getBalance(500);
    }
}
