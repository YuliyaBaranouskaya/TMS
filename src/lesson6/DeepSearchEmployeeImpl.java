package lesson6;

public class DeepSearchEmployeeImpl implements SearchEmployee {

    @Override
    public void findEmployee(Director d1, String name) {
        for (int i=0; i<d1.employees.length;i++){
            if (d1.employees[i].fullName().equals(name)){
                System.out.println("the employee is subordinate to the director");
                return;
            } else if (d1.employees[i] instanceof Director){
                findEmployee((Director) d1.employees[i], name);
            }
        }
    }

    @Override
    public void dismissEmployee(Director w1, String name) {

    }


}
