//Question2 
import java.util.*;

public class Main { 
    String StudentName;
     double AssignmentMark;
     double StudentMark;
     String Grade;
 
     Main(String StudentName , double AssignmentMark , double StudentMark)
 {
         this.StudentName=StudentName;
         this.AssignmentMark=AssignmentMark;
         this.StudentMark=StudentMark;
         this.Grade=Grade;
     }
     Main(){
         AssignmentMark=100;
     }
     double Grade(){
         return  CalculateGrade();
     }
     private double getStudentMarK() {
         return StudentMark;
     }
 
     double Markings(){
         Main q = new Main();
         q.getStudentMarK();
         if(StudentMark < AssignmentMark || StudentMark>0){
             return StudentMark;
         }else {
             System.out.println("Enter the Valid Marks");
         }
         return -1;
 }
 double CalculateGrade(){
         double Grade= (StudentMark/AssignmentMark)*100;
         if(Grade<50){
             System.out.printf("fail");
         } else if (Grade>=50 && Grade<=64) {
             System.out.printf("Pass");
         } else if (Grade>=65 && Grade<=74) {
             System.out.printf("credit");
         } else if (Grade>=75 && Grade<=84) {
             System.out.printf("Distinction");
         }else {
             System.out.printf("Pass");
         }
         return Grade;
     }
 
     public static void main(String[] args) {
         Main q = new Main("Rutuja",55,45);
         q.Markings();
         q.CalculateGrade();
     }
 
 }
 
 