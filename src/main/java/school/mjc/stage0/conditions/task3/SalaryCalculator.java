package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            double taxRate = 0.15;
            double taxAmount = salary * taxRate;
            double netSalary = salary - taxAmount;
            System.out.println(netSalary);
        } else if (salary <= 20000) {
            double taxRate = 0.18;
            double taxAmount = salary * taxRate;
            double netSalary = salary - taxAmount;
            System.out.println(netSalary);
        } else {
            double taxRate = 0.20;
            double taxAmount = salary * taxRate;
            double netSalary = salary - taxAmount;
            System.out.println(netSalary);
        }
    }
}
