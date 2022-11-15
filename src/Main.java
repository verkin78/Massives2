import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int incom = 0;
        int[] arr = generateRandomArray();

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(i + " " + arr[i]);
            incom += arr[i];
        }

        System.out.println("Сумма всех выплат за месяц: " + incom);
    }

    public static int[] generateRandomArray() {

        Random random = new Random();
        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
