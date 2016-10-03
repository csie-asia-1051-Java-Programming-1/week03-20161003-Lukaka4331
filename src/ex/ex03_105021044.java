package ex;
import java.util.Scanner;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 105021044 鐘岑哲
 */

public class ex03_105021044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		char ch1=scn.next().charAt(0);
		int v1=ch1-32 ;
		if(v1>=0&&v1<26){
			System.out.println("大寫");

		}else{ {			System.out.println("小寫");

		}
		}
		
		
		
		
		
		
		
		
	}

}
