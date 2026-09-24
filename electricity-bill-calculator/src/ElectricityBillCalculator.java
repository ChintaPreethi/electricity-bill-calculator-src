import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("     ELECTRICITY BILL CALCULATOR");
        System.out.println("=================================");

        System.out.print("Enter customer ID: ");
        int customerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        double units;

        while (true) {

            System.out.print("Enter electricity units consumed: ");
            units = sc.nextDouble();

            if (units >= 0) {
                break;
            }

            System.out.println(
                    "Units cannot be negative. Please try again."
            );
        }

        ElectricityBill bill =
                new ElectricityBill(
                        customerId,
                        customerName,
                        units
                );

        bill.displayBill();

        sc.close();
    }
}