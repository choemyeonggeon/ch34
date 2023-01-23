package my.qwe;

import java.util.Scanner;

public class ch3 {

	public static void main(String[] args) {
	/*	두 실수 a, b가 입력되면 그 두수를 더하거나 빼거나 곱하거나 나누거나 제곱을 해서 가장 큰 수를 출력하시오.
		예를 들어 1과 2가 입력되면,
		1+2 = 3   , 2+1 = 3
		1 - 2 = -1,   2 - 1 = 1
		1 * 2 = 2,    2 * 1 = 2
		1 / 2 = 0.5,   2 / 1 = 2
		12=1 ,   21 = 2
		따라서 최댓값은 3이다.
		입력
		실수 a, b가 입력된다. ( a와 b의 계산결과는 모두 int범위 이내이고, 계산이 불가능한 경우는 입력되지 않는다.)
		출력
		최댓값을 실수로 출력한다.(%lf)
		입력 예시 
		1
		2
		출력 예시
		3.000000*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 값을 입력하세요>");
		int a = sc.nextInt();
		System.out.print("b의 값을 입력하세요>");
		int b = sc.nextInt();
		double[] num = new double [4];
		double max = 0.0;
		num[0] = a+b;
		num[1] = a-b;
		num[2] = a*b;
		num[3] = a/b;
		
		for(int i = 0; i<num.length; i++) {
			if(max<num[i]) {
				max=num[i];
			}
		}
		
		System.out.println("최대값은  : "+(int)max);
	}

}
