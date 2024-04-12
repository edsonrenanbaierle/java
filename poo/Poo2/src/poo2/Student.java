/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2;

/**
 *
 * @author User
 */
public class Student {
    public String name;
    public Double firstNote;
    public Double secondNote;
    public Double thirdNote;
    
    public Double finalGrade(){
        return this.firstNote + this.secondNote + this.thirdNote;
    }
    
    public String approvedOrNot(){
        if(finalGrade() >= 60){
            return "Pass";
        }else {
            Double missingToPass = 60 - finalGrade();
            return "Failed" + "\n" + 
                   "MISSING " + String.format("%.2f", missingToPass) + " POINTS";
        }
    }
    
    @Override
    public String toString(){
        return "FINAL GRADE = " + String.format("%.2f", finalGrade()) + "\n" + approvedOrNot();
    }
}
