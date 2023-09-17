class pen {
   private String color;
   private int tip;
    
    //getter:
    public String getColor() {
        return color;
    }
    public int getTip() {
        return tip;
    }
    
    //setter:
    void setColor(String newColor){
        this.color=newColor;
    }
    void setTip(int tip){
        this.tip=tip;
    }

}

public class OOP_setterGetter {
    public static void main(String args[]){
        pen p1 = new pen();
        p1.setColor("Yellow"); 
        p1.setTip(55);

        // Print:
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}

