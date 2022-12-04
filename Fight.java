import java.util.Scanner;

public class Fight {
    public static int NUM_PEOPLE = 25;
    public static  int NUM_AMMO= 150;
    public static  int MAX_ZOM,MIN_ZOM;
    public static  int hitChanceGun, instantKillGun ;
    public static  int instantKillObjectChance,hitChanceObject;
    public static  int zomHitChance;

    // select the game choices 1 to start and 2 to end
    public static void gameStart(){
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("Press 1 to start or 2 to end the Run ( for fun please put number other than 1 and 2): ");
            int response = input.nextInt();
            switch (response) {
                case 1:
                    gameMode();
                    return;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Invalid please input 1 to start the Program: ");

            }
        }

        }
// select 3 choices: 1 would start the game, 2 invalid print please retry and select 1 and 3 to end the program





    public static void gameMode() {
        System.out.println("Start the Simulation"); // rather than combine every single requirement in the assignment, it is better to have a set of # variable to play around with
        NUM_PEOPLE = 25; // professor at tutoring center show me this way is a lot easier to play around
        MIN_ZOM = 8; //
        MAX_ZOM = 10;
        hitChanceGun = 2;
        instantKillGun = 1;
        hitChanceObject  = 1;
        instantKillObjectChance = 1;
        zomHitChance = 2;
        // these are my instances variables, what it mean is that if i want to change a number of odd or amount of zombies min and max
        // it will use the "variable" to generates in the program
    }



    public static int generateRandomInRange(int min, int max){
        return min + (int)(Math.random()*((max - min)+1)); // this is the generating method that I will use in within the program
    }

    //this is generating random zombies
    public static int randomZombies(){
        int totalZombies = generateRandomInRange(MIN_ZOM, MAX_ZOM);
        return totalZombies;
    }

    // this is generating hitchancegun randomize
    public static boolean hitChanceGun(){
        boolean check = false;
        int hitChance = generateRandomInRange(1,hitChanceGun);
        if (hitChance == hitChanceGun){
            check = true;
        }return check;
    }

    // This is generating instantKill boolean
    public static boolean instantKill() {
        boolean check = false;
        int instantKillChance = generateRandomInRange(1, instantKillGun);
        if (instantKillChance == instantKillGun){
            check = true;
        }return check;
    }

    // this is melee hit chance, generated as a random in range
    public static boolean objectHitChance(){
        boolean scan = false;
        int objectHitChance = generateRandomInRange(1, hitChanceObject);
        if (objectHitChance == hitChanceObject) {
            scan = true;
        }return scan;
    }
    // creating an object instant kill object
    public static boolean instantKillObject(){
        boolean count = false;
        int instantKillObject = generateRandomInRange(1, instantKillObjectChance);
        if (instantKillObject == instantKillObjectChance){
            count = true;
            System.out.println("Kill zombies by melee");
        }return count;
    }

    // Zombies kill students randomize boolean
    public static boolean zomKilledPplChance() {
        boolean count = false;
        int zomKilledChance = generateRandomInRange(1,zomHitChance);
        if (zomKilledChance == zomHitChance) {
            count = true;
        }return count;
    }
}
