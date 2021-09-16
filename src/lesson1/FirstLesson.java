package lesson1;

import java.util.Random;

public class FirstLesson {


    public static void main(String[] args) {
        // Создайте переменные для каждого примитивного типа, подумайте об ограничениях по наименованию переменных.
        boolean valueBool = true;
        char valueChar = 'y';
        byte valueByte = 1;
        short valueShort = 2;
        int valueInt = 234;
        long valueLong = 1234;
        float valueFloat = 23.23f;
        double valueDouble = 3434;

        // Создайте две переменные типа int и попробуйте поделить одно на другое, результат какого типа получится в результате?
        // Что будет если делитель будет нулевым? Как не потерять точность при делении (числа после запятой)?
        int dividend = 67;
        int divisor = 3;

        int result = dividend/divisor;

        System.out.println("int = " + result);

        //Напишите программу, которая сравнивает два числа и пишет в консоль какое из этих чисел больше или меньше
        int number1 = (int) (Math.random()*100);
        int number2 = (int) (Math.random()*10);

        System.out.println(number1);
        System.out.println(number2);

        if (number1 > number2){
            System.out.println("First number more then second number");
        } else {
            if (number1 < number2){
                System.out.println("Second number more than first number");
            }else {
                System.out.println("They are equal");
            }
        }

        //Напишите программу, которая проверяет делится ли одно число на второе без остатка.
        // В случает если деление не целочисленное, то вывести в консоль сообщение о целой части и об остатке от деления.

        int delResult = number1%number2;

        if (delResult != 0) {
            System.out.println("Entire part " + number1/number2 + " Fractional part " + delResult);

        }

        //Задать число (от 0 до 9999) и вывести в консоль количество тысяч, сотен, десятков и единиц.

        double value = Math.random() * 9999;
        int valIntRandom = (int)value;
        System.out.println(valIntRandom);

     /*   while (valIntRandom>0) {
           int resultW = valIntRandom % 10;
            System.out.println(resultW);
            valIntRandom /= 10;
        }*/

        int valueUnits = valIntRandom % 10;
        System.out.println("Units " + valueUnits);

        int valueDozens = (valIntRandom / 10) % 10;
        System.out.println("Dozens " + valueDozens);

        int valueHundreds = (valIntRandom / 100) % 10;
        System.out.println("Hundreds " + valueHundreds);

        int valueThousands = (valIntRandom / 1000) % 10;
        System.out.println("Thousands " + valueThousands);



        //Создайте переменную типа char и присвойте ей значение ‘a’.
        // Прибавить к переменной 1 и выведите значение переменной в консоль.
        // Попробуйте преобразовать тип переменной к int и снова вывести в консоль.

        char valChar = 'a';
        System.out.println("Type Char + 1 = " + (valChar + 1));
        int valInt = (int)valChar;
        System.out.println("Converted Char + 1 = " + valInt);

        //Создайте переменную типа int и присвойте ей значение 127, преобразуйте ее к типу byte и выведите в консоль.
        // Что произойдет если значение переменной будет 128?

        int a = 128;
        byte b =(byte)a;
        System.out.println("Converted int to byte = " + b);


        //Создайте переменную типа int (int i = 10) и выведите в консоль значение I / 0.
        // Что произойдет? Измениться ли вывод если переменная будет типа float?

        int i = 10;
       // System.out.println(i/0);


    }

}
