package StringClass;

public class MainStringBuilder {
    public static void main(String[] args) {
        String firstname = "Rheza Daffa";
        System.out.println("First Name "+ firstname);
        String lastname = "Pamungkas";
        System.out.println("Last Name "+lastname);

        String namaLengkap = firstname+" "+lastname;
        System.out.println("Nama Lengkap "+ namaLengkap);

        StringBuilder builder = new StringBuilder(firstname)
                .append(" ").append(lastname);
        System.out.println("Builder "+ builder);



    }
}
