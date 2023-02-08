package class20HW;

public class EmployeeTester {
    public static void main(String[] args) {
        FullTime maria = new FullTime("Maria", "Ferrari", 34569, 40, "New App");
        PartTime clara = new PartTime("Maria", "Ferrari", 34569, 40, " home.");

        maria.printBadge(true);
        maria.info();

        clara.printBadge(false);
        clara.info();
    }
}
