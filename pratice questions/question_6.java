import java.util.*;
public class question_6 {
    public static int loops(int i){
        do{
            System.out.println("*");
            i++;
        }while(i>=-10);
        return i;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of i ");
        int i = sc.nextInt();
        System.out.println("here is your loop" + loops(i));
    }
}
