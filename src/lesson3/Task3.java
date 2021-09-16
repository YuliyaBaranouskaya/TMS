package lesson3;

public class Task3 {

    public void differenceBetweenEvenAndOdd() {
        int [] arr = {1,2,3,4,5,6};
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i%2 ==0){
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
