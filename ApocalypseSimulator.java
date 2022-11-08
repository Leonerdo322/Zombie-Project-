// creating a main class that runs the program, nothing will be in this main class 

public class ApocalypseSimulator{
  public static void main(String[] args){
    Apocalypse apocalypse = new Apocalypse(150,10); // creating an instance variables for the numbers of days for the simulation
    apocalypse.runSimulation(); // take from apocalypse class and method runSimulation
  }
}
