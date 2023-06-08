//class
class Student{

    String name;
    int age;

    //method create
    public void printInfo(){

        System.out.println(this.name);
        System.out.println(this.age);
    }


    //constructor
    Student(String name, int age){

        this.name=name;
        this.age=age;
    }
}


public class aCons {

    public static void main(String[] args){
      
        //object
        Student s1 = new Student("Shakil", 023);
        // new= create location on heap, student= function called constructor;
        
        s1.printInfo();
    }
    
}
