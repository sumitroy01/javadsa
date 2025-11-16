package HashMapss;
import java.util.*;

class ChainingHashTable {
    private int size = 10;
    private LinkedList<Entry>[] table;

    static class Entry {
        String key;
        int value;

        Entry(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public ChainingHashTable() {
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void put(String key, int value) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // update
                return;
            }
        }
        table[index].add(new Entry(key, value));
    }

    public Integer get(String key) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) return entry.value;
        }
        return null;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print("Bucket " + i + ": ");
            for (Entry e : table[i]) {
                System.out.print("[" + e.key + ", " + e.value + "] ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ChainingHashTable map = new ChainingHashTable();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("grape", 30);
        map.put("mango", 40); // collision likely
        map.display();
        System.out.println("Get 'apple': " + map.get("apple"));
    }
}
