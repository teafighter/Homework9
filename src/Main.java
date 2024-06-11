public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() { // сумма всех выплат за месяц
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int daily : arr) {
            sum = sum + daily;
        }
        System.out.println(sum);

    }

    public static void task2() { // максимальная и минимальная выплата за день
        int[] arr = generateRandomArray();
        int minimumDaily = 200_000;
        int maximumDaily = 100_000;
        for (int daily:arr) {
            if (daily < minimumDaily) {
                minimumDaily = daily;
            }
        }
        for (int daily:arr) {
            if (daily > maximumDaily) {
                maximumDaily = daily;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimumDaily + " рублей. " +
                "Максимальная сумма трат за день составила " + maximumDaily + " рублей");
    }

    public static void task3() { // средняя выплата за день
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int daily : arr) {
            sum = sum + daily;
        }
        double averageDaily = sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила  %.2f рублей%n", averageDaily);
    }

    public static void task4() { //
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = temp;
        }
        for (char c : reverseFullName) {
            System.out.print(c);
        }
    }
}