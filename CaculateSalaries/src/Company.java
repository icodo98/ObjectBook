
public class Company {

    private EmployeeManager employeeManager;

    public Company() {
        employeeManager = EmployeeManager.getInstance();
    }

    private int getMonthlyBasePay(String name) throws IllegalArgumentException {
        Employee employee = employeeManager.getEmployeeByName(name);

        if (employee == null) {
            throw new IllegalArgumentException("없는 이름입니다.");

        }
        return employee.getMonthlySalary();
    }

    public double calculatePay(String name, double taxRate) throws IllegalArgumentException {
        int baseSalary = getMonthlyBasePay(name);
        return baseSalary * (1 - taxRate);
    }

    public int totalBaseSalary() {
        return employeeManager.getTotalBaseSalary();
    }
}
