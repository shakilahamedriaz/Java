import java.util.Scanner;

public class cpattern {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter row : ");
        int r=input.nextInt();

        for(int i=1; i<=r; i++){
            
            for(int j=1; j<=i; j++){

              System.out.print("*");

            }
            System.out.println();
        }
        }
    }

