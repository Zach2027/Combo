import java.util.Scanner; // Import the Scanner class

public class Combo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jab = 0;
        int cross = 0;
        int slip = 0;
        int kick = 0;
        int power = 0;

        System.out.println("A guy walks up to you and thows a punch, what would you like to do?");
        System.out.println("1. Jab");
        System.out.println("2. Cross");
        System.out.println("3. Slip");

        String firstChoice = scanner.nextLine();
        if (firstChoice.equals("1")) {
            System.out.println("You counter with a jab stunning your opponent");
            jab += 1;
        }
        if (firstChoice.equals("3")) {
            System.out.println("You slip the punch giving you next shot more power");
            slip += 2;
        } else {
            System.out.print("you were too slow and got hit in the head decressing future power");
            slip -= 0.5;
        }

        System.out.println("for your next attack to finish you oppenent, you can ");
        System.out.println("1. Jab");
        System.out.println("2. Cross");
        System.out.println("3. Kick");

        String secondChoice = scanner.nextLine();
        if (secondChoice.equals("1")) {
            jab += 1;
            System.out.println("you jab was not enough to Ko, you must Strike again");
            System.out.println("1. Jab");
            System.out.println("2. Cross");
            String secondChoiceB = scanner.nextLine();
            if (secondChoiceB.equals("1")) {
                System.out.println("You land another jab knocking out you oponent in a clean manner");
                jab++;
            } else {
                System.out.println("You throw a amazing cross slumping you oponent");
                cross++;
            }
        }

        if (secondChoice.equals("2")) {
            cross++;
            System.out.print("You throw a great cross Knocking out you opponent");
        } else {
            System.out.print("You throw a great Kick puting you opponent to sleep");
            kick++;
        }
        if (jab > 1) {
            boolean comboOne = true;
        }
        if (jab > 2) {
            boolean comboTwo = true;
        }
        if (slip > 0 || jab > 0 || cross > 0) {
            boolean comboThree = true;
        }

        double score = 0;
        score = ((3 * kick) + (2 * cross) + (jab)) * slip;

    }
}