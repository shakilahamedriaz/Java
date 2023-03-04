import java.util.Scanner;

public class epattern {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter row : ");

        int n = input.nextInt();

        for(int i=1; i<=n; i++){
          //inner loop for space
           for(int j=1; j<=n-i; j++){

            System.out.print(" ");

           }
           //inner loop for star;
           for(int j=1; j<=i; j++){
            System.out.print("*");
           }

           System.out.println();

        }
    }
}
