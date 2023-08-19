//class
class pen {
    //properties of class
    String color;
    String type;

    //methods
    public void write(){
        System.out.println("Write Something");
    }
    //this is also method
    public void printColor(){
        System.out.println(this.color);
    }
}

public class bclass_Object {
    public static void main(String[] args){

        //create an object
        pen pen1= new pen();
        pen1.color= "Blue";
        pen1.type = "Gel pen";
        //calling method
        pen1.write();
        pen1.printColor();

       //create another object
        pen pen2 =new pen();
        pen2.color ="Black";
        pen2.type= "Ball point";
        
        //calling method
        pen2.write();
        pen2.printColor();


    }
}
