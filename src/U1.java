public class U1 extends Rocket {

    //Default constructor
    U1(){

        cost = 100;          //In Millions
        cargoWeight = 0;
        maxCargo = 8000;

    }

    public boolean launch() {

        int random = (int) (Math.random() * 100) + 1;
        int moreChance = (cargoWeight / maxCargo);
        return (random > (5 * moreChance));

    }

    public boolean land() {

        int random = (int) (Math.random() * 100) + 1;
        int moreChance = (cargoWeight / maxCargo);
        return (random > (1 * moreChance));
        
    }

}
