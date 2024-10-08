import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = 0;
        String word;
        String altword;
        int amountOfWords = 0;

        System.out.print("Choose a word: ");
        word = scan.next();
        amountOfWords += 1;
        scan.nextLine();

        while (score < 50) {
            System.out.print("Pick another word: ");
            altword = scan.next();
            scan.nextLine();

            if ((altword.compareTo(word)) > 0) {
                score += 2;
                System.out.println("+2 because word is after alphabetically");
            } else if ((altword.compareTo(word)) < 0) {
                score -= 5;
                System.out.println("-5 because word is before alphabetically");
            } else {
                score -= 10;
                System.out.println("-10 because word is same alphabetically");
            }
            
            if (word.substring((word.length() - 2)).equals(altword.substring(0, 2))) {
                score += 5;
                System.out.println("+5 because first 2 letters of word contains last 2 letters of comparison word");
            }

            if (altword.indexOf(word.substring(0, 1)) != -1) {
                score += 3;
                System.out.println("+3 because word contains first letter");
            }

            if (altword.length() == word.length()) {
                score += 1;
                System.out.println("+1 because word is same in length");
            }

            word = altword;
            amountOfWords += 1;

            System.out.println(score);
        }

        System.out.println("Used " + amountOfWords + " words. Try again to get a better score");

        scan.close();
    }
}

