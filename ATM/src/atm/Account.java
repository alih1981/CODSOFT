
package atm;


public class Account {
    private double balance;
    private boolean status;
    
    public Account(double b){
        balance = b;
        status = true;
        //System.out.println("Your Account has been created.");
    }
    
    public void credit( double amount)
    {
        if(status==true){
            balance += amount;
            System.out.println("New Account balance :" + balance);
        }
         else
           System.out.println("Sorry Your Account is closed");
    } 
    
    public void debit( double amount)
    {
        if(status==true){
            if(balance >=amount){
                balance -= amount; 
                System.out.println("New Account balance :" + balance);
            }
            else
                System.out.println("Insuffisant Balance.");   
        }
        else
           System.out.println("Sorry Your Account is closed");
    }
    
    public void displayBalance(  )
    {
        if(status==true){
            System.out.println("Accout balance :" + balance);
        }
        else
           System.out.println("Sorry Your Account is closed");
    } 
    
    public double getBalance( )
    {
        if(status==true)
            return balance;
        else 
          return -1;
    }
    
    public void closeAccount( )
    {
        if(status==true){
            status=false;
            System.out.println("Your Account has been closed");
        }
        else
            System.out.println("Your Account is already closed");
    }
      
}