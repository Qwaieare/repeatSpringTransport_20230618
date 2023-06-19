package models_Transport;


public class Bus extends Transport {

    public Bus(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println(getModel() + " готов к работе");
    }
}
