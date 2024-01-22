import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Company company = new Company();
        Scanner sc = new Scanner(System.in);

        System.out.println("모드를 선택하세요.");
        System.out.println("1. 이름에 따른 월급 계산");
        System.out.println("2. 정직원의 총 기본금 계산");

        int mode = Integer.parseInt(sc.nextLine());

        switch (mode) {
            case 1:
                System.out.println("이름을 입력하세요.");
                String name = sc.nextLine();
                System.out.println("세율을 입력하세요. (10% 라면 0.1이라고 입력하세요)");
                double taxRate = Double.parseDouble(sc.nextLine());
                System.out.printf("%s님의 월급은 %d원 입니다.", name, (int) company.calculatePay(name, taxRate));

                break;
            case 2:
                System.out.printf("정직원의 총 기본급은 %d 원 입니다.", company.totalBaseSalary());
                break;
            default:
                System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
                break;
        }
        sc.close();

    }
}
