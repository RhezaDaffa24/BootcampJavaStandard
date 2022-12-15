package genericType;

public class Animal {
    private String name;
    private Integer leg;
    private String hidup;
    private boolean mamalia;

    public Animal(String name, Integer leg, String hidup, boolean mamalia) {
        this.name = name;
        this.leg = leg;
        this.hidup = hidup;
        this.mamalia = mamalia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLeg() {
        return leg;
    }

    public void setLeg(Integer leg) {
        this.leg = leg;
    }

    public String getHidup() {
        return hidup;
    }

    public void setHidup(String hidup) {
        this.hidup = hidup;
    }

    public boolean isMamalia() {
        return mamalia;
    }

    public void setMamalia(boolean mamalia) {
        this.mamalia = mamalia;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", leg=" + leg +
                ", hidup='" + hidup + '\'' +
                ", mamalia=" + mamalia +
                '}';
    }
}
