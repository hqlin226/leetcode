package dcone.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Description:
 * <p>
 * Copyright: Copyright (c) 2018/12/15 下午3:20
 * <p>
 * Company: 京东
 * <p>
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 *
 * @author houqianglin@jd.com
 * <p>
 * Input: 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class HappyNumber {
    public static void main(String[] args) {
//        System.out.println(isHappy(19));


        System.out.println(isomorphic("egg","ddd"));


    }

    public static int digitSquareSum(int n) {
        int sum = 0, tmp;
        while (n>0) {
            tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        } while (slow != fast);
        if (slow == 1) {
            return true;
        } else {
            return false;
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int index=0;
        for(int num:nums){
            map.put(num,index);
            index++;
        }

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0]=i;
                result[1]=map.get(target-nums[i]);
            }
        }


        return result;

    }

    public static boolean isomorphic(String s1,String s2){

        Map<Character,Character> map=new HashMap<Character, Character>();
        if(s1.length()!=s2.length()){ return false;}
        Set<Character> set=new HashSet<Character>();
        for(int i=0;i<s1.length();i++){

            char sc1=s1.charAt(i),sc2=s2.charAt(i);
            //将sc1作为key，sc2作为value
            /**
             * 如果sc1已经建立了映射，则检查映射与当前字符是否相等。
             */
            if(map.containsKey(sc1)){
                if(sc2!=map.get(sc1)){return false;}
            }else {
                /**
                 * 如果已经给s2中的字符建立了映射，则不能重复映射。如egg->ddd。
                 */
                if(set.contains(sc2)){return false;}
                set.add(sc2);
                map.put(sc1,sc2);
            }


        }



        return true;
    }

}
