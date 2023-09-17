
class pen {
    String color;
    int tip;

    void setColor(String newColor)
    {
        color= newColor;
    }

    void setTip(int newTip)
    {
        tip=newTip;
    }
}

class Student {
    
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int chem, int math)
    {
        percentage= (phy+chem+math)/3;
    }
}

class BankAccount {

    public String username;
    private String password;

    public void setPassword(String pwd)
    {
        password=pwd;
    }

}

public class OOPS_accessModi {
    private static final String Blue = null;

    public static void main(String args[])
    {
          pen p1 = new pen(); //created a pen obj called p1
          p1.setColor(Blue);
          //p1.clor= "Blue"; //we can write this way.
          p1.tip=55;
          //print:
          System.out.println(p1.color);
          System.out.println(p1.tip);

          //another object: 
          Student st= new Student();
          st.age=22;
          st.name= "shakil Ahamed Riaz";
          st.calculatePercentage(44,44, 55);

          //print:
          System.out.println(st.name);
          System.out.println(st.age);
          System.out.println(st.percentage);


         //another obj for bank Ac:
         BankAccount myac= new BankAccount();
         myac.username= "shakilusername";
        // myac.password = "abcdefgh"
        myac.setPassword("abcdefpass");

        //print:
        System.out.println(myac.username);
        
    }
}
