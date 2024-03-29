class Student{

    //properties of class
    String name;
    int age;

    //method
    public void printinfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    //constractor

    Student(String name, int age)
    {
        this.name=name;
        this.age=age;

        //System.err.println(name);
       // System.err.println(age);
    }


}

public class cons {

   public static void main(String[] args) {
     
     Student s1 = new Student("Shakil", 24);

     s1.printinfo();
   }
    
}
