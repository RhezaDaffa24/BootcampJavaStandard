package Base64Class;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class MainBase64 {
    public static void main(String[] args) {
        String query = "belajar()    pemtograman{}        java  asvfbwtebwebtgg ";

        String encode = Base64.getEncoder().encodeToString(query.getBytes(StandardCharsets.UTF_8));
        System.out.println("Pertama :"+encode);

        String decode = new String(Base64.getDecoder().decode(encode));
        System.out.println("Kedua :"+decode);
    }
}
