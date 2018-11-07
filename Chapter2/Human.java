package Chapter2;
/**
 * The Human class is Section 2.1 and 2.2
 * Used to show basic classes and objects and static typing
 * vs dynamic typing
 */
public class Human {
    public int weight;
    public static int joy = 100;

    public Human(int mass) {
        weight = mass;
    }

    public void eat() {
        weight += 5;
        System.out.println("I love eating");
    }

    public static void play() {
        System.out.println("I have" + joy + "happiness ");
    }

    public static void main(String[] args) {
        Human.play();
        Human kartik = new Human(5);
        kartik.eat();
        kartik.play();
    }
}
