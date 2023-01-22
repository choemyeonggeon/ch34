package my.qwe;

import java.util.Scanner;

public class ch1 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
	System.out.println("a의 값을 입력하세요>");
	int a = scan.nextInt();
	System.out.println("b의 값을 입력하세요>");
	int b = scan.nextInt();
	
	if(b%a==0) {
		System.out.println(a+"*x="+b);
	}else if(a%b==0) {
		System.out.println(b+"*x="+a);
	}else {
		System.out.println("none");
	}
	
}

}




/*인터넷에서 퍼온 문제풀기
 * 두 자연수 a, b가 주어진다.
b가 a의 배수이면 "a*x=b"를 출력하고,
a가 b의 배수이면 "b*x=a"를 출력하고,
배수관계가 아니면 "none"을 출력하시오.
예) 
5 10    ====> 5*2=10
14 2   ======> 2*7=14
3 7 =====> none
입력
자연수 두 개가 입력된다.
출력
위의 문제 설명을 보고 배수 관계를 출력한다.
입력 예시 
4
12
출력 예시
4*3=12*/
 