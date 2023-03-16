import java.util.Scanner;

public class eUserIn {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();

        int number[]=new int[size];   //declaring array

        for(int i=0; i<size; i++){

            number[i]=sc.nextInt();
        }
        
        System.out.println("The elements of the array: ");
        for(int i=0; i<size; i++){
            System.out.println(number[i]);
        }
    }
}