package genericType;

public class MainData {
    public static void main(String[] args) {
        Data data = new Data();
        data.setData("Umi Fikri");

        System.out.println("Data Value: "+data.getData());

        Data data1 = new Data();
        data1.setData(1231435);
        System.out.println("Data Value: "+data1.getData());

        Data data2 = new Data();
        data1.setData(12314.3534);
        System.out.println("Data Value: "+data2.getData());
    }
}
