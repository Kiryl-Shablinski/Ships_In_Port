package Port.dock;

import java.util.concurrent.Semaphore;

public class DockClothes extends Dock{

    public DockClothes(Semaphore smp) {
        super.smp = smp;
    }
}
