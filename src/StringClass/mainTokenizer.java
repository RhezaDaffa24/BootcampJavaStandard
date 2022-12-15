package StringClass;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class mainTokenizer {
    public static void main(String[] args) {
        String name = "Rheza Daffa Pamungkas dan Soekarno Hatta";
        StringTokenizer tokenizer = new StringTokenizer(name," ");

        List<String> names = new ArrayList<>();

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);

            //menambahkan ke list
            names.add(token);
        }
        System.out.println("Menampilkan array list");
        System.out.println(names);
    }
}
