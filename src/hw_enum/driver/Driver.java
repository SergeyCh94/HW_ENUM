package hw_enum.driver;

public class Driver {
    private final String fio;
    private boolean driverLicense;
    private int experience;

    @Override
    public String toString() {
        return fio;
    }

    public Driver (String fio) {
        if (fio == null || fio.isEmpty() || fio.isBlank()){
            this.fio = "default";
        } else {
            this.fio = fio;
        }
    }

    public String getFio() {
        return fio;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
