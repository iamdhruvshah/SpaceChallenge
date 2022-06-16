public class Item {

    String name;
    int cargoWeight;

    void Item(String currentName, int currentcargoWeight) {

        this.name = currentName;
        this.cargoWeight = currentcargoWeight;

    }

    public String getName() {

        return name;

    }

    public int getcargoWeight() {

        return cargoWeight;

    }

}
