import java.util.*;
public class functions {
    public static int CalculateSum(int a, int b){
        int sum = a+ b;
        return sum;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("what is the value of a? ");
        int a = sc.nextInt();
        System.out.print("what is the value of b? ");
        int b = sc.nextInt();

        int sum = CalculateSum(a , b);
        System.out.println("the value of a + b is " + sum);
    }
    
}
