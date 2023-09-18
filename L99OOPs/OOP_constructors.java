/*constractor is a special method which is invoked
 * automatically at the time of object creation
 * 
 * *Constractors have the same name as class or structure
 * *Constructors don't have a return type.
 * *Constructors are ony calle once,at object creation
 * *Memory allocation happens ehen constructor is called
 */

 class Student {
    String name;
    int roll;

   Student() {
    System.out.println("Constructor is called");
  }

 }

public class OOP_constructors {
    
    public static void main(String args[]){
          Student s1 = new Student();
    }
}
