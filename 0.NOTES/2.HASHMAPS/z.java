public class z<T extends Comparable<T>> {

    @SuppressWarnings("unchecked")
    public Entity<T>[] hashmap = new Entity[1000];  // Use raw type with a warning suppressed

    public class Entity<K extends Comparable<K>> {
        T key;
        T value;

        public Entity(T key, T value) {
            this.key = key;
            this.value = value;
        }
    }

    public z() {
        // Constructor already initializes hashmap
    }

    public void insert(T key, T value) {
        int index = Math.abs(key.hashCode()) % hashmap.length;
        hashmap[index] = new Entity(key, value);
    }

    public void display() {
        for (int i = 0; i < hashmap.length; i++) {
            if (hashmap[i] != null) {
                System.out.println("Index " + i + " -> Key: " + hashmap[i].key + ", Value: " + hashmap[i].value);
            }
        }
    }

    public static void main(String[] args) {
        z<String> map = new z<>();
        map.insert("apple", "fruit");
        map.insert("carrot", "vegetable");
        map.display();
    }
}
