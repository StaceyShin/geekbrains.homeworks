package ru.geekbrains.lesson_1;

import java.util.Scanner;

public class firstHomework {
    public static void main(String[] args) {
        //Вызов метода для 2 задания
        secondTask();

        //Вызов метода для 3 задания
        thirdTask(10.1f, 3.3f, 5.4f, 15.9f);

        //Объявление переменных и вызов метода для 4 задания
        System.out.println("Введите первое целое число: ");
        int x1 = scanner.nextInt();

        System.out.println("Введите второе целое число: ");
        int x2 = scanner.nextInt();

        int x3 = (x1 + x2);
        boolean result = forthTask(x1, x2);
        System.out.println(result);
        ;

        //Вызов метода для 5 задания
        fifthTask();

        //Вызов метода для 6 задания
        System.out.println(sixthTask());

        //Вызов метода для 7 задания
        seventhTask();

    }

    public static Scanner scanner = new Scanner(System.in);

    //задание №2: Создать переменные всех пройденных типов данных и инициализировать их значения.
    public static void secondTask() {

        byte x1 = -5;
        System.out.println("x1 = " + x1);

        short x2 = 31789;
        System.out.println("x2 = " + x2);

        long x3 = -57687646;
        System.out.println("x3 = " + x3);

        int x4 = 10;
        System.out.println("x4 = " + x4);

        float x5 = 11.3f;
        System.out.println("x5 = " + x5);

        double x6 = -11.1;
        System.out.println("x6 = " + x6);

        char x7 = '\u1211';
        System.out.println("char = " + x7);

        boolean x8 = true;
        System.out.println("x8 = " + x8);

    }


    //задание №3: Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float thirdTask(float a, float b, float c, float d) {
        float res = (a * (b + (c / d)));
        System.out.println("res = " + res);
        return res;
    }

    //задание №4: Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean forthTask(int a, int b) {
        if ((a + b) < 10 || (a + b) > 20) {
            return false;
        } else {
            return true;
        }

    }

    //задание №5: Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void fifthTask() {
        int x;
        System.out.println("Введите целое число: ");
        x = scanner.nextByte();

        if (x >= 0) {
            System.out.println("Вы ввели положительное число");
        } else
            System.out.println("Вы ввели отрицательное число");
    }

    //задание №6: Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean sixthTask() {
        int y;
        System.out.println("Введите целое число: ");
        y = scanner.nextInt();

        boolean res;

        if (y >= 0) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }


    //задание №7: Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void seventhTask(){
        System.out.println("Введите имя: ");
        String name = scanner.next();
        System.out.println("Привет, " + name + "!");
    }

}


