package src.devseniorcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void startGame() {
        // List of words to guess
        var words = List.of("programming", "java", "computer", "keyboard", "screen", "internet", "development",
                "software", "hardware", "algorithm", "variable", "function", "class", "object", "inheritance",
                "polymorphism", "interface", "compiler", "debugging", "syntax");
        var scanner = new Scanner(System.in);
        var random = new Random();

        var playAgain = false;
        do {
            var word = words.get(random.nextInt(words.size())).toUpperCase();

            // Start the game
            playGame(word, scanner);

            System.out.print("Would you like to play again? (Y/n): ");
            var option = scanner.nextLine();
            playAgain = !option.equalsIgnoreCase("N");
        } while (playAgain);
        System.out.println("See you later!");
        scanner.close();
    }

    private static void playGame(String word, Scanner scanner) {
        // List of tried letters
        var guessed = new ArrayList<Character>();
        // List of letters in the word
        var letters = new ArrayList<Character>(word.length());
        for (int i = 0; i < word.length(); i++) {
            letters.add('_');
        }

        var errors = 0;
        var endGame = false;
        while (!endGame) {
            // Display the screen
            showScreen(letters, guessed, errors);

            // Ask the user for a letter
            System.out.print("Enter a new letter: ");
            var letter = scanner.nextLine().toUpperCase().charAt(0);

            if (!Character.isLetter(letter)) {
                System.out.println("This letter is not valid.");
                scanner.nextLine();
                continue;
            }
            if (guessed.contains(letter)) {
                System.out.println("This letter has already been entered.");
                scanner.nextLine();
                continue;
            }
            // Check the letter in the word
            if (word.indexOf(letter) != -1) {
                // If it exists, add the letter to the guessed string
                guessed.add(letter);

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == letter) {
                        letters.set(i, letter);
                    }
                }
            } else {
                System.out.println("Sorry, this letter is not in the word");
                guessed.add(letter);
                // Increase the errors
                errors++;
            }

            // Check if they have already lost
            if (errors == 6) {
                // End the game
                showScreen(letters, guessed, errors);
                System.out.println("You lost!");
                endGame = true;
            }

            // Check if they have already won, there are no more _ in the letters
            if (!letters.contains('_')) {
                // End the game
                showScreen(letters, guessed, errors);
                System.out.println("You won!");
                endGame = true;
            }
        }
    }

    private static void showScreen(List<Character> letters, List<Character> guessed, int errors) {
        System.out.print("Word to guess: ");
        for (var letter : letters) {
            System.out.printf("%c ", letter);
        }
        System.out.println();

        System.out.print("Attempted letters: ");
        for (var letter : guessed) {
            System.out.printf("%c ", letter);
        }
        System.out.println();

        // The gallows according to the number of errors
        var draw = switch (errors) {
            case 6 -> """
                +------+
                |      |
                |      O
                |     \\|/
                |      |
                |     / \\
                |
             +--+--+
             |     |
             """;
            case 5 -> """
                +------+
                |      |
                |      O
                |     \\|/
                |      |
                |     /
                |
             +--+--+
             |     |
             """;
            case 4 -> """
                +------+
                |      |
                |      O
                |     \\|/
                |      |
                |
                |
             +--+--+
             |     |
             """;
            case 3 -> """
                +------+
                |      |
                |      O
                |     \\|
                |      |
                |
                |
             +--+--+
             |     |
             """;
            case 2 -> """
                +------+
                |      |
                |      O
                |      |
                |      |
                |
                |
             +--+--+
             |     |
             """;
            case 1 -> """
                +------+
                |      |
                |      O
                |
                |
                |
                |
             +--+--+
             |     |
             """;
            default -> """
                       +------+
                       |      |
                       |
                       |
                       |
                       |
                       |
                    +--+--+
                    |     |
                    """;
        };
        System.out.println(draw);

    }

}
