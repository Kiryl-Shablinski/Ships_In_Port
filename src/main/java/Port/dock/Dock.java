package Port.dock;

import Port.Ship;

import java.util.concurrent.Semaphore;

public abstract class Dock {
   protected Semaphore smp;
   public  void make(Ship ship)  {
       int timeWork = ship.getCapacity() * 100;
        try {
            smp.acquire();
            System.out.printf("Корабль-%d с %s грузоподъемностью %s разгружается\n",ship.getShipId(), ship.getProduct(), ship.getCapacity());
            Thread.sleep(timeWork);
            System.out.printf("Корабль-%d %s грузоподъемностью %s разгружен\n",ship.getShipId(), ship.getProduct(), ship.getCapacity());
            smp.release();
        }catch (InterruptedException o){
            o.printStackTrace();
        }

    }
}

