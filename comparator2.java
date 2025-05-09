import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    String name;
    int age;
    String house;
    public Student(String name, int age, String house){
        this.name = name;
        this.age = age;
        this.house = house;
    }
    public String toString(){
        return "Student [age=" + age+" name=" + name + "house=" + house+ "]";
    }
}
public class comparator2 {
    
    public static void main(String[]args){
        List<Student> students = new ArrayList<>();
            students.add(new Student("Mohan ", 20 , " green"));
            students.add(new Student("Ram ", 21 , " red"));
            students.add(new Student("sri ", 26 , " pink"));
            students.add(new Student("Sai ", 22 , " yellow"));
        
            Comparator<Student> ageComparator = (s1, s2) ->s1.age - s2.age;

            Collections.sort(students, ageComparator);

            for (Student student : students){
                System.out.println(student);
            }

    }
    
}
