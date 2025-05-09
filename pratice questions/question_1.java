import java.util.*;
public class question_1{
    public static int calculateAverage(int a, int b, int c){
        int calculateAverage = (a+b+c)/3;
        return calculateAverage;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("what is the value of a");
        int a = sc.nextInt();
        System.out.print("what is the value of b");
        int b = sc.nextInt();
        System.out.print("what is the value of c");
        int c = sc.nextInt();

        int calculateAverage = calculateAverage(a, b, c);
        System.out.println("the average of a,b,c is"+ calculateAverage);

    }
}