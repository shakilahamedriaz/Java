package Java_Inheritance;

 class Calculation{
    int z;
    public void addition(int x, int y)
    {
        z=x+y;
        System.out.println("The sum of the given numbers : "+z);
    }
    public void Substraction(int x, int y)
    {
        z=x-y;
        System.out.println("The diffrence between the given numbers: "+z);
    }
}
 class My_Calculation extends Calculation{
    public void multiplication(int x, int y){
    z=x*y;
    System.out.println("The procuct of the Given numbers : "+z);
}

public class Inheritance_01 {
}
public static void main(String args[]){    
    int a=20, b=10;
    My_Calculation obj=new My_Calculation();
    obj.addition(a,b);
    obj.Substraction(a,b);
    obj.multiplication(a,b);
 }
}