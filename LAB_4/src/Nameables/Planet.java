package Nameables;

public class Planet implements Nameable{
    private boolean atmosphere;
    private boolean isHabitable;
    private String name;

    public Planet(boolean atmosphere, boolean isHabitable, String name) {
        this.atmosphere = atmosphere;
        this.isHabitable = isHabitable;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
