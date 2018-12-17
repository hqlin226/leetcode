package dcone.com;

/**
 * Description:
 * <p>
 * Copyright: Copyright (c) 2018/12/14 下午6:15
 * <p>
 * Company: 京东
 * <p>
 *
 * @author houqianglin@jd.com
 */
public class MyHashSet {
    private int buckets = 1000;
    private int itemsPerBucket = 1001;
    private boolean[][] table;

    /** Initialize your data structure here. */
    public MyHashSet() {
        table = new boolean[buckets][];
    }

    public int hash(int key) {
        int num =key % buckets;
        return key % buckets;
    }

    public int pos(int key) {
        int num=key / buckets;
        return key / buckets;
    }

    public void add(int key) {
        int hashkey = hash(key);

        if (table[hashkey] == null) {
            table[hashkey] = new boolean[itemsPerBucket];
        }
        table[hashkey][pos(key)] = true;
    }

    public void remove(int key) {
        int hashkey = hash(key);

        if (table[hashkey] != null)
            table[hashkey][pos(key)] = false;
    }

    /** Returns true if this set did not already contain the specified element */
    public boolean contains(int key) {
        int hashkey = hash(key);
        return table[hashkey] != null && table[hashkey][pos(key)];
    }
}
