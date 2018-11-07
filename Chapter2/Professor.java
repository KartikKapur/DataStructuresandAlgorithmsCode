package Chapter2;
/**
 * The Professor class is used in Section 2.4
 * It along with the Fellow class are used to show inheritance via extension
 */
public class Professor extends Fellow {
    public Professor() {
    }

    public void teach() {
        System.out.println("I taught");
    }

    public static void main(String[] args) {
        Fellow josh = new Professor();
        System.out.println(josh.name);
        josh.breathe();
        /*josh.teach(); This line errors out on purpose because josh's static type is a Fellow
        and Fellow's do not have a teach method.
         */
    }
}
