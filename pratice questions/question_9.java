import java.util.Scanner;

public class question_9 {
    public static int GCD(int a , int b ){
       while(b!=0){
        int temp = b;
        b = a % b;
        a = temp;
       }
       return a;
    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of num_1 ");
        int num1 = sc.nextInt();
        System.out.print("enter the value of num_2 ");
        int num2 = sc.nextInt();
        System.out.println("GCD of num_1 " + num1 + "and num_2 " + num2 + "is " + GCD(num1, num2));
    }
}
