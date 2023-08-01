
import java.math.BigDecimal;

public class Employee {
     String name;
     BigDecimal salary;
     int workHours;
     int hireYear;

    public Employee(String name, BigDecimal salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public BigDecimal tax(BigDecimal salary) {
        if (salary.compareTo(BigDecimal.valueOf(1000)) >= 0) {
            salary = salary.multiply(BigDecimal.valueOf(0.03));
        }
        return salary;
    }

    public BigDecimal bonus(int workHours) {
        BigDecimal bonusSalary = BigDecimal.ZERO;
        if (workHours > 40) {
            int remainedHours = workHours - 40;
            bonusSalary = BigDecimal.valueOf(remainedHours).multiply(BigDecimal.valueOf(30));
        }
        return bonusSalary;
    }

    public BigDecimal raiseSalary(BigDecimal salary, int hireYear) {
        int thisYear = 2021;
        BigDecimal raiseRate = BigDecimal.ZERO;
        int remainedYear = thisYear - hireYear;
        if (remainedYear < 10) {
            raiseRate = salary.multiply(BigDecimal.valueOf(0.05));
        } else if (remainedYear > 9 && remainedYear < 20) {
            raiseRate = salary.multiply(BigDecimal.valueOf(0.1));
        } else {
            raiseRate = salary.multiply(BigDecimal.valueOf(0.15));
        }
        return raiseRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}
