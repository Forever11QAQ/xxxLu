package day02;

import java.util.ArrayList;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) {
                  String str="张三,25,男,5000;李四,26,女,6000";
                  String [] ss=str.split(";");
                  for(String s:ss){
                      String [] str1=s.split(",");
                      Person person=new Person();
                      person.setName(str1[0]);
                      person.setAge(Integer.valueOf(str1[1]));
                      person.getGender(str1[2]);
                      person.setSalary(Integer.valueOf(str1[3]));
                      System.out.println(person);
                  }
    }
}


