
//class
class Student{

    String name;
    int age;
    //method
    public void printInfo(){

        System.out.println(this.name);
        System.out.println(this.age);
        
    }
    //Constractor
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
}

public class cOpp {
    public static void main(String[] args){
      
        //Object
        Student s1 = new Student("Riaz", 48); // new= create location on heap, student= function called constructor,
        
        s1.printInfo();

    }
}
