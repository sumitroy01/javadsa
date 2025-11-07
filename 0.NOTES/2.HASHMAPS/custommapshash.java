class custommapshash<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.7;

    private Entry<K, V>[] table;
    private int size;

    static class Entry<K, V> {
        K key;
        V value;
        boolean isDeleted;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.isDeleted = false;
        }
    }

    public custommapshash() {
        table = new Entry[DEFAULT_CAPACITY];
        size = 0;
    }

    private int hash(K key, int capacity) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        if (size >= LOAD_FACTOR * table.length) {
            resize();
        }

        int index = hash(key, table.length);

        while (table[index] != null && !table[index].isDeleted && !table[index].key.equals(key)) {
            index = (index + 1) % table.length; // Linear probing
        }

        if (table[index] == null || table[index].isDeleted) {
            size++;
        }

        table[index] = new Entry<>(key, value);
    }

    public V get(K key) {
        int index = hash(key, table.length);

        while (table[index] != null) {
            if (!table[index].isDeleted && table[index].key.equals(key)) {
                return table[index].value;
            }
            index = (index + 1) % table.length;
        }

        return null;
    }

    public void remove(K key) {
        int index = hash(key, table.length);

        while (table[index] != null) {
            if (!table[index].isDeleted && table[index].key.equals(key)) {
                table[index].isDeleted = true;
                size--;
                return;
            }
            index = (index + 1) % table.length;
        }
    }

    private void resize() {
        Entry<K, V>[] oldTable = table;
        table = new Entry[2 * oldTable.length];
        size = 0;

        for (Entry<K, V> entry : oldTable) {
            if (entry != null && !entry.isDeleted) {
                put(entry.key, entry.value);
            }
        }
    }

    public int size() {
        return size;
    }
    public static void main(String[] args) {
       custommapshash <String, Integer> map = new custommapshash<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map.get("two"));    // Output: 2
        map.remove("two");
        System.out.println(map.get("two"));    // Output: null

        map.put("four", 4);
        System.out.println(map.size());        // Output: 3
    }
}

