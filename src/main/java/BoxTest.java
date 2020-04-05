import lesson_1.Fruits.Apple;
import lesson_1.Fruits.Orange;

public class BoxTest {
    public static void main(String[] args) {
        Apple a1 = new Apple();
        Apple a2 = new Apple();

        Box<Apple> appleBox = new Box<>();

        appleBox.putInBox(a1);
        appleBox.putInBox(a2);

        Box<Orange> orangeBox = new Box<>();

        System.out.println(appleBox.getWeight());
    }
}
