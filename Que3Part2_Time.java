//Question3 - Part2
import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        String one ="10:24:00";
        String two = "12:22:58";
        int hours , minutes ,seconds;
        
        Scanner sc = new Scanner(System.in);
        hours = sc.nextInt();
        minutes = sc.nextInt();
        seconds = sc.nextInt();
        if(hours %2==0 && minutes%2==0 && seconds%2==0)
        {
            System.out.println("First time time:"+one+" Last time:"+two);
        }
        else 
        {
            System.out.println(" Not Even");
        }
    }
}


