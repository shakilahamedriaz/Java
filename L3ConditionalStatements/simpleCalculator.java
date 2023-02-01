

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args){
    
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result;
        char operator;
        operator=sc.next().charAt(0);
        
        switch(operator){
                       
            case '+':  result = a+b;
             System.out.println(result);
            break;
           
            case '-': result= a-b;
              System.out.print(result);
              break;

              case '*': result= a*b;
              System.out.print(result);
              break;
              
              case '/': result= a/b;
              System.out.print(result);
              break;  


            default: System.out.print("Invalid");
                   break;

        }

    }
}
