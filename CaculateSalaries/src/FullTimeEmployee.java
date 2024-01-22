public class FullTimeEmployee extends Employee {
    private int baseSalary;

    public FullTimeEmployee(String name, int baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public int getMonthlySalary() {
        return baseSalary;
    }

    @Override
    public int getBaseSalary() {
        // 직원들 기본급
        return baseSalary;
    }

}
