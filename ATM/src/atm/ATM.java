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
public class ATM {

    private static Account acc = new Account(0);
    
    public static void getBalance(){
        acc.displayBalance();
    }
    
    public static void withdraw(double amount){
        acc.debit(amount);
    }
    
    public static void deposit(double amount){
         acc.credit(amount);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int x;
        double amount;
        do {
            System.out.println("\nWelcome to our ATM machine");
            System.out.println("      ATM Main menu       ");
            System.out.println("The Available ATM services");
            System.out.println("*******************************");
            System.out.println("*    1:View account balance   *");
            System.out.println("*    2:withdraw money         *");
            System.out.println("*    3:deposit money          *");
            System.out.println("*    0:Exit                   *");
            System.out.println("*******************************");
            System.out.print("\nEnter your choice:");

            x = scan.nextInt();
            switch (x) {
                case 1 -> {
                    getBalance();
                }
                case 2 -> {
                    System.out.print("Enter the Amount to withdraw:");
                    amount = scan.nextDouble();
                    withdraw(amount);
                }
                case 3 -> {
                    System.out.print("Enter the Amount to deposit:");
                    amount = scan.nextDouble();
                    deposit(amount);
                }
                case 0 -> {
                    System.out.println("Thank's for using our ATM. \nGood Bye");
                }
                default -> {
                    System.out.println("Wrong choise! choose amoung below list please.");
                }
            }
        } while (x != 0);

    }
}
