import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

public class fSearchNum {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int number[]=new int[size];

        for(int i=0; i<size; i++){
            number[i]=sc.nextInt();
        }

        System.out.print("Enter the number that you want to search : ");
        int x=sc.nextInt();

        for(int i=0; i<number.length; i++){

            if(number[i]==x){

                System.out.println("X found at index at : "+i+1);
            }
        }

    }
}
