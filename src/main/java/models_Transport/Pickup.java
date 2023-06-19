package models_Transport;

public class Pickup extends Transport {

    public Pickup(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println(getModel() + " готов к работе");
    }
}
