import java.util.Random;

public class Program1 {
    public static void main(String[]args) {
        String[] words = {"ne", "two", "three", "four", "five", "six", "seven", "eight","nine", "ten"};
        //pick a random index
        Random r = new Random();
        int x = r.nextInt(words.length); //x picks the index(the word)

        System.out.println(words[x]);

    }
}
