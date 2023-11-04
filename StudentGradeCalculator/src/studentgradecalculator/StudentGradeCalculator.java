
package studentgradecalculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class StudentGradeCalculator {

    static ArrayList<Double> marks = new ArrayList<>();
    
    public static void main(String[] args) {
        try
        {
            Scanner scan = new Scanner(System.in);
            int i=1;
            double mark;
            do
            {
                System.out.print("Enter subject "+ i +" mark out of 100 (-1 to end):");
                mark = scan.nextDouble();
                if(mark>100 || mark <-1)
                    System.out.println("invalid mark.");
                else if(mark!=-1)
                {
                    marks.add(mark);
                    i++;
                }
            }while(mark!=-1);
            
            double totalMarks=0;
            
            for(double m:marks){
                totalMarks+=m;
            }
            
            double averagePercentage = totalMarks/marks.size();
            
            String grade="F";
            if(averagePercentage>=90)
                grade="A";
            else if(averagePercentage>=80)
                grade="B";
            else if(averagePercentage>=70)
                grade="C";
            else if(averagePercentage>=60)
                grade="D";
            else if(averagePercentage>=50)
                grade="E";

            System.out.printf( "Total Marks: %.2f\nAveragePercentage: %.2f\nYour Grade is: %s.\n", 
                    totalMarks, averagePercentage,grade);
        }
        catch(InputMismatchException inEx){
            System.out.println("Error input :invalid data type.");
        }
        catch (Exception ex){
            System.out.println("Error :"+ex.getMessage());
        }
        
 
    }
    
}
