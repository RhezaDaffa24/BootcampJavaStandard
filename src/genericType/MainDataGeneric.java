package genericType;

public class MainDataGeneric {
    public static void main(String[] args) {
        DataGeneric<String> data1 = new DataGeneric<String>();
        data1.setData("Rheza daffa");
        System.out.println("data1 value : "+ data1.getData());

        DataGeneric<Integer> data2 = new DataGeneric<Integer>();
        data2.setData(351246);
        System.out.println("data2 value : "+ data2.getData());

        DataGeneric<Boolean> data3 = new DataGeneric<Boolean>();
        data3.setData(true);
        System.out.println("data3 value : "+ data3.getData());

        DataGeneric<Product> data4 = new DataGeneric<Product>();
//        data4.setData(new Product("Baju",25000.00));
        Product product = new Product("Baju Kaos",23.0000);
        data4.setData(product);
        System.out.println("data4 value : "+ data4.getData());

        DataGeneric<Hp> data5 = new DataGeneric<Hp>();
        data5.setData(new Hp("Samsung",2483459,2017));
        System.out.println("data5 value : "+ data5.getData());

        DataGeneric<Animal> data6 = new DataGeneric<Animal>();
        data6.setData(new Animal("Macan",4,"Darat",true));
        System.out.println("data6 value : "+ data6.getData());

        DataGeneric<Car> data7 = new DataGeneric<Car>();
        data7.setData(new Car("Toyota","SUV",23243034.34,true));
        System.out.println("data1 value : "+ data5.getData());

        DataGeneric<Person> data8 = new DataGeneric<Person>();
        data8.setData(new Person("Rheza","yogya","Laki",22));
        System.out.println("data1 value : "+ data8.getData());

    }
}
