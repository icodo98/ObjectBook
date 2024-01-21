public class Company {

    EmployeeManager employeeManager;

    public Company() {
        employeeManager = EmployeeManager.getInstance();
    }

    public int getBasePay(String name) throws Exception {
        Employee[] employee = employeeManager.getEmployeeByName(name);

        if (employee.length == 0) {
            throw new Exception();

        } else {
            for (Employee employee2 : employee) {
                return employee2.calculatePay();
            }
        }
        return 0;
    }

    public double calculatePay(String name, double taxRate) throws Exception {
        int baseSalary = getBasePay(name);
        return baseSalary * (1 - taxRate);
    }

    public int totalBaseSalary() {

        return employeeManager.getTotalBaseSalary();
    }
}
