
//base class
class shape{
    
    String color;
}
//child class
class Triangle extends shape{
       
    
}
public class aInhe {
    public static void main(String[] args){
        
        Triangle t1=new Triangle();
        t1.color= "red";
       
        System.out.println("Triangle color: " + t1.color);
    }
}
