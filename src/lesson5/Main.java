package lesson5;

public class Main {
    public static void main(String[] args) {
        Employee w1 = new Worker("w1","w1",7);
        Employee w2 = new Worker("w2","w2",9);
        Employee w3 = new Worker("w3","w3",1);

        Employee d1 = new Director("d1", "d1", 3);
        Employee d2 = new Director("d2", "d2", 2);


        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);

        ((Director)d1).addWorker(w1);
        ((Director)d1).addWorker(w2);
        ((Director)d1).addWorker(w3);

        ((Director)d2).addWorker(d1);

        System.out.println(d1);
        System.out.println(d2);


    }
}
