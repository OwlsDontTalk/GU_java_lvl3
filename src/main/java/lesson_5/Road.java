package lesson_5;

import java.util.concurrent.atomic.AtomicInteger;

public class Road extends Stage {
    public Road(int length) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
    }
    @Override
    public void go(Car c, int currentLap, int allLaps, AtomicInteger atomicInteger) {
        try {
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
            System.out.println(c.getName() + " закончил этап: " + description);
            if(currentLap == allLaps){
                    System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Участник #" + atomicInteger.incrementAndGet() + " пришел в финишу");
                }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
