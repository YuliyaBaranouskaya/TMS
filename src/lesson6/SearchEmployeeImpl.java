package lesson6;

public class SearchEmployeeImpl implements SearchEmployee{
    @Override
    public void findEmployee(Director d1, String name) {
        for (int i=0; i<d1.employees.length;i++){
            if (d1.employees[i].fullName().equals(name)){
                System.out.println("the employee is subordinate to the director");
                return;
            }
        }
    }


    public void dismissEmployee (Director w1, String name){
        int j = 0;
        for (int i=0; i<w1.employees.length;i++){
            if (w1.employees[i].fullName().equals(name)){
                j = i;
                break;
            }
        }
        for (int i = j; i < w1.employees.length-1; i++){
            w1.employees[i] = w1.employees[i+1];
        }
        w1.employees[w1.employees.length-1] = null;
    }

}
