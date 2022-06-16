import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Simulation {
    
    ArrayList<Item>loadItems(String nameOfFile) throws Exception{
        
        File list = new File(nameOfFile);
        Scanner fileScanner = new Scanner(list);
        ArrayList<Item> endList = new ArrayList<>();

        while (fileScanner.hasNextLine()){
            
            Item temporaryItem = new Item();
            String[] subLine;

            String line = fileScanner.nextLine();
            subLine = line.split("=");

            temporaryItem.name = subLine[0];
            temporaryItem.cargoWeight = Integer.parseInt(subLine[1]);

            endList.add(temporaryItem);
            
        }
        
        return endList;
        
    }
    
    ArrayList<Rocket>loadU1(ArrayList<Item> itemsToLoad) {
        
        ArrayList<Rocket> loadU1 = new ArrayList<>();
        U1 currentU1 = new U1();

        while (!itemsToLoad.isEmpty()){
            
            if (currentU1.canCarry(itemsToLoad.get(0))){
                
                currentU1.carry(itemsToLoad.get(0));
                
            } else {
                
                loadU1.add(currentU1);
                currentU1 = new U1();
                currentU1.carry(itemsToLoad.get(0));
                
            }

            itemsToLoad.remove(0);
            
        }
        
        return loadU1;
        
    }

    ArrayList<Rocket>loadU2(ArrayList<Item> itemsToLoad) {

        ArrayList<Rocket> loadU2 = new ArrayList<>();
        U2 currentU2 = new U2();

        while (!itemsToLoad.isEmpty()){

            if (currentU2.canCarry(itemsToLoad.get(0))){

                currentU2.carry(itemsToLoad.get(0));

            } else {

                loadU2.add(currentU2);
                currentU2 = new U2();
                currentU2.carry(itemsToLoad.get(0));

            }

            itemsToLoad.remove(0);

        }

        return loadU2;

    }

    int runSimulation(ArrayList<Rocket>rockets){

        int totalCost = 0;

        for (Rocket currentRocket : rockets) {

            totalCost += currentRocket.getCost();

            while (!currentRocket.launch() || !currentRocket.land()) {

                totalCost += currentRocket.getCost();

            }

        }

        return totalCost;

    }

}
