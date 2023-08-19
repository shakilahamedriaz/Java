class Student {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name+ " and "+ age);
    }
}
public class e_Polym {
   public static void main(String[] args){
       
    Student st=new Student();
    st.name= "LOst her";
    st.age= 33;

    st.printInfo(st.age);
    st.printInfo(st.name);
    st.printInfo(st.name,st.age);
      
   }   
}
