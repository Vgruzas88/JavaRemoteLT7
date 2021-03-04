package lt.sda.javaFundamentalsCoding.namuDarbai_02_20.uzduotis_01;

public class Country implements Ieskoklis {

    private int amount;
    private String name;

    public Country(int amount, String name) {
        this.amount = amount;
        this.name = name;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int findRichest() {
        return amount;
    }
}
