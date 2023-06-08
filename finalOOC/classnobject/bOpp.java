//class
class Student{
    //properties of class
    String name;
    int age;
    int id;
    double cgpa;
    String hometown;

    public void printInfo(){

        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.id);
        System.out.println(this.cgpa);
        System.out.println(this.hometown);
    }
}


public class bOpp {
    public static void main(String[] args){

        //create object here
        
        Student s1= new Student();
        s1.name= "Shakil Ahamed riaz";
        s1.age=23;
        s1.id=995;
        s1.cgpa=3.60;
        s1.hometown="Mymensingh";
      

        Student s2 = new Student();
        s2.name = "faul";
        s2.age= 22;
        s2.id= 98;
        s2.cgpa= 3.88;
        s2.hometown= "Gazipur";


        Student s3 = new Student();
        s3.name = "AH";
        s3.age= 22;
        s3.id= 337;
        s3.cgpa= 3.77;
        s3.hometown= "Mymensingh";


        // all method callig serially
        System.out.println("1st person information");
        s1.printInfo();
        
        System.out.println("2nd person information");
        s2.printInfo();

        System.out.println("3rd person information");
        s3.printInfo();
    }
}
