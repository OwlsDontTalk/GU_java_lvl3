import lesson_1.Fruits.Fruit;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> box = new ArrayList<T>();

    public void putInBox(T obj){
        box.add(obj);
    }

    public double getWeight(){
        double weight = box.size() * T.getWeight();
        return weight;
    }
}
