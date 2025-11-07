public class CustomHashMap<K, V> {

    // Node class representing each key-value pair
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 1000;
    private Node<K, V>[] buckets;

    // Constructor
    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        buckets = (Node<K, V>[]) new Node[SIZE]; // Generic array workaround
    }

    // Hash function
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    // Insert or update key-value
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        Node<K, V> head = buckets[index];

        // Update if key exists
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Insert at head of list
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    // Get value by key
    public V get(K key) {
        int index = getBucketIndex(key);
        Node<K, V> head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    // Remove key from map
    public void remove(K key) {
        int index = getBucketIndex(key);
        Node<K, V> head = buckets[index];
        Node<K, V> prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    // Display all key-value pairs
    public void display() {
        for (int i = 0; i < SIZE; i++) {
            Node<K, V> head = buckets[i];
            while (head != null) {
                System.out.println("Key: " + head.key + ", Value: " + head.value);
                head = head.next;
            }
        }
    }

    // Test the custom hashmap
    public static void main(String[] args) {
        CustomHashMap<String, String> map = new CustomHashMap<>();
        map.put("apple", "fruit");
        map.put("carrot", "vegetable");
        map.put("banana", "fruit");
        map.put("apple", "red fruit"); // overwrite test

        System.out.println("Get apple: " + map.get("apple")); // red fruit

        map.remove("carrot");

        System.out.println("After removing 'carrot':");
        map.display();
    }
}
