package hw_enum.transport;

import hw_enum.driver.Driver;
import hw_enum.driver.DriverB;
import hw_enum.driver.DriverLicenseException;

public class Car extends Transport <DriverB>{
    @Override
    public void printType() {
        if (bodyType == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(bodyType);
        }
    }

    public enum BodyType {SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COMPARTMENT("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String body;

        @Override
        public String toString() {
            return "Тип кузова: " + body;
        }

        BodyType(String body) {
            this.body = body;
        }

        public String getBody() {
            return body;
        }
    }

    private BodyType bodyType;

    @Override
    public void passDiagnostics() {
        System.out.println("Диагностика");
    }

    @Override
    public String toString() {
        return "Модель " + getBrand() + " " + getModel() + ", Обьем двигателя - " + getEngineVolume();
    }

    @Override
    public void start(Driver driver) throws DriverLicenseException {
        super.start(driver);
    }

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}
