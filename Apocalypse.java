import java.util.Scanner;
public class Apocalypse {
    Person person = new Person(Fight.NUM_PEOPLE, Fight.NUM_AMMO);
    private int numAmmo = person.getNumAmmo();
    private int numPeople = person.getNumPeople();
    // Declaring instance variables
    private int daySurvived;
    private int numFood;
    private final int totalDays;
    String message;

    // Constructor
    public Apocalypse(int numFood, int totalDays) {
        this.numFood = numFood;
        this.totalDays = totalDays;
    }
    public void runSimulation() {
        System.out.println("Zombie Program CS1 ");
        System.out.println("Total Ammo: " + numAmmo);
        System.out.println("Total Students: " + numPeople);
        Fight.gameStart();
        daySurvived = 1;// Initialize the day
        while (numFood > 0 && numPeople > 0) {
            // Checking in case of the amount of food is less than the amount of people.
            if (numFood < numPeople){
                numPeople = numFood;
            }
            if (person.askingUser()) {             // request user to start the day
                feedAll();
                if (fightZombies()) {
                    System.out.println("Day ended, students still alive: " + numPeople);
                    System.out.println();
                    System.out.println("Congrats you have passed day: " + daySurvived);
                    daySurvived++;
                    if (daySurvived > totalDays) { // check for days and break
                        System.out.println();
                        System.out.printf("Simulation end students survived for " + totalDays + " days");
                        System.out.printf("Successful runs!!!");
                        break;
                    }
                } else {
                    System.out.println("Every Students dies this is the end of the simulation"); // print end simulation
                    break;
                }
                if (foodScan()){       // this is very important because it allows java to check for food scan with each day passes
                    break;
                }
            }
        } // Done the while loop
    }


    // Fighting method
    public boolean fightZombies() { // this is a local variable using boolean statement
        boolean peopleWin;
        int numZom = Fight.randomZombies();// generating randomize zombies given in the fight class
        peopleWin = gunAndBluntFight(numZom);
        System.out.println("Zombies generated in that days: " + numZom); // print
        return peopleWin;
    }


    public boolean gunAndBluntFight(int numZom){
        boolean peopleWin = true;
        int zomHitsStack = 0;
        int peopleDead = 0;
        while (numZom > 0){
            if (numAmmo > 0){   // Using gun to kill zom until out of ammo.
                if (Fight.hitChanceGun()){
                    person.useAmmo(); zomHitsStack++;
                    // Checking for instant kill chance or zom hit twice
                    if (Fight.instantKill() || zomHitsStack == 2){
                        numZom--;
                        zomHitsStack = 0;
                    }
                    else{
                        if (Fight.zomKilledPplChance()){
                            personDied(); peopleDead++;
                        }
                    }
                }else{
                    person.useAmmo();
                    if (Fight.zomKilledPplChance()){
                        personDied(); peopleDead++;
                    }
                }
            }
            if (numAmmo <= 0){ // Using blunt object to fight zombies
                if (Fight.objectHitChance()){
                    zomHitsStack++;
                    if (Fight.instantKillObject() || zomHitsStack == 2){
                        numZom--;
                        zomHitsStack = 0;
                    }else {
                        personDied(); peopleDead++;
                    }
                }
                personDied(); peopleDead++;
            }
            // check for people are alive or not
            if(checkAlive()){
                peopleWin = false;
                System.out.println("Every students dies " + numZom );
                break;
            }
        }
        Person.endGameStatus(numPeople,numFood, daySurvived,peopleDead,numAmmo); // problem with checking ammo, please help


        return peopleWin;
    }



    public boolean checkAlive(){  // this is how i am going to check for the number students that are still alive
        if (numPeople <= 0){
            numPeople = 0;
        }
        return numPeople == 0;
    }
    public void personDied(){ // if the number of students died decreases increment
        numPeople--;
        numAmmo = Fight.NUM_AMMO;
    }
    // Feeding method
    public void feedAll () {
        numFood = numFood - numPeople; // this math is essentially allowing everyone to eat the the same time by applying the numfood - people
    }
    //
    // Checking food for the next day after wining the fight with zombies.
    public boolean foodScan(){
        boolean foodAte = false;
        if (numFood == 0){
            foodAte = true;
            System.out.println("No more food game end.");
        }return foodAte;
    }


}
