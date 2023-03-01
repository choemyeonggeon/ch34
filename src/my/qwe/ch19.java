package my.qwe;

import java.util.Scanner;

public class ch19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요:");
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if( c >= 'a' && c <= 'z') { //영소문자
				System.out.print( (char)(c - 32) );
			}else if( c >= 'A' && c <= 'Z') {//영대문자
				System.out.print( (char)(c + 32) );
			}else { //숫자나 특수문자임.
				System.out.print(c);
			}
			
		}
	}

}
/*주어지는 문장의 대문자를 소문자로, 소문자를 대문자로 변경하는 프로그램을 작성하라.
입력
한 줄의 공백없는 문장이 입력된다.(최대 길이:1000)
출력
대소문자를 서로 변환한 결과를 출력한다.*/
