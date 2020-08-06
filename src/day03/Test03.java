package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner console=new Scanner(System.in);
        String str=console.nextLine();
        String a="^\\d{4}-\\d{2}-\\d{2}$";
        if(str.matches(a)){
       String str1="yyyy-MM-dd";
        SimpleDateFormat sdf=new SimpleDateFormat(str1);
        Date date=sdf.parse(str);
        Date now=new Date();
        long time1=now.getTime();
        Date date2=new Date();
        long time2=date.getTime();
        long time3=time1-time2;
        long week=time3/1000/60/60/7;
        System.out.println(week);
        }
    }
}
