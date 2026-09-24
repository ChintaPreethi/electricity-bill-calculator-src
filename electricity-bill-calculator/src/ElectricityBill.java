public class ElectricityBill {

    private int customerId;
    private String customerName;
    private double units;

    public ElectricityBill(int customerId, String customerName, double units) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.units = units;
    }

    public double calculateEnergyCharge() {

        double charge;

        if (units <= 100) {
            charge = units * 1.50;
        } 
        else if (units <= 200) {
            charge = (100 * 1.50)
                    + ((units - 100) * 2.50);
        } 
        else if (units <= 500) {
            charge = (100 * 1.50)
                    + (100 * 2.50)
                    + ((units - 200) * 4.00);
        } 
        else {
            charge = (100 * 1.50)
                    + (100 * 2.50)
                    + (300 * 4.00)
                    + ((units - 500) * 6.00);
        }

        return charge;
    }

    public double calculateFixedCharge() {
        return 100;
    }

    public double calculateTotalBill() {
        return calculateEnergyCharge() + calculateFixedCharge();
    }

    public void displayBill() {

        System.out.println("\n=================================");
        System.out.println("       ELECTRICITY BILL");
        System.out.println("=================================");

        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.printf("Units Used    : %.2f%n", units);

        System.out.println("---------------------------------");

        System.out.printf(
                "Energy Charge : ₹%.2f%n",
                calculateEnergyCharge()
        );

        System.out.printf(
                "Fixed Charge  : ₹%.2f%n",
                calculateFixedCharge()
        );

        System.out.println("---------------------------------");

        System.out.printf(
                "Total Bill    : ₹%.2f%n",
                calculateTotalBill()
        );

        System.out.println("=================================");
    }
}