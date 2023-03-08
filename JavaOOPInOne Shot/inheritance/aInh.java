package inheritance;

//base class
class shape{
    String color;
}
//child class
class Triangle extends shape{
       

}
public class aInh {
    public static void main(String[] args){
        
        Triangle t1=new Triangle();
        t1.color= "red";
    }
}
