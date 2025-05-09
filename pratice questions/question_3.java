import java.util.*;
public class question_3 {
    public static int whichIsGreater(int a, int b){
        if(a>b){
            System.out.print("a is greater");
            return a;
        }else if(a<b){
            System.out.print("b is greater");
            return b;
        }else{
            System.out.print("both are equal");
        }   return a;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a ");
        int a = sc.nextInt();

        System.out.print("enter the value of b ");
        int b = sc.nextInt();
        int greater = whichIsGreater(a, b);
        System.out.println(greater+ "is the grater number");
    }   
}   
