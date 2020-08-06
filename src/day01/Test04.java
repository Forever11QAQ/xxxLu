package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */
public class Test04 {
	public static void main(String[] args) {
		String str1="";//初始化
		Scanner console=new Scanner(System.in);
		String str=console.nextLine();
		for(int i=0;i<str.length();i++){
			if(str.indexOf("@")!=-1){
			    str1=str.substring(0,str.indexOf("@"));
            }
		}
        System.out.println(str1);
	}
}
