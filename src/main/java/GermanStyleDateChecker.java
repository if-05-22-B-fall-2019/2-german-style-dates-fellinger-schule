import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        String patternString = "^(3[01]|[12][0-9]|[1-9])(\\.|-| )(1[0-2]|0?[1-9])(\\.|-| )(19|20)?\\d{2}$";

        Pattern pattern = Pattern.compile(patternString);

        return pattern.matcher(dateString);
    }
}
