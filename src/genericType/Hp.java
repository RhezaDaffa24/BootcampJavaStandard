package genericType;

public class Hp {
    private String merk;
    private double price;
    private Integer tahunproduksi;

    public Hp(String merk, double price, Integer tahunproduksi) {
        this.merk = merk;
        this.price = price;
        this.tahunproduksi = tahunproduksi;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getTahunproduksi() {
        return tahunproduksi;
    }

    public void setTahunproduksi(Integer tahunproduksi) {
        this.tahunproduksi = tahunproduksi;
    }

    @Override
    public String toString() {
        return "Hp{" +
                "merk='" + merk + '\'' +
                ", price=" + price +
                ", tahunproduksi=" + tahunproduksi +
                '}';
    }
}
