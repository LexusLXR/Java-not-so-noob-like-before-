import java.util.*;
public class question_4 {
    public static float perimeter_circle(float r){
        float perimeter_circle = (float)(2 *Math.PI* r);
        return perimeter_circle;

    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of radius r ");
        float r = sc.nextFloat();
        System.out.println("the perieter of the circle is "+ perimeter_circle(r));
        sc.close();
    }
}
