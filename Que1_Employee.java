//Question1- Employee
import java.util.Scanner;

public class Main {
    private String Name;
    private int Employeeid;
    private double Wage;
    private boolean fullTime;
    Main(String Name,int Employeeid,double Wage,boolean fullTime){
        this.Name=Name;
        this.Employeeid=Employeeid;
        this.Wage=Wage;
        this.fullTime=fullTime;
    }
    String Accessor(){
       return getName();
    }

    private String getName() {
        return null;
    }
    int Mutator(){
       return setEmployeeid();
    }

    private int setEmployeeid() {
        return Employeeid;
    }

    double Wage(){
        return Wage;
    }
    private double Wages(){
        return Wage();
    }
void printDetails()
{
        if(fullTime==true) 
{
            System.out.println("Employee Name:- "+Name+"\tEmployee id:-"+Employeeid+"\tEmployee Wage:-"+Wage+"\tEmployee is full time");
        }
        else 
{

            System.out.println("Employee Name:-"+Name+"\tEmployee id:-"+Employeeid+"\tEmployee Wage:-"+Wage+"\tEmployee is not a full time");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee name ");
        String Name =sc.next();
        System.out.println("Enter the employee id ");
        int Employeeid = sc.nextInt();
        System.out.println("Enter the wage of employee");
        double Wage= sc.nextDouble();
        System.out.println("Enter True or False");
        boolean fullTime=sc.hasNextBoolean();
        Main e = new Main(Name,Employeeid,Wage,fullTime);
        e.Accessor();
        e.Mutator();
        e.Wage();
        e.printDetails();

    }
}	


