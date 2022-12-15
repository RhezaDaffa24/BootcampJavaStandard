package NumberClass;

public class ConvertMain {
    public static void main(String[] args) {
        String angkaStr = "12343545";
        Integer angka = Integer.parseInt(angkaStr);
        System.out.println(angka);

        angkaStr = "abc";
        try {
            angka = Integer.parseInt(angkaStr);
        }catch (Exception e){
            System.out.println("terjadi error saat convert,error: "+ e.getMessage());
            angka=0;
        }
        System.out.println(angka);
    }
}
