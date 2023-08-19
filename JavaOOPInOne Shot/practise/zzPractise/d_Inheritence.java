//super-class
class Animal {
    String name;

    //method in class
    public void eat(){
        System.out.println("I can eat");
    }
}

//inherited from super class -Animal
class dog extends Animal{

    //new mehtod sub-class
    public void display(){
        System.out.println("MY name is: "+name);
    }
}

public class d_Inheritence {
    public static void main(String[] args){
        Animal ani= new Animal();
        ani.name = "kalu";
        ani.eat();

        //another object
        dog dogi= new dog();
        dogi.name= "Tommm";
        dogi.display();
    }
}
