public abstract class Employee {
    public String name;

    protected int baseSalary;

    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract public int calculatePay();
}
