package lesson2;

import java.util.Locale;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //   checkLetter();
        //   checkSeason();
        //   checkWordExit();
        // sumAllNumbers();
        // findMinMax();
        sortArr();
    }

    //Пользователь вводит английскую букву. Вывести в консоль – гласная эта буква или согласная.
    // Выполнить это задание при помощи операторов if, а потом при помощи switch. Сравнить оба решения.
    public static void checkLetter() {
        System.out.println("Please, enter your letter: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toLowerCase(Locale.ROOT);
        if (input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u") || input.equals("y")) {
            System.out.println("This is vowel");
        } else {
            System.out.println("This is consonant");
        }

        switch (input) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "y":
                System.out.println("This is vowel");
                break;
            default:
                System.out.println("This is consonant");
        }
    }

    //Пользователь вводит название месяца. Вывести в консоль к какой поре года этот месяц относиться.
    // Если пользователь допустил опечатку – вывести сообщение об ошибке.

    public static void checkSeason() {
        System.out.println("Please, enter your month: / Пожалуйста, введите месяц");
        Scanner scanner = new Scanner(System.in);
        String inputMonth = scanner.next().toLowerCase(Locale.ROOT);
        switch (inputMonth) {
            case "december":
            case "january":
            case "february":
                System.out.println("Winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("Summer");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("Autumn");
                break;
            case "декабрь":
            case "январь":
            case "февраль":
                System.out.println("Зима");
                break;
            case "март":
            case "апрель":
            case "май":
                System.out.println("Весна");
                break;
            case "июнь":
            case "июль":
            case "август":
                System.out.println("Лето");
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                System.out.println("Осень");
                break;
            default:
                System.out.println("Please, check the correctness of the entered text/Пожалуйста, проверьте правильность введенного текста");
        }
    }

    //Пользователь вводит слово в консоль, если это слово “exit” – программа завершается,
    // при других  - печатает ввод пользователя обратно в консоль и предлагает ввести следующее слово.

    public static void checkWordExit() {
        System.out.println("Please, enter your word: ");
        Scanner scanner = new Scanner(System.in);
        String inputWord = scanner.next().toLowerCase(Locale.ROOT);
        while (!inputWord.equals("exit")) {
            System.out.println(inputWord);
            System.out.println("Please, enter your word: ");
            inputWord = scanner.next().toLowerCase(Locale.ROOT);
        }
    }

    //Пользователь вводит два числа. Найти сумму всех чисел расположенных между ними и которые делятся на 3.

    public static void sumAllNumbers() {
        int sumNumbers = 0;
        System.out.println("Please, enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int inputFirstNumber = Integer.parseInt(scanner.next());
        System.out.println("Please, enter second number: ");
        int inputSecondNumber = Integer.parseInt(scanner.next());
        if (inputSecondNumber <= inputFirstNumber) {
            System.out.println("Wrong number's order");
        } else {
            for (int i = inputFirstNumber; i < inputSecondNumber; i++) {
                if (i % 3 == 0) {
                    sumNumbers += i;
                }
            }
            System.out.println(sumNumbers);

        }
    }

    //В массиве чисел найти наименьшее и наибольшее.
    public static void findMinMax() {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 8;
        arr[3] = 9;
        arr[4] = 1;

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    //Дан массив из пяти элементов. При помощи цикла получить отсортированный массив в порядке возрастания элементов.

    public static void sortArr() {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 2;
        arr[3] = 34;
        arr[4] = 1;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
