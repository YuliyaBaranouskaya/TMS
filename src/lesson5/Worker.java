package lesson5;

public class Worker extends Employee{

    public Worker(String firstName, String lastName, int seniority) {
        super(firstName, lastName, seniority);
    }

    public void setSeniority(){
        this.pos = Position.EMPLOYEE;
    }
}
