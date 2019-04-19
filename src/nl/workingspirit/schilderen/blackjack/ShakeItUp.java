package nl.workingspirit.schilderen.blackjack;

public class ShakeItUp {

    public static void main(String[] args) {

        int[] numbers = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233};
        prettyPrint(numbers);
        shuffle(numbers);
        prettyPrint(numbers);
    }

    public static int[] shuffle(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int random = (int) (Math.random() * numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[random];
            numbers[random] = temp;
        }
        return numbers;
    }

    public static void prettyPrint(int[] numbers) {
        System.out.print(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            System.out.print(", " + numbers[i]);
        }
        System.out.println();

    }
}
