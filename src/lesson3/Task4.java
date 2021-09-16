package lesson3;

public class Task4 {
    public void findDuplicate() {
        int[] arr = {1, 6, 7, 9, 4, 2, 7, 6};
        int index = 0;
        int times = 0;
        for (int i = 0; i < arr.length; i++) {
            int times2=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    times2++;
                }
            }
            if (times2 > times){
                times = times2;
                index = i;
            }
        }
        System.out.println(arr[index] + " : " + times);
    }
}
