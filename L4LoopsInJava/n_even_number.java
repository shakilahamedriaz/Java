import java.util.Scanner;

public class n_even_number {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        int num= input.nextInt();

        for(int i=0; i<=num; i++){

            if(i%2==0){

                System.out.println(i);
            }
        }
    }
}
