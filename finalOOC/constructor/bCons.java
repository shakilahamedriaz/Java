public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
} 

public class bCons {
    
        // Getter and setter methods for name and age
    
        public static void main(String[] args) {
            // Using the default constructor
            Person person1 = new Person();
            System.out.println(person1.getName());  // Output: Unknown
            System.out.println(person1.getAge());   // Output: 0
    
            // Using the parameterized constructor
            Person person2 = new Person("John", 25);
            System.out.println(person2.getName());  // Output: John
            System.out.println(person2.getAge());   // Output: 25
        }
    }
    

