import lesson_1.Fruits.Apple;
import lesson_1.Fruits.Orange;

public class BoxTest {
    public static void main(String[] args) {
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();
        Orange o1 = new Orange();
        Orange o2 = new Orange();

        Box<Apple> appleBox = new Box<>();
        Box<Apple> secondAppleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();


        appleBox.putInBox(a1);
        appleBox.putInBox(a2);
        secondAppleBox.putInBox(a3);
        orangeBox.putInBox(o1);
        orangeBox.putInBox(o2);

        System.out.println("Apple boxes weight: ");
        System.out.println(appleBox.getWeight());
        System.out.println(secondAppleBox.getWeight());
        System.out.println("Orange box weight: ");
        System.out.println(orangeBox.getWeight());

        System.out.println("Comparing first and second apple boxes: ");
        appleBox.compare(orangeBox);

        
        secondAppleBox.sprinkle(appleBox);

    }
}
