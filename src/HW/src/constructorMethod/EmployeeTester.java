package HW.src.constructorMethod;

public class EmployeeTester {
    public static void main(String[] args) {
        FullTime maria = new FullTime("Maria", "Ferrari", 34569, 40, "New App");
        PartTime clara = new PartTime("Clara", "Ford", 2923, 35, " home.");

        System.out.println(maria.printBadge(true));
        maria.info();

        System.out.println(clara.printBadge(false));
        clara.info();
    }
}
