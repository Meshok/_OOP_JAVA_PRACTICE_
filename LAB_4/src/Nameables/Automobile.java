package Nameables;

public class Automobile implements Nameable{
    private int price;
    private String type;
    private String model;

    public Automobile(int price, String type, String model) {
        this.price = price;
        this.type = type;
        this.model = model;
    }

    @Override
    public String getName() {
        return model;
    }
}
