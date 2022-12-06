package Port;

import Port.dock.Dock;
import java.util.concurrent.Semaphore;

public class Ship extends Thread{
        private int capacity;
        private Product product;
        Semaphore smp;
        private int shipId;
      private  Dock dock;
        public Ship(Product product, Capacity capacity, int id){
        this.product = product;
        this.capacity = capacity.getCapacity();
        this.shipId = id;
        }

    public Dock getDock() {
        return dock;
    }

    public int getShipId() {
        return shipId;
    }

    public void setDock(Dock dock) {
        this.dock = dock;
    }

    public int getCapacity() {
        return capacity;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public void run() {
        System.out.printf("Корабль-%d c %s грузоподъемностью %s подплыл к пристани\n",shipId, product,capacity);
        System.out.printf("Корабль-%d c %s грузоподъемностью %s запрашивает разрешение на разгрузку\n",shipId,
                product, capacity);
        dock.make(this);
        System.out.printf("Корабль-%d выходит из порта\n",shipId);
    }
}
