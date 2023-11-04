/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author AAHROI
 */

public class ATMV1 {

    /**
     * @param args the command line arguments
     */
    public static Account acc;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int password=12345;
        int tries=3;
        int upass;
        int x;
        double amount;
        do
        {
            System.out.print("Enter password:");
            upass =scan.nextInt();
            if(upass==password){
            do 
            {
                System.out.print("Welcome Mr/Miss, to continue you need to ");
                System.out.println("Open a new Account!");
                System.out.println("1:Open new account ");
                System.out.println("2:Exit");

                System.out.print("Enter your choice:");
                x =scan.nextInt();
                switch(x)
                {
                    case 1 -> 
                    { 
                        System.out.print("Enter the Initial Amount:");
                        amount =scan.nextDouble();
                        acc = new Account(amount);
                        do 
                        {
                            System.out.println("Main menu");
                            System.out.println("1:View account balance ");
                            System.out.println("2:Credit account");
                            System.out.println("3:Debit account");
                            System.out.println("4:Close account");
                            System.out.println("5:Exit");
                            System.out.print("enter your choice:");

                            x =scan.nextInt();
                            switch(x)
                            {
                                case 1 -> 
                                { 
                                    if(acc.getBalance()>=0) 
                                        System.out.println("your  account balance is " + acc.getBalance());
                                }
                                case 2 -> 
                                {
                                    System.out.print("Enter the Amount to credit:");
                                    amount =scan.nextDouble();
                                    acc.credit(amount);
                                }
                                case 3 -> 
                                {
                                    System.out.print("Enter the Amount to debit:");
                                    amount =scan.nextDouble();
                                    acc.debit(amount);
                                }
                                case 4 -> 
                                {
                                    acc.closeAccount();
                                }
                                case 5 -> 
                                {
                                    System.out.println("Thank you");
                                }
                                default -> 
                                {
                                    System.out.println("the number is wrong");
                                }
                            }
                        } while(x!=5);

                    }
                    case 2 ->
                        System.out.println("Thank you");
                }
            } while(x!=2);
            }
            else
                tries--;
        } while (tries>0);
            
            
    }
}
