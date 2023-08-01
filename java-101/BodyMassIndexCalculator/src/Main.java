
import java.math.BigDecimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Employee employee = new Employee("John", BigDecimal.valueOf(2000), 45, 1985);
        System.out.println("Adı: " + employee.name);
        System.out.println("Maaşı: " + employee.salary);
        System.out.println("Çalışma saati: " + employee.workHours);
        System.out.println("Başlangıç yılı: " + employee.hireYear);
        System.out.println("Vergi: " + employee.tax(employee.salary));
        System.out.println("Bonus: " + employee.bonus(employee.workHours));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + employee.salary
                .add(employee.bonus(employee.workHours).subtract(employee.tax(employee.salary))));
        System.out.println("Toplam maaş: " + employee.salary.add(employee.raiseSalary(employee.salary, employee.hireYear)));





    }
}