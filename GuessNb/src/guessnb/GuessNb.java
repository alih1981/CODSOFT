package guessnb;

import java.util.*;
/**
 *
 * @author AAHROI
 */
public class GuessNb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        
        int nb;
        boolean found;
        char ch;
        while(true){
            nb = 1+ r.nextInt(100);// Generate random nb to guess
            int tries=7; //nb of tries
            found=false;

            Scanner scan = new Scanner(System.in);
            int x; // user input

            System.out.println("You have to guess a number in 7 tries.");
            System.out.println();

            //loop until tries end or user guess the number
            while(tries>0){
                System.out.print(tries + " try/tries left!\nEnter a number between 1 and 100:");
                x = scan.nextInt();
                tries--;
                if( x == nb)
                {
                    found = true;
                    break;
                    //System.exit(0);
                }
                else if(tries>0)
                {
                    if(x>nb)
                    {
                        System.out.println("You need a smaller number,Try Again ");
                        //System.out.println(tries + " try/tries left!");
                    }
                    else
                    {
                        System.out.println("You need a greater number,Try Again! ");
                        //System.out.println(tries + " try/tries left!");
                    }
                }
            }
            
            if(!found )
            {
                System.out.println("Sorry you reached the number of tries, Game over. ");
                System.out.println("The number to guess was "+nb + " !");
            }
            else
                System.out.printf("Bravooo!, You guess the number in %d try/tries.\n",7-tries);
            
            System.out.print("Play Again?(Y/N):");
            ch = scan.next().charAt(0);
            
            if( ch == 'N')
            {
                System.out.print("Good Bye, see you later.");
                break;
                //System.exit(0);
            }
         
        }
    }
    
}
