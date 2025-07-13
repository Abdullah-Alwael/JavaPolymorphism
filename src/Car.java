public class Car implements Vehicle {
    private final int dailyRate = 50;//$ dollar
    private String model;
    private int days;

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }


    @Override
    public double calculateRentalCost() {
        return 0; //TODO
    }

    @Override
    public void displayDetails() {
        //TODO
    }
}
