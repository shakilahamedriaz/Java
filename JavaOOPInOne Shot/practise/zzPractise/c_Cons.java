//class
class Student {
    // properites of class
    String name;
    int age;

    //method
    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    //Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class c_Cons {
    public static void main(String[] args) {

        //Object
        Student s1 = new Student("Riaz", 48);
        Student s2 = new Student("Sabbir", 44);

        // Calling the printInfo method to display student information
        s1.printInfo();
        s2.printInfo();
    }
}
