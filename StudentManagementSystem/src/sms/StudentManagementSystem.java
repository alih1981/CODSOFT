
package sms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    
    private ArrayList<Student> studentList ;
    
    public StudentManagementSystem() {
        this.studentList = new ArrayList<>();
        try {
            File x = new File("d:\\SMS\\students.txt");
            Scanner sc = new Scanner(x);
          
            Student s;
            String data;
            String[] sd = new String[6];
            while(sc.hasNext()) {
                data = sc.nextLine();
                sd=data.split(",");
                s= new Student(Integer.parseInt(sd[0]),sd[1],
                        Double.parseDouble(sd[2]),sd[3],sd[4],sd[5]);
                studentList.add(s);
            }
           
            sc.close();

        } 
        catch (FileNotFoundException e) {
            System.out.println("Error loading Students List.");
        }
    }
    
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
     
    public void addStudent(Student s){
        studentList.add(s);
    }
    
    public void removeStudent(int rollnumber){
        for(Student s:studentList)
            if(s.getRollnumber()==rollnumber){
                 studentList.remove(s);
                 break;
            }
    }
    
    public void removeStudent(Student s){
        studentList.remove(s);
    }
    
    public void removeAllStudent(){
        studentList.removeAll(studentList);
    }
    
    public Student searchStudent(int rollnumber){
        for(Student s:studentList)
            if(s.getRollnumber()==rollnumber)
                return s;
        return null;
    }
    
    public void displayAllStudent(){
        int i=1;
        for(Student s:studentList){
            System.out.print("\nStudent "+i+" informations\n"+s.toString());
            i++;
        }
    }
    
    public void displayStudent(int rollnumber){
        for(Student s:studentList)
            if(s.getRollnumber()==rollnumber){
                s.toString();
                return;
            }
        System.out.println("\nStudent with rollnumber "+ rollnumber +" is not found.\n");
    }
    
}
