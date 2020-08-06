package day05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 创建一个队列，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        Iterator<Integer> it =l.iterator();
        while(it.hasNext()){
          Integer a=it.next();
          System.out.println(a);
          it.remove();
        }
    }

}
