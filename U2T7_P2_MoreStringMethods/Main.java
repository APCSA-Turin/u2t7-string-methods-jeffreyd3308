import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = 0;
        String word;
        String altword;

        System.out.print("Choose a word: ");
        word = scan.next();
        scan.nextLine();

        while (score < 50) {
            System.out.print("Pick another word: ");
            altword = scan.next();
            scan.nextLine();

            if ((altword.compareTo(word)) > 0) {
                score += 2;
            } else if ((altword.compareTo(word)) < 0) {
                score -= 5;
            } else {
                score -= 10;
            }
            
            if (word.substring((word.length() - 2)).equals(altword.substring(0, 2))) {
                score += 5;
            }

            if (altword.indexOf(word.substring(0, 1)) != -1) {
                score += 3;
            }

            if (altword.length() == word.length()) {
                score += 1;
            }

            word = altword;

            System.out.println(score);
        }

        scan.close();
    }
}
