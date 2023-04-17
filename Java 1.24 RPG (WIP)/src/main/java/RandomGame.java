import java.util.*;
public class RandomGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ramdomDmg = (int) (Math.random()*100);
        
        int initialBossHealth = 100;
        int secondBossHealth = initialBossHealth - ramdomDmg;
        System.out.println("Would you like to attack the boss? (Type Yes)");
        String attack = sc.nextLine(); 
            if (attack.equals("Yes")){
                System.out.println("You dealt " + ramdomDmg + " damage");
                System.out.println("The boss health now is "+ secondBossHealth );
                
                int nextBossHealth = secondBossHealth - ramdomDmg;
                while(nextBossHealth > 0){
                System.out.println("Would you like to attack the boss again? (Type Yes)");
                String attack2 = sc.nextLine();
                
                System.out.println("You dealt " + ramdomDmg + " damage");
                System.out.println("The boss health now is "+ nextBossHealth );
                }
                
            }
            else {
                System.out.println("Please type properly");
            }
        
        
        
    }
}
