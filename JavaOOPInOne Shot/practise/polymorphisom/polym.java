
//class
class Student{

    //properties of class
    String name;
    int age;
    
    //method.
    public void printInfo(String name){
    
        System.out.println(name);
    }
    
    //method is same name
    
    public void printInfo(int age){

        System.out.println(age);
    }

    //method again same name

    public void printInfo(String name, int age){
      
        System.out.println(name + " "+age);
    }
}

public class polym {
    public static void main(String[] args){
       //object of the class(student class)
       Student s1=new Student();

       //object properties define or input value;

       s1.name= "abdul khaleq akanda";
       s1.age= 72;
      
       //calling method by function.

       s1.printInfo(s1.age);
       s1.printInfo(s1.name);
       s1.printInfo(s1.name, s1.age);
       
    }
}
