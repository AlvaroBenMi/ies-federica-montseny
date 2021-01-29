import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el texto");
        String text = scan.nextLine();
        System.out.println("Introduzca la palabra a buscar");
        String word = scan.next();
        String[] words = text.split(" ");
        int occurrences = 0;
        for (String w : words) {
            if (w.equals(word)) {
                occurrences++;
            }
        }
        System.out.println(occurrences);
    }
}
