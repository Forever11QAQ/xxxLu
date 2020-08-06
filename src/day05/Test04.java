package day05;

import java.util.*;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        Scanner console=new Scanner(System.in);
        map.put(console.nextLine(), console.nextInt());
       map.get("物理");
       map.put("化学",96);
       map.remove("英语");
        Set<String> s=map.keySet();
        for(String key:s){
         Integer value=map.get(key);
         System.out.println(key+"="+value);
        }
       Set<Map.Entry<String,Integer>> set =map.entrySet();
          for(Map.Entry<String,Integer> en:set){
              String key=en.getKey();
              Integer value=en.getValue();
              System.out.println(key+"="+value);
        }
          Collection<Integer> se=map.values();
             for(Integer value:se){
            System.out.println(value);
        }

             }
    }

