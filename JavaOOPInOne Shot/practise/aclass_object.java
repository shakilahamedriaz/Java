//this is Class
class pen{

    //properties of class
    String color;
    String type;

  
    //this is method, like a function in c
    public void write(){
        System.out.println("Writre something");
    }
   //this is also a method
    public void printColor(){
        System.out.println(this.color);
    }
}


public class aclass_object {
    public static void main(String[] args){
        
       //a new object of pen class
       pen pen1=new pen();
       pen1.color= "Blue";
       pen1.type= "GEl pen";

       //calling method or calling funcion.
       pen1.write();
       pen1.printColor();
    }
}
