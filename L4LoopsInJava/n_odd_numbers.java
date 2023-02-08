import java.util.Scanner;

public class n_odd_numbers {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        int n= input.nextInt();

        for(int i=0;i<=n; i++){

            if(i%2 !=0){
                System.out.println(i);
            }
        }
    }
}
