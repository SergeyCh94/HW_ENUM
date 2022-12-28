package hw_enum.transport;

public abstract class Transport <T> implements Competing{
    private final String brand;
    private final String model;
    private final double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty() || brand.isBlank()){
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()){
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void start(T driver){

        System.out.println("Водитель " + driver + " управляет автомобилем " +  getBrand() + " " + getModel() +
                " и будет участвовать в заезде");
    }

    public abstract void printType();

    public void stop(){

    }

    @Override
    public void pitStop() {
        System.out.println("Авто " + getBrand() + " " + getModel() + " на пит стопе");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга " + getBrand() + " " + getModel());
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel());
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

}
