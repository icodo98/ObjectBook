import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private static EmployeeManager instance = new EmployeeManager();
    private List<Employee> employeeList;

    private EmployeeManager() {
        /// 테스트를 위하여 기본적인 정보를 담은 객체 생성.
        employeeList = new ArrayList<>() {
            {
                add(new FullTimeEmployee("이주영", 1000000));
                add(new FullTimeEmployee("김싸피", 5000000));
                add(new PartTimeEmployee("이싸피", 15000, 3));
            }
        };
    }

    public static EmployeeManager getInstance() {
        return instance;
    }

    public int getTotalBaseSalary() {
        int sum = 0;
        for (Employee employee : employeeList) {
            sum += employee.getMonthlySalary();
        }
        return sum;
    }

    public Employee getEmployeeByName(String name) {

        for (Employee employee : employeeList) {
            if (employee.name.equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public int calculatePay(Employee employee) {
        return employeeList.get(employeeList.indexOf(employee)).getMonthlySalary();
    }

}
