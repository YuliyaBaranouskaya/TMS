package lesson5;

public abstract class Employee extends Person{
    protected Position pos;
    private int seniority;
    private int rate = 23;

    public Employee (String firstName, String lastName, int seniority){
        super(firstName, lastName);
        this.seniority = seniority;
        setSeniority();
    }

    public int salary(){
        return (seniority * pos.getCoefficient() * rate);
    }

    public abstract void setSeniority();

    @Override
    public String toString() {
        return "Employee{" +
                "pos=" + pos +
                ", seniority=" + seniority +
                ", rate=" + rate +
                '}';
    }
}
