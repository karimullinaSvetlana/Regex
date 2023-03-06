import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("((([01])(\\d))|(2[0-3])):([0-5][0-9])");
        Matcher matcher = pattern.matcher("Завтрак в 09:00");
        while (matcher.find()) {
            System.out.println("Время: "+ matcher.group());
        }
    }
}