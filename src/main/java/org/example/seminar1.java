package seminar1;

import java.util.*;

public class seminar1 {
    public static void main(String[] args) {
        arraySubtracton(Objects.requireNonNull(arraySizeCompare()));
        arrayDivision(Objects.requireNonNull(arraySizeCompare()));
    }

    public static Random rand = new Random();

    public static int[] arrCreator(int arrSize, int maxVal) {
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = (rand.nextInt(maxVal));
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------------------------------");
        return arr;
    }

    public static int userInput(String msg) {
        Scanner sc = new Scanner(System.in);
        int inputStr;
        while (true) {
            System.out.print(msg);
            try {
                inputStr = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод! Введите целое число!");
            }
        }
        return inputStr;
    }

    public static ArrayList<int[]> arraySizeCompare() {
        int arrSize1 = userInput("\nВведите количество элементов первого массива: ");
        int[] arr1 = new int[arrSize1];
        int arrSize2 = userInput("\nВведите количество элементов второго массива: ");
        int[] arr2 = new int[arrSize2];
        if (arr1.length != arr2.length) {
            System.out.println("Ошибка! Размеры массивов отличаются! Введите одинаковые размеры массивов.");
            arraySizeCompare();
        } else {
            ArrayList<int[]> arrResult = new ArrayList<>();
            int arrMaxValue = userInput("\nВведите максимальное значение элементов массивов: \n");
            arrResult.add(arrCreator(arrSize1, arrMaxValue));
            arrResult.add(arrCreator(arrSize1, arrMaxValue));
            return arrResult;
        }
        return null;
    }

    public static void arraySubtracton(ArrayList<int[]> arrayList) {
        int[] arr1 = arrayList.get(0);
        int[] arr2 = arrayList.get(1);
        int[] arrResult = new int[arr1.length];
        System.out.print("Разница массивов: ");
        for (int i = 0; i < arr1.length; i++) {
            arrResult[i] = arr1[i] - arr2[i];
        }
        System.out.print(Arrays.toString(arrResult));
    }

    public static void arrayDivision(ArrayList<int[]> arrayList) {
        int[] arr1 = arrayList.get(0);
        int[] arr2 = arrayList.get(1);
        int[] arrResult = new int[arr1.length];
        try {
            for (int i = 0; i < arr1.length; i++) {
                arrResult[i] = arr1[i] / arr2[i];
            }
        } catch (RuntimeException e) {
            System.out.println("Делить на ноль нельзя! Введите новые данные");
            return;
        }
        System.out.println("\nЧастное массивов: ");
        System.out.print(Arrays.toString(arrResult));
        arrayList.clear();
    }

}


