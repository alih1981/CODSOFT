
package sms;

public class Student {
    private int rollnumber;
    private String name;
    private double grade;
    private String email;
    private String phone;
    private String adr;
   
    public Student(int rollnumber,String name, double grade, String email, String phone, String adr) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.grade = grade;
        this.email = email;
        this.phone = phone;
        this.adr = adr;
    }  
    
    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public double getGrade() {
        return grade;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        
        return String.format("Enroll Number :%d\nName :%s\nGrade :%f\nEmail :%s\n",
                                rollnumber,name,grade,email); 
    }    
    
    
    
    
}
