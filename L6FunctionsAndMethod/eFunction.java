import java.util.Scanner;

public class eFunction {
    public static void printFactorial(int n){
        //loop for factorial.
        if(n<0){
            System.out.println("Invalid Number !");
            return;
        }
         int factorial=1;
        for(int i=n; i>=1; i--){
           
            factorial*=i;

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
