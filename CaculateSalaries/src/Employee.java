public abstract class Employee {
    public String name;

    public Employee(String name) {
        this.name = name;

    }

    abstract public int getMonthlySalary();

    abstract public int getBaseSalary();
}
