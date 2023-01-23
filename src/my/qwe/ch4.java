package my.qwe;

import java.util.Scanner;

public class ch4 {
	/*재호는 이번 시험에 받은 성적이 궁금했다.
	점수가 입력되면 등급을 출력하시오.
	등급)
	90점 이상 : A
	80점 이상 : B
	70점 이상 : C
	60점 이상 : D
	60점 미만 : F
	입력
	점수가 정수로 입력된다. (입력되는 정수는 0~100이다)
	출력
	점수에 따라 등급을 출력한다.
	입력 예시 
	80
	출력 예시
	B
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요>");
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else if(score<60) {
			System.out.println("F");
		}
	}
	 

}
