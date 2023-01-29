package my.qwe;

import java.util.ArrayList;
import java.util.Scanner;

public class ch10 {

	public static void main(String[] args) {
		//		자연수 N이 주어지면 N의 약수를 오름차순으로 모두 출력하시오.
		//		입력
		//		자연수 N이 입력된다.( 1 <= N <= 10,000 )
		//		출력
		//		N의 약수를 오름차순으로 출력한다.
		//		입력 예시 
		//		6
		//		출력 예시
		//		1 2 3 6
		Scanner sc = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		System.out.print("약수를 구할 숫자를 입력하세요>");
		int num = sc.nextInt();
		for(int i = 1; i<30; i++) {
			if(num%i==0) {
				System.out.print(", "+i);
			}
		}
	}

}
