import java.io.PrintStream;
import java.math.BigDecimal;

public class EmployeeStart {
    public static void main(String[] args) {
        Employees employee = new Employees("John", BigDecimal.valueOf(2000L), 45, 1985);
        System.out.println("Adı: " + employee.name);
        System.out.println("Maaşı: " + employee.salary);
        System.out.println("Çalışma saati: " + employee.workHours);
        System.out.println("Başlangıç yılı: " + employee.hireYear);
        System.out.println("Vergi: " + employee.tax(employee.salary));
        System.out.println("Bonus: " + employee.bonus(employee.workHours));
        PrintStream var10000 = System.out;
        BigDecimal var10001 = employee.salary.add(employee.bonus(employee.workHours).subtract(employee.tax(employee.salary)));
        var10000.println("Vergi ve Bonuslar ile birlikte maaş: " + var10001);
        var10001 = employee.salary;
        System.out.println("Toplam maaş: " + var10001.add(employee.raiseSalary(employee.salary, employee.hireYear)));
    }
}
