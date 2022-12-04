import java.util.Scanner;

public class Person {
    private int numPeople;
    private int numAmmo;


    // Constructor for person class
    public Person(int numPeople, int numAmmo){
        this.numPeople = numPeople;
        this.numAmmo = numAmmo;
    }
    public int getNumPeople() {
        return numPeople;
    }

    public void useAmmo(){
        numAmmo--;
    }

    public int getNumAmmo() {
        return numAmmo;
    }

    public void setNumAmmo(int numAmmo) {
        this.numAmmo = numAmmo;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    public static boolean askingUser() { // asking the user to start the day
        Scanner input = new Scanner(System.in);
        boolean scan = false;
        System.out.print("Press 1 to start the day:  ");
        if (input.nextInt() == 1) {
            scan = true;
        }
        return scan;
    }

    // this is for displaying the end Game status of everything from food, students, days Survive, and ammo
    public static void endGameStatus(int numPeople, int numFood, int daySurvived, int peopleDead, int numAmmo) {
        System.out.println();
        System.out.println("Day: "+ daySurvived);
        System.out.println();
        System.out.println("Everyone are full" );
        System.out.println();
        System.out.println("Students that died: " + peopleDead);
        System.out.println();
        System.out.println("Food left: " + numFood);
        System.out.println();

    }

}
