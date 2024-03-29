 class Student{
    
    String name;
    String department;
    String id;
    int age;
 

    //method

    public void printinfo()
{
    System.out.println(this.name);
    System.out.println(this.department);
    System.out.println(this.id);
    System.out.println(this.age);
}
}



public class aClassObject {
    public static void main(String[] args)
    {
        Student s1 = new Student(); //object
        s1.name = "shakil ahamed riaz";
        s1.department= "swe";
        s1.id= "221-35-995";
        s1.age=22;
        

        s1.printinfo();
    }
}
