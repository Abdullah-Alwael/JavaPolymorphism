public class Bike implements Vehicle {
    private final int hourlyRate = 10; // $
    private String brand;
    private int hours;

    public Bike(String brand, int hours) {
        this.brand = brand;
        this.hours = hours;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double calculateRentalCost() {
        return hourlyRate*hours;
    }

    @Override
    public void displayDetails() {
        System.out.println("The bike brand: "+brand+", rented for "+hours+" hours, with an hourly rate of "+hourlyRate
                +", and a total price of "+calculateRentalCost());
    }
}
