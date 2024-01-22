public class PartTimeEmployee extends Employee {

    private float workingHours;
    private int hourlySalary;

    public PartTimeEmployee(String name, int hourlySalary, float workingHours) {
        super(name);
        this.workingHours = workingHours;
    }

    @Override
    public int getMonthlySalary() {
        return Math.round(hourlySalary * workingHours);
    }

    public float getWorkingHours() {
        return workingHours;
    }

    @Override
    public int getBaseSalary() {
        /// 알바생의 경우 baseSalary가 없음.
        return 0;
    }

}
