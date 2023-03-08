package inheritance;

//base class
class shape{
    public void area(){
        System.out.println("Display area");
    }
}
//child class
class Tringle extends shape{   //ei porjonto multiple inheritance
 
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
//again child from triangle ..called:
//  derived class from shape
class EqualaterTriangle extends Triangle{  //ei porjonto Hirachical inheritance

public void area(int l, int h){
    System.out.println(1/2*l*h);
}

}
public class bInh {
    public static void main(String[] args){
        EqualaterTriangle et = new EqualaterTriangle();
        et.area(4, 6);  // Pass length and height as parameters

        Tringle t = new Tringle();
        t.area(3, 5);   // Pass length and height as parameters

        
    

    }
}