//Question 4-ArrayList
import java.util.ArrayList;
import java.util.Scanner;

public class Main
	{
		ArrayList<String> name = new ArrayList<String>();
   		Scanner sc = new Scanner(System.in);
   	    public void add(int n)
	 {
        		for (int i = 0; i < n; i++) 
		{
            		System.out.print("Enter the name:");
            		String s = sc.nextLine();
            		System.out.println();
            		name.add(s);
           		name.replaceAll(String::toUpperCase);
       		 }
        		System.out.println(name);
    	}
    	public void remove(int ele) 
	{
        	name.remove(ele);
        	System.out.println(name);
   	 }
    public void printElements(){
        String str;
        int i,j;
        for ( i = 0; i < name.size(); i++)
      {
        str = name.get(i);
      
        for(j=0;j<str.length();j++){
        if(str.charAt(j)=='A' || str.charAt(j)=='E' || str.charAt(j)=='I' || str.charAt(j)=='U' || str.charAt(j)=='O')
        {
            System.out.println("The name "+str+" contains vowels "+"and the vowels are "+str.charAt(j));
        }
    
}
            int count; 
            char string[] = str.toCharArray();  
              
            System.out.println("Duplicate characters in a given string: ");  
            for(i = 0; i <string.length; i++) {  
                count = 1;  
                for(j = i+1; j <string.length; j++) {  
                    if(string[i] == string[j] && string[i] != ' ') {  
                        count++;  
                        string[j] = '0';  
                    }  
                }    
                if(count > 1 && string[i] != '0')  
                    System.out.println(string[i]);  
            } 
       
          

        }
    }    
        public static void main(String args[]) {
        Main al=new Main();
        al.add(1);
        al.printElements();
    }
}

			