import java.util.*;
public class factorial {
    public static int printFactorial(int n){
        if(n<0){
            System.out.print("Invalid number, ");
            return n;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return factorial;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value for factorial ");
        int n = sc.nextInt();

        int factorial = printFactorial(n);
        System.out.println("The following value of given number is" + factorial);

    }   
    
}
