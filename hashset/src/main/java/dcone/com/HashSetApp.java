package dcone.com;

/**
 * Description:
 * <p>
 * Copyright: Copyright (c) 2018/12/14 下午6:16
 * <p>
 * Company: 京东
 * <p>
 *
 * @author houqianglin@jd.com
 */
public class HashSetApp {
    public static void main(String[] args) {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
//        hashSet.add(2);
        hashSet.add(1001);
       System.out.println( hashSet.contains(1));    // returns true
        hashSet.contains(3);    // returns false (not found)
        hashSet.add(2);
        hashSet.contains(2);    // returns true
        hashSet.remove(2);
        hashSet.contains(2);    // returns false (already removed)
    }
}
