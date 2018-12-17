package dcone.com;

/**
 * Description:
 * <p>
 * Copyright: Copyright (c) 2018/12/15 下午12:41
 * <p>
 * Company: 京东
 * <p>
 *
 * @author houqianglin@jd.com
 */
public class MyHashMap {

    final ListNode[] nodes = new ListNode[10000];

    public MyHashMap() {

    }


    public void put(int key, int value) {
        int index = index(key);
        if(nodes[index]==null){
            nodes[index]=new ListNode(-1,-1);
        }
        ListNode pre=find(nodes[index],key);
        if(pre.next==null){
            pre.next=new ListNode(key,value);
        }
        else {
            pre.next.value=value;
        }
    }

    public void remove(int key) {

    }

    public int get(int key) {
        int index = index(key);
        if(nodes[index]==null){
            return -1;
        }
        ListNode pre=find(nodes[index],key);
        return pre.next==null?-1:pre.next.value;
    }

    int index(int key) {
        return key % nodes.length;
    }
    ListNode find(ListNode bucket,int key){
        ListNode current=bucket,pre=null;
        while (current!=null&&current.key!=key){
            pre=current;
            current=current.next;
        }
        return pre;
    }
}

class ListNode {
    int key, value;
    ListNode next;

    public ListNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
