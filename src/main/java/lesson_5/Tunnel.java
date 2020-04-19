package lesson_5;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class Tunnel extends Stage {
    Semaphore semaphore;

    public Tunnel(Semaphore semaphore) {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
        this.semaphore = semaphore;
    }
    @Override
    public void go(Car c, int currentLap, int allLaps, AtomicInteger atomicInteger) {
        try {
            try {

                semaphore.acquire();
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " закончил этап: " + description);
                semaphore.release();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
