package HashMapss;
class OpenAddressingHashTable {
    private int size = 10;
    private String[] keys = new String[size];
    private Integer[] values = new Integer[size];

    private int hash(String key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void put(String key, int value) {
        int index = hash(key);
        int startIndex = index;

        while (keys[index] != null && !keys[index].equals(key)) {
            index = (index + 1) % size;
            if (index == startIndex) {
                System.out.println("HashTable is full!");
                return;
            }
        }
        keys[index] = key;
        values[index] = value;
    }

    public Integer get(String key) {
        int index = hash(key);
        int startIndex = index;

        while (keys[index] != null) {
            if (keys[index].equals(key)) {
                return values[index];
            }
            index = (index + 1) % size;
            if (index == startIndex) break;
        }
        return null;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            if (keys[i] != null) {
                System.out.println("Index " + i + ": [" + keys[i] + ", " + values[i] + "]");
            } else {
                System.out.println("Index " + i + ": empty");
            }
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        OpenAddressingHashTable map = new OpenAddressingHashTable();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("grape", 30);
        map.put("mango", 40); // may cause collision
        map.display();
        System.out.println("Get 'banana': " + map.get("banana"));
    }
}
