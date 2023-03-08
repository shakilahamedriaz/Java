import java.util.Scanner;

public class eFunction {
    public static void printFactorial(int n){
        //loop
         int factorial=1;
        for(int i=n; i>=1; i--){
           
            factorial=factorial*i;

        }
        System.out.print(factorial);
        return ;
        
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
       
        printFactorial(n);
    }
}
