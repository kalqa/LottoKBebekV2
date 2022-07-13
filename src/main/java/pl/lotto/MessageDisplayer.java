package pl.lotto;

public class MessageDisplayer {

    public static void displayStartMessages() {
        System.out.println("""
                Which game do you want to play? Choose an option below:
                1. Minilotto
                2. Exit""");
    }

    public static void displayYesNoQuestion() {
        System.out.println("Do you want play again? Yes/No");
    }

    public static void displayNumbers(String message) {
        System.out.println(message);
    }

    public static void displayUserScore(String message) {
        System.out.println(message);
    }
}
