package Chapter2;
/**
 * The DictionaryItem class is used in Section 2.5
 * It is used to provide an example of Generics.
 */
public class DictionaryItem<K, V> {
    K key;
    V value;

    public DictionaryItem(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static void main(String[] args) {
        DictionaryItem<String, String> webster = new DictionaryItem<String, String>("Kartik", "Kapur");
        DictionaryItem<Character, Integer> numberDict = new DictionaryItem<Character, Integer>('a', 1);
    }
}
