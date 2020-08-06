package day02;
/**
 * 将字符串123,456,789,012根据","拆分，并输出拆分后的每一项
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
         String str="123,456,789,012";
         String str1=str.substring(0,3);
         String str2=str.substring(4,7);
         String str3=str.substring(8,11);
         String str4=str.substring(12,15);
       System.out.println(str1);
       System.out.println(str2);
       System.out.println(str3);
       System.out.println(str4);
    }

}
