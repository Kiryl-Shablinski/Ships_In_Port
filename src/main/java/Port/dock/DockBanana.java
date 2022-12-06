package Port.dock;

import java.util.concurrent.Semaphore;

public class DockBanana extends Dock{
    public DockBanana(Semaphore smp) {
        super.smp = smp;
    }

}
