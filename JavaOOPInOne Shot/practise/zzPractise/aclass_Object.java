//student is the class
class Student{
    //properties of class
    String name;
    String department;
    String id;
    int Age;

    //the method/function is here
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.department);
        System.out.println(this.id);
        System.out.println(this.Age);

    }
}

public class aclass_Object {
    public static void main(String[] args){

        //the object is here
        Student s1= new Student(); //created objcet
        s1.name = "Shakil Ahamed Riaz";
        s1.department= "Software Engineering";
        s1.id= "225564563";
        s1.Age= 23;

        //calling method
        s1.printInfo();
    }
}
