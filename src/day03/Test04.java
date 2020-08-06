package day03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        System.out.println("输入一个生产日期:");
        String str=console.nextLine();
        System.out.println("输入一个保质期:");
        int i=console.nextInt();
         long time=24*60*60*1000;//计算一天的毫秒值
        String regex="^\\d{4}-\\d{1,2}-\\d{1,2}$";
        Date date=null;
        if(str.matches(regex)){
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            try {
                 date=sdf.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }
          long time2=(i-11)*time;
           long time1=date.getTime();
            long time3=time1+time2;
            DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
           String s=format.format(time3);
           System.out.println(s);
        }

    }
}
