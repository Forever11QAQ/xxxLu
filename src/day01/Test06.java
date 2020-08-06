package day01;

import java.util.Scanner;

/**
 * 要求用户输入一个计算表达式，可以使用加减乘除。
 * 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
 * 例如:
 * 1+2
 * 然后经过处理计算结果并输出:1+2=3
 * @author Bonnie
 *
 */
public class Test06 {
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		String str=console.nextLine();
		parseInt(str);
	}
	public static int parseInt(String str){
		// 最后要生成的数字
		int num = 0;
		// 临时变量，用于计算对应位数的数字
		int flag = 0;
		for (int i = 0; i < str.length(); i++) {
			flag = (str.charAt(i) - 48);
			flag= (int) Math.pow((double)flag,(double)str.charAt(i+1));
			for (int n = 0; n < str.length() - 1 - i; n++) {
				flag *= 10;
			}
			num += flag;
		}
		return num;
	}
}








