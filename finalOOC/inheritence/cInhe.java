class Animal{

    String name; //properties of class
    //method in baseclass
    public void eat(){
        System.out.println("I can eat");
    }
}

//inherit from animal
class Dog extends Animal{
    
    //new method in subclass
    public void display(){
        System.out.println("My name is : "+name);
    }
}

public class cInhe {
    public static void main(String[] args){

        //objects
        Dog d1= new Dog();
        d1.name = "Uity";
        d1.display();
        d1.eat();  //dog class theke amra sob excess korte pari


    }
}
