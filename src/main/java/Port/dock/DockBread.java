package Port.dock;

import java.util.concurrent.Semaphore;

public class DockBread extends Dock {
    public DockBread(Semaphore smp){
        super.smp = smp;
    }
}
