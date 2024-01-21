public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int baseSalary) {
        super(name, baseSalary);

    }

    @Override
    public int calculatePay() {
        return baseSalary;
    }

}
