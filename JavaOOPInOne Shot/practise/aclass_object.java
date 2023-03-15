
//student is the Class
class Student{
     
    //here is the properties of class
    String name;
    String department;
    String id;
    int age;

    //the method is here
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.department);
        System.out.println(this.id);
        System.out.println(this.age);
    }
}

public class aclass_object {
    public static void main(String[] args){
           
        //the object is here:
        Student s1=new Student(); //the way to create new object;
        s1.name= "Shakil Ahamed Riaz";
        s1.department= "Software Engineering";
        s1.id= "221-35-995";
        s1.age=22;

      //calling the method or like calling function.

      s1.printInfo();
    }
}
