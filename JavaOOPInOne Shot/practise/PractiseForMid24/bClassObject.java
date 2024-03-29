//this is calss
class pen{

    //properties of class
    String color;
    String type;

    //this is method, like function in c
    public void write()
    {
         System.out.println("write something");
    }

    //this is also a method
    public void printcolor()
    {
        System.out.println(this.color);
    }
}

public class bClassObject {
    public static void main(String[] args)
    {
        //a new object of pen class
        pen pen1= new pen(); //new object
        pen1.color= "Blue";
        pen1.type= "Gel pen";
        
        //calling method
        pen1.write();
        pen1.printcolor();

        //a new object in the pen class
        //we can create diffrent object in the same class

        pen pen2 = new pen();

        pen2.color= "Black";
        pen2.type= "Ball point";

        pen2.printcolor();
        pen2.write();


    }
}
