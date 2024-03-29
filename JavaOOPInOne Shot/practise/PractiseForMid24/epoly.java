class Student{

    String name;
    int age;

    public void printinfo(String name)
    {
        System.out.println(name);
    }

    public void printinfo(int age)
    {
        System.out.println(age);
    }

    public void printinfo(String name, int age)
    {
        System.out.println(name+ " "+ age);
    }
}

public class epoly {
    public static void main(String[] args)
    {
          Student st = new Student();
          st.name= "shakil";
          st.age= 33;

          st.printinfo(st.name);
          st.printinfo(st.age);
          st.printinfo(st.name, st.age);
    }
}
