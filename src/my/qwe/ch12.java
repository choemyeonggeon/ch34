package my.qwe;

import java.util.Scanner;

public class ch12 {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			System.out.println("1.월요일 | 2.화요일 | 3.수요일 | 4.목요일 | 5.금요일 | 6.토요일 | 7.일요일");
			System.out.print("오늘의 요일을 입력해 주세요>");
			int day = sc.nextInt();
			switch(day) {
			case 1:
			case 3:
			case 5:
			case 7:
				System.out.println("오늘은 알바가는 날~");
				System.out.println("Oh! my god!");
				break;
			case 2:
			case 4:
			case 6:
				System.out.println("오늘은 쉬는날~");
				System.out.println("Enjoy~~~~!!");
				break;
			}
	/*	주원이는 월, 수, 금, 일 아르바이트를 간다.
		다음은 요일의 순서이다.
		월요일
		화요일
		수요일
		목요일
		금요일
		토요일
		일요일
		요일의 번호가 입력으로 주어지면 그 날이 아르바이트 가는 날이면 "oh my god"를 가는 날이 아니면 "enjoy"를 출력하시오.
		입력
		입력으로 요일의 번호가 하나 주어진다.(정수)
		출력
		아르바이트 가는 날이면 "oh my god"를 가는 날이 아니면 "enjoy"를 출력하시오.
		입력 예시 
		1
		출력 예시
		oh my god*/
	}

}
