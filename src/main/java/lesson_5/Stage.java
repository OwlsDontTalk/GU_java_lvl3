package lesson_5;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Stage {
    protected int length;
    protected String description;
    public String getDescription() {
        return description;
    }
    public abstract void go(Car c, int currentLap, int allLaps, AtomicInteger atomicInteger);
}
