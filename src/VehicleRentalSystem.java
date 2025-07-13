import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> rentedVehicles = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our Vehicle Rental Service");

        do {
            System.out.println("select an option from the following list: ");
            System.out.println("1) Rent a Car");
            System.out.println("2) Rent a Bike");
            System.out.println("3) Rent a Truck");
            System.out.println("4) View Rented Vehicles");
            System.out.println("5) Exit");

            try {
                switch (new Scanner(System.in).nextInt()) {
                    case 1: // rent a car
                        System.out.println("Enter the car model you want to rent:");
                        String model = input.nextLine();

                        System.out.println("Enter the number of days you want to rent the car:");
                        int rentalDays = input.nextInt();

                        rentedVehicles.add(new Car(model, rentalDays));

                        rentedVehicles.getLast().displayDetails();
                        System.out.println("Total cost: "+rentedVehicles.getLast().calculateRentalCost());
                        break;
                    case 2: // rent a bike
                        System.out.println("Enter the brand of the bike to rent:");
                        String brand = input.nextLine();

                        System.out.println("Enter the number of hours you want to rent the bike:");
                        int rentalHours = input.nextInt();

                        rentedVehicles.add(new Bike(brand, rentalHours));

                        rentedVehicles.getLast().displayDetails();
                        System.out.println("Total cost: "+rentedVehicles.getLast().calculateRentalCost());
                        break;
                    case 3: // rent a truck
                        System.out.println("Enter the truck-type of the truck to rent:");
                        String truckType = input.nextLine();

                        System.out.println("Enter the number of weeks you want to rent the truck:");
                        int rentalWeeks = input.nextInt();

                        rentedVehicles.add(new Truck(truckType, rentalWeeks));

                        rentedVehicles.getLast().displayDetails();
                        System.out.println("Total cost: "+rentedVehicles.getLast().calculateRentalCost());
                        break;
                    case 4: // view the list
                        for (Vehicle v : rentedVehicles) {
                            v.displayDetails();
                        }
                        break;
                    case 5: // exit
                        System.out.println("Thank you for using the Vehicle Rental Service!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("This is not an option!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid input");
            } catch (Exception e) {
                System.out.println("An error occurred");
            } finally {
                input.nextLine(); // flush the input
            }

        } while (true);

    }
}
