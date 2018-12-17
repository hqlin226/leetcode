package dcone.com;

/**
 * Description:
 * <p>
 * Copyright: Copyright (c) 2018/12/15 下午1:42
 * <p>
 * Company: 京东
 * <p>
 *
 * @author houqianglin@jd.com
 */
public class MyHashMapApp {
    public static void main(String[] args) {

        System.out.println(123^124);
        MyHashMap myHashMap=new MyHashMap();
//        MyHashMapLee myHashMap=new MyHashMapLee();
        myHashMap.put(1,1001);
        myHashMap.put(2,1002);
        myHashMap.put(1,1005);
        myHashMap.put(10001,10005);
        System.out.println(myHashMap.get(1));
        System.out.println(myHashMap.get(2));
        System.out.println(myHashMap.get(10001));


    }
}
