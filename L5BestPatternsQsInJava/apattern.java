import java.util.Scanner;

public class apattern {
   public static void main(String[] args){

         Scanner input=new Scanner(System.in);

         System.out.println("Enter the row : ");
         int n=input.nextInt();
         System.out.println("Enter the columb: ");
         int m=input.nextInt();

         for(int i=1; i<=n; i++)
         {
            for(int j=1; j<=m; j++)
            {
                System.out.print("*");

            }
            System.out.println();
         }
   } 
}
