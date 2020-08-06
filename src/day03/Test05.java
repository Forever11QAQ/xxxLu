package day03;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
        Scanner console=new Scanner(System.in);
           System.out.println("输入身份证号码:");String str=console.nextLine();
          if(str.length()==18){
             
              SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
              Date date =sdf.parse(str);
              Calendar calendar= Calendar.getInstance();
              calendar.setTime(date);
              calendar.add(Calendar.YEAR,20);
              calendar.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
              Date time1=calendar.getTime();
              SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
              String str1=sdf1.format(time1);
              System.out.println(str1);
          }
          else{
              System.out.println("格式有误，请重新输入!");
          }





    }


}
