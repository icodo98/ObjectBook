import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private static EmployeeManager instance = new EmployeeManager();
    private List<Employee> employeeList;

    private EmployeeManager() {
        employeeList = new ArrayList<>();
    }

    public static EmployeeManager getInstance() {
        if (instance != null) {
            return instance;
        } else {
            instance = new EmployeeManager();
            return instance;
        }
    }

    public int getTotalBaseSalary() {
        int sum = 0;
        for (Employee employee : employeeList) {
            sum += employee.calculatePay();
        }
        return sum;
    }

    public Employee[] getEmployeeByName(String name) {
        List<Employee> rtnEmployees = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.name.equals(name)) {
                rtnEmployees.add(employee);
            }
        }
        return rtnEmployees.toArray(new Employee[0]);
    }

    public int calculatePay(Employee employee) {
        return employeeList.get(employeeList.indexOf(employee)).calculatePay();
    }

    public int calculatePay() {
        int sumOfBase = 0;
        for (Employee employee : employeeList) {
            sumOfBase += employee.calculatePay();
        }
        return sumOfBase;
    }

}
