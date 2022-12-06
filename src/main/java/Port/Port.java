package Port;

import Port.dock.Dock;
import Port.dock.DockBanana;
import Port.dock.DockBread;
import Port.dock.DockClothes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;


public class Port {
    public static void main(String[] args) {
         ExecutorService es = Executors.newFixedThreadPool(5);
        Semaphore smpBread = new Semaphore(1);
        Semaphore smpBanana = new Semaphore(1);
        Semaphore smpClothes = new Semaphore(1);
        Dock dockBread = new DockBread(smpBread);
        Dock dockBanana = new DockBanana(smpBanana);
        Dock dockClothes = new DockClothes(smpClothes);
        for (int i = 0; i < 20; i++) {
            Ship ship  = ShipGenerator.createShip();
           switch (ship.getProduct()){
               case BREAD:
                   ship.setDock(dockBread);
                   break;
               case BANANA:
                   ship.setDock(dockBanana);
                   break;
               case CLOTHES:
                   ship.setDock(dockClothes);
                   break;
           }
           es.execute(ship);
        }
        es.shutdown();
    }
}
