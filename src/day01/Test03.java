package day01;

/**
 * 检查一个字符串是否为回文
 * 回文:正着念与反着念一样，例如:上海自来水来自海上
 *
 * @author Bonnie
 */
public class Test03 {
    public static void main(String[] args) {
        String str = "fsdsf";
        check(str);
    }
    /**
     * 判读该方法是否是回文
     *
     * @param str 需要判断的字符串
     * @return true表示是回文，false表示不是回文
     */
    public static boolean check(String str) {
        StringBuilder sb = new StringBuilder(str);
           StringBuilder sb1=sb.reverse();
       return str.equals(sb1.toString());
    }
}


