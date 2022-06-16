public class U2 extends Rocket {

    //Default constructor
    U2(){

        cost = 120;          //In Millions
        cargoWeight = 0;
        maxCargo = 11000;

    }

    public boolean launch() {

        int random = (int) (Math.random() * 100) + 1;
        int moreChance = (cargoWeight / maxCargo);
        return (random > (4 * moreChance));

    }

    public boolean land() {

        int random = (int) (Math.random() * 100) + 1;
        int moreChance = (cargoWeight / maxCargo);
        return (random > (8 * moreChance));

    }

}
