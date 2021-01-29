import java.util.Scanner;

public class SplitWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text  = scan.nextLine();

        String[] words = text.split(" ");

        for(String word: words) {
            System.out.println(word);
        }
    }
}
