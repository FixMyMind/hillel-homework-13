import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static final int NUMBER_OF_LOTTERY_NUMBERS = 7;

    public static void main(String[] args) {
        int numberOfWins = 0;
        Random randomValue = new Random();
        int[] arrayWinNumbers = new int[NUMBER_OF_LOTTERY_NUMBERS];
        int[] arrayPlayerNumbers = new int[NUMBER_OF_LOTTERY_NUMBERS];
        for (int i = 0; i < NUMBER_OF_LOTTERY_NUMBERS; i++) {
            arrayWinNumbers[i] = randomValue.nextInt(10);
            arrayPlayerNumbers[i] = randomValue.nextInt(10);
        }
        Arrays.sort(arrayWinNumbers);
        Arrays.sort(arrayPlayerNumbers);
        for (int i = 0; i < arrayWinNumbers.length; i++) {
            if (arrayWinNumbers[i] == arrayPlayerNumbers[i]) {
                numberOfWins += 1;
            }
        }
        System.out.println(Arrays.toString(arrayWinNumbers));
        System.out.println(Arrays.toString(arrayPlayerNumbers));
        System.out.println("Кількість збігів: " + numberOfWins);
    }
}
