package StringClass;

public class MainString {
    public static void main(String[] args) {
        String name = "Rheza Daffa";
        System.out.println("To lower case :"+name.toLowerCase());
        System.out.println("To Upper case :"+name.toUpperCase());
        System.out.println("Panjang huruf: "+name.length());
        System.out.println("Start With : "+ name.startsWith("Rh"));
        System.out.println("End with :"+ name.endsWith("za"));

        String[] names = name.split("");
        System.out.println("Jumlah kata "+names.length);
        System.out.println("Index ke 0 "+names[0]);
        System.out.println("Index ke 1 "+names[1]);
    }

    public static void sampleStringBuilder(){

    }
    public static void Sample1(){

    }
}
