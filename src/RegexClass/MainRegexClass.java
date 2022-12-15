package RegexClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegexClass {
    public static void main(String[] args) {
        String name = "Rheza Daffa Pamungkas  AlumNI SMA muhammadiyah 1 Yogyakarta kerja remote di rumah";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");

        Matcher matcher = pattern.matcher(name);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
