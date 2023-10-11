import java.util.Random;

public class Roulette {
    public static void main(String[] args) {
        // Create a random number generator
        Random random = new Random();

        // Generate a random number in the range 0-36
        int number = random.nextInt(37);

        // Print the number
        System.out.println("The ball landed on: " + number);
    }
}
