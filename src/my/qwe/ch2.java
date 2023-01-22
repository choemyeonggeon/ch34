package my.qwe;


import java.util.Scanner;

public class ch2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("윷을 입력하세요>");
		String score = sc.nextLine();
		
		if(score.equals("도")) {
			System.out.println("0  0  1  0");
		}else if(score.equals("개")) {
			System.out.println("0  1  1  0");
		}else if(score.equals("걸")) {
			System.out.println("1  1  1  0");
		}else if(score.equals("윷")) {
			System.out.println("1  1  1  1");
		}else {
			System.out.println("0  0  1  0");
		}
	}

}



/*입력으로 윷의 4가지 상태가 들어온다.
윷의 상태는 0이면 뒤집어지지 않은 상태, 1이면 뒤집어진 상태를 말한다.
도 : 1개가 뒤집어진 상태 
개 : 2개가 뒤집어진 상태 
걸 : 3개가 뒤집어진 상태 
윷 : 4개가 뒤집어진 상태 
모 : 하나도 뒤집어지지 않은 상태 
윷 각각의 상태를 보고 도, 개, 걸, 윷, 모를 출력하시오.
 입력
윷의 각각 상태가 입력으로 주어진다.
(0: 뒤집어지지 않은 상태, 1: 뒤집어진 상태)
출력
도, 개, 걸, 윷, 모 중 하나를 출력한다.
입력 예시 
0
0
1
0
출력 예시
도
*/