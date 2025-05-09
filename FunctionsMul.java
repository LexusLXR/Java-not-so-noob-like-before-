import java.util.*;
public class FunctionsMul {
public static int CalculateMul(int a, int b){
    int mul = a * b;
    return mul;

    }   
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a=");
        int a = sc.nextInt();
        System.out.print("Enter the value of b=");
        int b = sc.nextInt();
        
        int mul = CalculateMul(a, b);
        System.out.println("The multiplied value of a and b is " + mul);
    }
}
