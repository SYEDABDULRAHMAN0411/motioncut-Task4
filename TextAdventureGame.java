import java.util.Scanner;

public class TextAdventureGame {

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a mysterious land. Your choices will determine your fate.");

        // Begin the story
        exploreForest();
    }

    public static void exploreForest() {
        System.out.println("\nYou are in a dense forest. You come across a crossroad.");
        System.out.println("1. Take the left path.");
        System.out.println("2. Take the right path.");

        int userChoice = getUserInput(2);

        if (userChoice == 1) {
            // Left path
            System.out.println("\nYou find a magical portal. Do you want to enter?");
            System.out.println("1. Enter the portal.");
            System.out.println("2. Stay in the forest.");

            userChoice = getUserInput(2);

            if (userChoice == 1) {
                System.out.println("\nCongratulations! You've entered a new realm!");
                // Continue the story
                enterMagicalRealm();
            } else {
                System.out.println("\nYou decide to stay in the forest. The adventure continues...");
                // Continue the story
                continueForestAdventure();
            }

        } else {
            // Right path
            System.out.println("\nYou encounter a ferocious dragon. What do you want to do?");
            System.out.println("1. Attempt to fight the dragon.");
            System.out.println("2. Try to sneak past the dragon.");

            userChoice = getUserInput(2);

            if (userChoice == 1) {
                System.out.println("\nUnfortunately, the dragon is too powerful. You are defeated.");
                // Game over or restart
                gameOver();
            } else {
                System.out.println("\nYou successfully sneak past the dragon. The adventure continues...");
                // Continue the story
                continueDragonAdventure();
            }
        }
    }

    public static void enterMagicalRealm() {
        System.out.println("\nWelcome to the Magical Realm! You encounter a friendly wizard.");
        System.out.println("1. Ask the wizard for guidance.");
        System.out.println("2. Explore the realm on your own.");

        int userChoice = getUserInput(2);

        if (userChoice == 1) {
            System.out.println("\nThe wizard provides you with a magical map. Where would you like to go?");
            System.out.println("1. Enchanted Castle.");
            System.out.println("2. Mystic Forest.");

            userChoice = getUserInput(2);

            if (userChoice == 1) {
                System.out.println("\nYou arrive at the Enchanted Castle. A new adventure awaits!");
                // Continue the story
                enterEnchantedCastle();
            } else {
                System.out.println("\nYou venture into the Mystic Forest. Beware of magical creatures!");
                // Continue the story
                continueMysticForestAdventure();
            }
        } else {
            System.out.println("\nYou decide to explore the realm on your own. The adventure continues...");
            // Continue the story
            continueMagicalRealmAdventure();
        }
    }

    public static void enterEnchantedCastle() {
        System.out.println("\nYou enter the Enchanted Castle and encounter a talking statue.");
        System.out.println("1. Listen to the statue's story.");
        System.out.println("2. Ignore the statue and explore further.");

        int userChoice = getUserInput(2);

        if (userChoice == 1) {
            System.out.println("\nThe statue shares ancient wisdom and grants you a special ability!");
            // Continue the story
            gainSpecialAbility();
        } else {
            System.out.println("\nYou decide to explore the castle further. The adventure continues...");
            // Continue the story
            continueCastleAdventure();
        }
    }

    public static void gainSpecialAbility() {
        System.out.println("\nYou've gained a special ability: Invisibility!");
        System.out.println("With this newfound power, you can choose a new path.");
        System.out.println("1. Infiltrate the Dark Cavern.");
        System.out.println("2. Return to the crossroad.");

        int userChoice = getUserInput(2);

        if (userChoice == 1) {
            System.out.println("\nYou use your invisibility to infiltrate the Dark Cavern.");
            // Continue the story
            infiltrateDarkCavern();
        } else {
            System.out.println("\nYou decide to return to the crossroad. The adventure continues...");
            // Continue the story
            exploreForest();
        }
    }

    public static void infiltrateDarkCavern() {
        System.out.println("\nYou find yourself in a pitch-black cavern. What do you want to do?");
        System.out.println("1. Light a torch to illuminate the cavern.");
        System.out.println("2. Navigate through the darkness without a torch.");

        int userChoice = getUserInput(2);

        if (userChoice == 1) {
            System.out.println("\nThe light reveals hidden treasures in the Dark Cavern!");
            // Continue the story
            discoverTreasures();
        } else {
            System.out.println("\nNavigating in darkness proves challenging. You stumble upon a trap!");
            // Game over or restart
            gameOver();
        }
    }

    public static void discoverTreasures() {
        System.out.println("\nCongratulations! You've discovered valuable treasures in the Dark Cavern!");
        System.out.println("You are hailed as a hero. Thank you for playing!");
        // You can add an option to restart the game if desired.
    }

    // Add more methods for other locations/events and continue the story...

    public static void continueForestAdventure() {
        // Add more story for the forest path
    }

    public static void continueDragonAdventure() {
        // Add more story for the dragon path
    }

    public static void continueMysticForestAdventure() {
        // Add more story for the Mystic Forest path
    }

    public static void continueMagicalRealmAdventure() {
        // Add more story for the Magical Realm
    }

    public static void continueCastleAdventure() {
        // Add more story for the Enchanted Castle
    }

    public static void gameOver() {
        System.out.println("\nGame Over. Thank you for playing!");
        // You can add an option to restart the game if desired.
    }

    public static int getUserInput(int maxChoice) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice < 1 || choice > maxChoice) {
            try {
                System.out.print("Enter your choice (1-" + maxChoice + "): ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > maxChoice) {
                    System.out.println("Invalid input. Please enter a valid choice.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        return choice;
    }
}
