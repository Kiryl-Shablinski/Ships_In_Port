package Port;

public enum Capacity {
    SMAL(10),
    MIDLE(50),
    BIG (100);

    private  int capacity;

    Capacity(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
