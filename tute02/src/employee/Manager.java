package employee;

import java.time.LocalDate;

public class Manager extends Employee {

    private LocalDate hireDate;

    public Manager(String name, int salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }
}
