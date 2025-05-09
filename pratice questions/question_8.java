import java.util.Scanner;
public class question_8 {
    public static double power(int base, int exponent){
        double result = Math.pow(base , exponent);
        System.out.print("The power of given value is ");
        return result;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of base ");
        int base = sc.nextInt();
        System.out.print("Enter the value of exponent ");
        int exponent = sc.nextInt();
        System.out.print(power(base, exponent));
    }
}
