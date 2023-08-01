//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.math.BigDecimal;

public class Employees {
    String name;
    BigDecimal salary;
    int workHours;
    int hireYear;

    public Employees(String name, BigDecimal salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public BigDecimal tax(BigDecimal salary) {
        if (salary.compareTo(BigDecimal.valueOf(1000L)) >= 0) {
            salary = salary.multiply(BigDecimal.valueOf(0.03));
        }

        return salary;
    }

    public BigDecimal bonus(int workHours) {
        BigDecimal bonusSalary = BigDecimal.ZERO;
        if (workHours > 40) {
            int remainedHours = workHours - 40;
            bonusSalary = BigDecimal.valueOf((long)remainedHours).multiply(BigDecimal.valueOf(30L));
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

    public String toString() {
        return "Employee{name='" + this.name + "', salary=" + this.salary + ", workHours=" + this.workHours + ", hireYear=" + this.hireYear + "}";
    }
}
