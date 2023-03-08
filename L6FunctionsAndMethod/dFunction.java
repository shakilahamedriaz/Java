import java.util.Scanner;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class dFunction {

    public static int calculateProduct(int a, int b){

        return a*b;
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the element of b: ");
        int b=sc.nextInt();

        System.out.println("Product of 2 number is : "+calculateProduct(a, b));
    }
}
