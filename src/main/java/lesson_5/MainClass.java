package lesson_5;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class MainClass {
    public static final int CARS_COUNT = 4;
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cdl = new CountDownLatch(CARS_COUNT + 1);
        Semaphore semaphore = new Semaphore(CARS_COUNT / 2);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ArrayList<Thread> threadArrayList = new ArrayList<>();
        Race race = new Race(new Road(60), new Tunnel(semaphore), new Road(80));
        Car[] cars = new Car[CARS_COUNT];

        

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), cdl, atomicInteger);
        }

        for (int i = 0; i < cars.length; i++) {
            new Thread (cars[i]).start();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                cdl.countDown();
                try {
                    cdl.await();
                    System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}

