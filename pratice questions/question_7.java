import java.util.Scanner;
public class question_7 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int positive_counter=0, negative_counter=0, zero_counter=0;
        String choice;

        System.out.print("Do you want to enter a new number? (yes/no):");
        choice = sc.next();

        while(choice.equalsIgnoreCase("yes")){
            System.out.print("enter the number: ");
            int num = sc.nextInt();

            if(num > 0 ){
                positive_counter++;
            } else if(num< 0){
                negative_counter++;
            } else{
                zero_counter++;
            }
            System.out.print("do you want to enter more number? (yes/no): ");
            choice = sc.next();
        }

        System.out.println("results:");
        System.out.println("Positive numbers: " + positive_counter);
        System.out.println("Negative numbers:" + negative_counter);
        System.out.println("zero numbers:" + zero_counter);
    }
}
