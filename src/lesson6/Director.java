package lesson6;

import java.util.Arrays;

public class Director extends Employee {

    Employee[] employees;

    public Director(String firstName, String lastName, int seniority) {
        super(firstName, lastName, seniority);
    }

    public void setSeniority(){
        this.pos = Position.DIRECTOR;
    }

    @Override
    public int salary() {
        if (employees == null) {
            return super.salary();
        } else {
            return employees.length * super.salary();
        }
    }

    public void addWorker(Employee employee){
        if (employees == null){
            employees = new Employee[1];
            employees[0] = employee;
        } else {
            employees = Arrays.copyOf(employees, employees.length + 1);
            employees[employees.length - 1] = employee;
        }
    }

    @Override
    public String toString() {
        return "Director{" +
                "full name = " + fullName() +
                ", salary = " + salary() +
                ", employees = " + Arrays.toString(employees) +
                ", pos = " + pos +
                '}';
    }
}
