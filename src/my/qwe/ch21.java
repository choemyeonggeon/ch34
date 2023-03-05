package my.qwe;

import java.util.Scanner;

public class ch21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 길이를 입력하세요>");
		int size = sc.nextInt();

		for(int i = 1; i<=size; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}