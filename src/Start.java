import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Start {
    public static void main(String[] args){
        String names = "Giulia 1 \n Giada 2 \n Lucrezia 3 \n Tommaso 4 \n Federico 5";
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(names);
        while(matcher.find()){
            String print = names.substring(matcher.start(), matcher.end());
            System.out.println(print);
        }
    }
}
