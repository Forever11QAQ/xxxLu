package day01;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public String createCode(){
		String code = "";
		Random random = new Random();
		for(int i=0;i<5;i++){
			code+=random.nextInt(2)==0?(char)('A'+random.nextInt(26)):(char)('a'+random.nextInt(26));
		}
		return code;
	}
	public static void main(String[] args) {
      //  String c= c;

		Scanner console=new Scanner(System.in);
       String a=console.nextLine();
      // if(a.equalsIgnoreCase(c)){
       	System.out.println("有效");

	   }
       //else{
		   //System.out.println("无效");
	   }
	//}
	
//}
