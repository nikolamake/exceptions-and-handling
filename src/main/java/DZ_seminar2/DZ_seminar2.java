package DZ_seminar2;

import java.io.FileNotFoundException;
import java.util.*;

public class DZ_seminar2 {
    public static void main(String[] args) {
        //System.out.println(floatInput("\nВведите число: "));
        //nullException("\nВведите символы: ");
        //ex2();
    }
    public static float floatInput(String msg) {
        Scanner sc = new Scanner(System.in);
        float inputNum;
        while (true) {
            System.out.print(msg);
            try {
                inputNum = Float.parseFloat(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод! Введите число!");
            }
        }
        return inputNum;
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

    public static void nullException(String msg) {
        Scanner sc = new Scanner(System.in);
        String inputStr;
        while (true) {
            System.out.print(msg);
            try {
                inputStr = sc.nextLine();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
        if (inputStr.isEmpty()) {
            System.out.print("Строка не может быть пустой. Введите символы:");
            nullException(" ");
        }
        System.out.println(inputStr);
    }
    public static void ex2() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

}