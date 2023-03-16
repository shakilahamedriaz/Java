//class
class pen{
    
    //properties
    String color;
    String type;
    
    //method= like function
    public void write(){
        System.out.println("Writing something ");

    }
    //method
    public void printColor(){
        System.out.println(this.color);
    }

}



public class aOpp {

    public static void main(String[] args){
       //object
        pen pen1=new pen();
        pen1.color= "blue";
        pen1.type= "gel";
        pen1.write();
        pen1.printColor();

        //object
        pen pen2=new pen();
        pen2.color= "black";
        pen2.type= "ballpoint";

        pen2.printColor();



    }
    
}
