
import java.io.BufferedWriter;
import java.io.FileWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Salary {
     static String  StaffID, Name, Salarygrade, Department;
     public static void main(String [] args){
     }



    public static String getStaffID() {
        return StaffID;
    }

    public static void setStaffID(String StaffID) {
        Salary.StaffID = StaffID;
    }

    public static String getName() {
        return Name;
    }

    public static void setName(String Name) {
        Salary.Name = Name;
    }

    public static String getSalarygrade() {
        return Salarygrade;
    }

    public static void setSalarygrade(String Salarygrade) {
        Salary.Salarygrade = Salarygrade;
    }

    public static String getDepartment() {
        return Department;
    }

    public static void setDepartment(String Department) {
        Salary.Department = Department;
        writeFile(StaffID + Name + Salarygrade + Department);
    }

    private static void writeFile(String string) {
    try{
         FileWriter myWriter = new FileWriter("Smanage.txt",true);
         BufferedWriter myBF = new BufferedWriter(myWriter);
         char[] content = null;
         myBF.write(content);
         myBF.newLine();
         myBF.write(content);
         myBF.close();
     }catch(Exception ex)
         //buffer rea
        
        
        
    }
        
    }

    static void saveDB(String Name, String ID, String salarygrade, String department) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
 
        
    
    
    
}
