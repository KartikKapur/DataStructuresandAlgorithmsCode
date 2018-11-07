package Chapter2;

/**
 * The Fellow class is used in Section 2.4
 * It along with the Professor class are used to show inheritance via extension
 */
public class Fellow {
    String name;

    public Fellow() {
        this.name = "I'm nameless";
    }

    public void breathe() {
        System.out.println("Breathing noise");
    }
}
