
//super-class
class Animal{
    String name;

    //method in class
    public void eat(){

        System.out.println("I can Eat");
    }

}
//inherit from Animal
class Dog extends Animal{
    //new method in sub-class
   public void display(){
    System.out.println("My name is " + name);
   }

}


public class Main {
    public static void main(String[] args){

        //create an object;
        Dog kutta=new Dog();
        kutta.name= "Tomy";
        kutta.display();

          // call method of superclass
          // using object of subclass
         kutta.eat();    //kutta is a local bangali word it means DOG
    }
}
