package genericType;

public class Car {
    private String namamerk;
    private String Type;
    private double price;

    private boolean asuransi;

    public Car(String namamerk, String type, double price, boolean asuransi) {
        this.namamerk = namamerk;
        Type = type;
        this.price = price;
        this.asuransi = asuransi;
    }

    public String getNamamerk() {
        return namamerk;
    }

    public void setNamamerk(String namamerk) {
        this.namamerk = namamerk;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAsuransi() {
        return asuransi;
    }

    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }

    @Override
    public String toString() {
        return "Car{" +
                "namamerk='" + namamerk + '\'' +
                ", Type='" + Type + '\'' +
                ", price=" + price +
                ", asuransi=" + asuransi +
                '}';
    }
}
