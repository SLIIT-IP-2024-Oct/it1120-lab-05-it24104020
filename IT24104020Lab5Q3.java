import java.util.Scanner;

public class IT24104020Lab5Q3 {
    public static void main(String[] args) {
      
        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

   
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

    
        int reservedDays = endDate - startDate;
        double totalCharge = reservedDays * ROOM_CHARGE;

      
        if (reservedDays >= 5) {
            totalCharge *= (1 - DISCOUNT_20);
        } else if (reservedDays >= 3) {
            totalCharge *= (1 - DISCOUNT_10);
        }

   
        System.out.println("Number of days reserved: " + reservedDays);
        System.out.printf("Total amount to be paid: Rs %.2f\n", totalCharge);
    }
}
