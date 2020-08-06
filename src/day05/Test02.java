package day05;

import java.util.Iterator;

/**
 * 创建一个栈，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test02 {
    private  Integer data[];
    private int size;
    public Test02(Integer cap){

        data= new Integer[cap];
    }
  public void push(Integer a){
        data[size++]=a;
  }
   public  int pop(){
      Integer a = data[size -1];
        size--;
        return a;
    }
    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public static void main(String[] args) {
        Test02 s=new Test02(5);
        while (!s.isFull()){
               s.push(1);
               s.push(2);
               s.push(3);
               s.push(4);
               s.push(5);
        }
    }

}
