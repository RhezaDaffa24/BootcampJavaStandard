package RandomClass;

import java.util.Random;

public class MainRandom {
    public static void main(String[] args) {
        Random random = new Random();
        // Jumlah random number
        for (int i = 0; i < 150; i++) {
            // Batasan isi angka random numbernya
            var value = random.nextInt(10000);
            System.out.println("Hasil ke: " + i + " = " + value);
        }
        System.out.println("\n");

        for (int j = 0; j < 50; j++) {
            var test = random.nextDouble();
            System.out.println("Hasil ke: " + j + " = " + test);
        }
    }
}
