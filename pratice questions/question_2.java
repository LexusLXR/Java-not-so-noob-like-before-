import java.util.*;
public class question_2 {
    public static int oddNumber(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2 !=0){
                sum +=i;
            }
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("give any number to n" );
        int n = sc.nextInt();

        int totalsum = oddNumber(n);
        System.out.println("the total value of odd number is"+ totalsum);
        
    }

    
}
