public class Truck implements Vehicle {
    private final int weeklyRate = 500; //$
    private String type;
    private int weeks;

    public Truck(String type, int weeks) {
        this.type = type;
        this.weeks = weeks;
    }

    public int getWeeklyRate() {
        return weeklyRate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }


    @Override
    public double calculateRentalCost() {
        return weeklyRate*weeks;
    }

    @Override
    public void displayDetails() {
        System.out.println("The truck type: "+type+", rented for "+weeks+" weeks, with a weekly rate of "+weeklyRate
                +", and a total price of "+calculateRentalCost());
    }
}
