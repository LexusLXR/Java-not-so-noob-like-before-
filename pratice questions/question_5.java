import java.util.*;
public class question_5 {
    public static int ageVerification(int age){
        if (age <= 18){
            System.out.print("age is not eligible");
            return age; 
        }else{
            System.out.print("age is eligible");
            return age;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age ");
        int age = sc.nextInt();
        System.out.println(", your age is " + ageVerification(age));
    }
    
}
