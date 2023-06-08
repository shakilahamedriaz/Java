
//class
class pen{
    //properties fo class
    String color;
    String type;

    //method
    public void write(){

        System.out.println("Write something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}


public class aOpp{

    public static void main(String[] args){

        //create object
        pen pen1=new pen();
        pen1.color= "blue";
        pen1.type= "gel";

        pen1.printcolor();
        pen1.write();

        //another object.
        pen pen2=new pen();
        pen2.color= "red";
        pen2.type= "long";

        pen2.printcolor();



    }
}