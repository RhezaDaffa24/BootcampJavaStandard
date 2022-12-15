package PropertiesClass;

import java.io.*;
import java.util.*;

public class MainProperties {
    public static void main(String[] args) {
        try  {
            Properties properties = new Properties();
//            FileReader reader = new FileReader("application.properties");
            properties.load(new FileInputStream("src/application.properties"));

            System.out.println(properties.getProperty("name.first"));
            System.out.println(properties.getProperty("name.Last"));
            System.out.println(properties.getProperty("address.country"));
            System.out.println(properties.getProperty("address.city"));
            System.out.println(properties.getProperty("age.now"));
            System.out.println(properties.getProperty("date.Birth"));

//            properties.load(input);

            properties.put("hobby", "Futsal");
            properties.store(new FileOutputStream("src/application.properties"),"Testing");

//            properties.load(reader);
//            System.out.println(properties);

        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
    //Ps : File application.properties harus ditaruh didalam source atau diluar package
    // lalu memnaggil dengan path src/"filename"
}
