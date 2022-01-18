package BankApp;

public class Atm {
    public static void displayInitialPrompt() {
        String prompt = """
                Welcome to Diamond (Access)
                Wetin you wan do sef?
                Press 1 to create account
                Press 2 to exit
                """;
    }

    public static void main(String[] args) {
        displayInitialPrompt();
    }


}

//System.exit(status 0); --- to exit a loop instead of break;
//todo --- reminds you of things to do even while commented out
//Scanner.nextLine(); to flush out previous input stream the scanner is holding