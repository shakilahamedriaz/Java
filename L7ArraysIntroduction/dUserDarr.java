import java.util.Scanner;

public class dUserDarr {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();

        int number[]=new int[size];   //declaring array

        for(int i=0; i<size; i++){
            System.out.println(number[i]);
        }
    }
}

//java automatic zero(0), store kore 
//eikhne array err size dewa hyce but array input deya hy nai, er poreo 0 print korche
