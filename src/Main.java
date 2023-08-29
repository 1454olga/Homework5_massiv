import java.sql.Array;
import java.util.Arrays;

public class Main {
    private static int[] weight = new int[]{1, 2, 3};
    private static double[] drobi = new double[]{1.57, 7.654, 9.986};
    private static int[] massa = {80, 78, 77, 75, 74, 73, 73, 72, 0, 0, 0, 0};

    public static void main(String[] args) {
        task2();
        task3();
        task4();
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 0; i < weight.length; i++) {
            if (i != weight.length - 1) {
                System.out.print(weight[i] + ", ");
            } else {
                System.out.print(weight[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < drobi.length; i++) {
            if (i != drobi.length - 1) {
                System.out.print(drobi[i] + ", ");
            } else {
                System.out.print(drobi[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < massa.length; i++) {
            if (i != massa.length - 1) {
                System.out.print(massa[i] + ", ");
            } else {
                System.out.print(massa[i]);
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = weight.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(weight[i] + ", ");
            } else {
                System.out.print(weight[i]);
            }
        }
        System.out.println();
        for (int i = drobi.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(drobi[i] + ", ");
            } else {
                System.out.print(drobi[i]);
            }
        }
        System.out.println();
        for (int i = massa.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(massa[i] + ", ");
            } else {
                System.out.print(massa[i]);
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) weight[i]++;
        }
        System.out.println(Arrays.toString(weight));
    }
}
