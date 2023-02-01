import java.util.*;

public class SwitchStatement {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
   
        int button= sc.nextInt();
   
        switch (button) {
   
           case 1:  System.out.println("Hello");
                break;
   
           case 2:  System.out.println("Salam"); 
                break;
           
           case 3:  System.out.println("Fi a-manillah");
                break;

   
           default: System.out.println("Invalid inuput");
               
               
        }
   
       }
}
