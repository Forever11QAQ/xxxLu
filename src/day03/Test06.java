package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        int a=c.size();
        System.out.println(a);
        boolean b=c.contains("four");
        System.out.println(b);
        boolean b1=c.isEmpty();
        System.out.println(b1);
        c.clear();
        int d=c.size();
        System.out.println(d);
        boolean b2=c.isEmpty();
        System.out.println(b2);
    }
}
