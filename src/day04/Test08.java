package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        Scanner console=new Scanner(System.in);
        Date date=null;
        for(int i=0;i<3;i++){
            String str=console.nextLine();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            date= sdf.parse(str);
        }
        List<Date> list=new ArrayList();
        list.add(date);
        Collections.sort(list);
        System.out.println(list);
    }

}
