import java.util.*;

public class RandomGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ramdomDmg = (int) (Math.random() * 100);
        int initialBossHealth = 100;
        int bossHealth = initialBossHealth - ramdomDmg;
        System.out.println("Would you like to attack the boss? (Type Yes)");
        String attack = sc.nextLine();

        if (attack.equalsIgnoreCase("Yes")) {
            System.out.println("You dealt " + ramdomDmg + " damage");
            System.out.println("The boss health now is " + bossHealth);

            while (bossHealth > 0) {
                System.out.println("Would you like to attack the boss again? (Type Yes)");
                String attack2 = sc.nextLine();

                if (attack2.equalsIgnoreCase("Yes")) {
                    int dmg = (int) (Math.random() * 100);
                    bossHealth -= dmg;
                    System.out.println("You dealt " + dmg + " damage");
                    System.out.println("The boss health now is " + bossHealth);
                } else {
                    System.out.println("Please type properly");
                }
            }
            System.out.println("You have defeated the boss!");
        } else {
            System.out.println("Please type properly");
        }
    }
}
