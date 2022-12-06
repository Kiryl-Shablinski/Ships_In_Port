package Port;

import java.util.Random;

public class ShipGenerator {

    private static int countShip = 0;

    public static Ship createShip(){

        int productValue = new Random().nextInt(3);
        int capacityValue = new Random().nextInt(3);
        Product[] products = Product.values();
        Capacity[] capacities = Capacity.values();
        countShip++;
        return  new Ship(products[productValue],capacities[capacityValue], countShip);
    }

    public static int getCountShip() {
        return countShip;
    }

}
