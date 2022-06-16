public class Rocket implements SpaceShip {

    int cost;
    int cargoWeight;
    int maxCargo;
    
    public boolean launch() {
        
        return true;
        
    }

    public boolean land() {
        
        return true;
        
    }
    
    public boolean canCarry(Item randomItem){ return (cargoWeight + randomItem.cargoWeight) <= maxCargo; }
    
    public void carry(Item randomItem) {
        
        cargoWeight += randomItem.cargoWeight;
        
    }
    
    public int getCost() {
        
        return cost;
        
    }
    
}
