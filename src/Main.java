import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws Exception {

        Simulation sim = new Simulation();

        ArrayList<Item> ItemsOfPhase1 = null;
        try {

            ItemsOfPhase1 = sim.loadItems("Phase-1.txt");

        } catch (FileNotFoundException e) {

            System.out.println("File Not Found!");
            System.exit(1);

        }

        ArrayList<Item> ItemsOfPhase2 = null;
        try {

            ItemsOfPhase2 = sim.loadItems("Phase-2.txt");

        } catch (FileNotFoundException e) {

            System.out.println("File Not Found!");
            System.exit(1);

        }

        ArrayList<Item> ItemsOfPhase3 = null;
        try {

            ItemsOfPhase3 = sim.loadItems("Phase-1.txt");

        } catch (FileNotFoundException e) {

            System.out.println("File Not Found!");
            System.exit(1);

        }

        ArrayList<Item> ItemsOfPhase4 = null;
        try {

            ItemsOfPhase4 = sim.loadItems("Phase-2.txt");

        } catch (FileNotFoundException e) {

            System.out.println("File Not Found!");
            System.exit(1);

        }

        //Loading U1 rockets.
        ArrayList<Rocket> loadedRockets1 = sim.loadU1(ItemsOfPhase1);
        ArrayList<Rocket> loadedRockets2 = sim.loadU1(ItemsOfPhase2);

        //Run simulation for U1.
        int cost1 = sim.runSimulation(loadedRockets1);
        int cost2 = sim.runSimulation(loadedRockets2);

        //Printing results for U1.
        System.out.println("Total cost using U1 Rocket: ");
        System.out.println("Phase-1 - " + cost1);
        System.out.println("Phase-2 - " + cost2);


        //Loading U2 rockets.
        ArrayList<Rocket> loadedRockets3 = sim.loadU2(ItemsOfPhase3);
        ArrayList<Rocket> loadedRockets4 = sim.loadU2(ItemsOfPhase4);

        //Run simulation for U2.
        int cost3 = sim.runSimulation(loadedRockets3);
        int cost4 = sim.runSimulation(loadedRockets4);

        //Printing results for U2.
        System.out.println("");
        System.out.println("Total cost using U2 Rocket: ");
        System.out.println("Phase-1 - " + cost3);
        System.out.println("Phase-2 - " + cost4);

    }
}