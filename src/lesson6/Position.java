package lesson6;

public enum Position {
    EMPLOYEE(1),
    DIRECTOR(4);

    private int coefficient;

    Position(int coefficient){
        this.coefficient = coefficient;
    }

    public int getCoefficient() {
        return coefficient;
    }
}
