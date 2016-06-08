package exercises6;

import java.util.*;

public class Table<K, V> {

  private ArrayList<Entry<K, V>> items = new ArrayList<>();

  public class Entry<K, V> {
    private K key;
    private V value;

    Entry(K key, V value) {
      this.key = key;
      this.value = value;
    }

    public K getKey() {
      return this.key;
    }

    public V getValue() {
      return this.value;
    }
  }

  public V get(K key) {
    return findValue(key);
  }

  private V findValue(K key) {
    Entry<K, V> wanted = findEntry(key);
    return (wanted != null) ? wanted.getValue() : null;
  }

  private Entry<K, V> findEntry(K key) {
    for (Entry<K, V> entry : items) {
      if (entry.getKey() == key)
        return entry;
    }
    return null;
  }

  public void put(K key, V value) {
    Entry<K, V> newEntry = new Table<K, V>.Entry<K, V>(key, value);
    items.add(newEntry);
  }

  public void remove(K key) {
    Entry<K, V> wanted = findEntry(key);
    items.remove(wanted);
  }
}
