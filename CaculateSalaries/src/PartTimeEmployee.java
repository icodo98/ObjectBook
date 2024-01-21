public class PartTimeEmployee extends Employee {

    private float workingHours;

    public PartTimeEmployee(String name, int baseSalary, float workingHours) {
        super(name, baseSalary);
        this.workingHours = workingHours;
    }

    @Override
    public int calculatePay() {
        return Math.round(baseSalary * workingHours);
    }

    public float getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(float workingHours) {
        this.workingHours = workingHours;
    }

}
