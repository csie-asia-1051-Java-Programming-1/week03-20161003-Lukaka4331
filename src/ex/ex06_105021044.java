package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入x，並計算y值輸出，其公式如下：
 * y = 3*x2				若 x < -1
 * y = x3+3*x-3			若 -1 <= x <= 1
 * y = 2*x+3			若 x > 1
 * Date: 2016/10/03
 * Author: 105021044 鐘岑哲
 */

public class ex06_105021044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("x=");

		int x=scn.nextInt();
if(x<-1){
	float y=3*x*x;		System.out.println(y);

}else{float y=x*x*x+3*(x-3);
	if(-1 <= x&&x <= 1){	System.out.println(y);
		
	}else{ y=2*x+3;if(x>1){
		System.out.println(y);
	}
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
