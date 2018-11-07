package Midterm1;

/**
 * Created by kartikkapur on 6/22/17.
 */
public class NutellaJar extends Container {
    int sweetness;

    public NutellaJar() {
        System.out.println("I'm so hungry");
        this.sweetness = 100;
    }

    public NutellaJar(int size, boolean lid, String name, int sweetness) {
        super(size, lid, name);
        System.out.println("oink");
        this.sweetness = sweetness;
    }

    public void taste() {
        System.out.println("Just one more scoop");
    }

    public void taste(int scoops) {
        System.out.println("I just ate " + scoops + " scoops. yum");
    }

    public void close() {
        System.out.println("This is too hard!");
    }

    public static void main(String[] args) {
        Container plainjar = new Container();
        plainjar.close();
        Container tasty = new NutellaJar();
        //tasty.taste(); Compilation Error
        tasty.close();
        //NutellaJar scrumptious = new Container(); Compilation Error
        //NutellaJar nutty = (NutellaJar) plainjar; Runtime Error
        NutellaJar n = new NutellaJar(5, true, "sweet thang", 10);
        // scrumptious.close(); Compilation Error
        // nutty.close(); Runtime Error
        ((NutellaJar)tasty).taste(10);
        // nutty.taste(); Runtime Error
    }
}
