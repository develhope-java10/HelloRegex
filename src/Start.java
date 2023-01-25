import javax.swing.text.html.HTMLDocument;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Start {
    public static void main(String[] args){
        /*String names = "Giulia 1 \n Giada 2 \n Lucrezia 3 \n Tommaso 4 \n Federico 5";
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(names);
        while(matcher.find()){
            String print = names.substring(matcher.start(), matcher.end());
            System.out.println(print);
        }*/

        ICollege[] colleges = new ICollege[]{
                new MiddleCollege(),
                new HighCollege()
        };

        Student[] students = new Student[]{
                new Student("Gianmarco", 8),
                new Student("Gianfrancesco", 7),
                new Student("Gianlucia", 9)
        };

        checkStudentProspects(students, colleges);
    }

    static void checkStudentProspects(Student[] students, ICollege[] colleges) {
        for(ICollege college : colleges) {
            System.out.println(college);
            for(Student student : students) {
                System.out.println(student.getName() + " can access? " + college.canAccess(student));
                System.out.println(student.getName() + " can be added in queue? " + college.canBeAddedInQueue(student));
            }
        }
    }
}
