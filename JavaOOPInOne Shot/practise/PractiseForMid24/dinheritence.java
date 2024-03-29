//class
class Animal {

    //properties
    String name;

    //method in class
    public void info()
    {
        System.err.println("I can eat");
        System.out.println("name is "+this.name);
    }
}

//inherited from super class animal to dog
class dog extends Animal{
     
    //new method sub-class
    public void display()
    {
        System.out.print("My name is " + name);
    }
}


public class dinheritence {

    public static void main(String[] args)
    {
        //object
        Animal ani = new Animal();
        ani.name = "Kalu";
        ani.info(); 

        //another object

        dog dogi = new dog();
        dogi.name= "Tom";
        dogi.display();
        
        
    }

}
