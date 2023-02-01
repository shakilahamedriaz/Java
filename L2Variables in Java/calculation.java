public class calculation {
    public static void main(String[] args)
{

    int a=10;
    int b=5;
    int ans= a*b/a-b; // for java not follow math matical operator
                   // * / %  then -,+  (left to right)
   System.out.println(ans);


    int ans2= (a*b)/(a-b);  // parenthesis age
    System.out.println(ans2);

}
}
