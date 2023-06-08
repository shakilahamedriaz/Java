
//class
class Student{
    
    String name;
    int age;

    //method
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class bOpp {
    public static void main(String[] args){
      
        //object
        Student s1=new Student(); //new= create location heap, student= function called constructor,
        s1.name= "shakil";
        s1.age= 24;

        s1.printInfo();

       

    }
}
