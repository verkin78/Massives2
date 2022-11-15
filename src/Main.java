import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int amountPayments = 0;
        int[] arr = generateRandomArray();

        int minInc = arr[0];
        int maxInc = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(i + " " + arr[i]);
            amountPayments += arr[i];
            if (minInc > arr[i]) {
                minInc = arr[i];}
            else if (maxInc < arr[i]) {
                maxInc = arr[i];}

        }

        System.out.println("Сумма всех выплат за месяц: " + amountPayments);
        System.out.println("Минимальная сумма трат за день составила " + minInc + " рублей." +
                "Максимальная сумма трат за день составила " + maxInc + " рублей.");

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








