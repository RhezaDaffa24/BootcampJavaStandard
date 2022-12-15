package StringClass;

public class MainStringBuffer {
    public static void main(String[] args) {
        String firstname = "Rheza Daffa";
        System.out.println("First Name "+ firstname);
        String lastname = "Pamungkas";
        System.out.println("Last Name "+lastname);

        StringBuffer buffer = new StringBuffer(firstname)
                .append(" ").append(lastname);
        System.out.println("Buffer "+ buffer);
    }
}
