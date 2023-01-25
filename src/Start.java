import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Start {
    public static void main(String[] args){
        String names = "Giulia 1 \n Giada 2 \n Lucrezia 3 \n Tommaso 4 \n Federico 5";
        parseNames(names);

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

    public static String[] parseNames (String names) {
        ArrayList<String> nameList = new ArrayList<>();
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(names);
        while (matcher.find()) {
            String name = names.substring(matcher.start(), matcher.end());
            nameList.add(name);
        }
        return nameList.toArray(new String[0]);
    }
    }
