package my.qwe;

import java.util.Scanner;

public class ch22 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] nums = new int[1000];
			for(int i=0; i<n; i++) {
				nums[i] = sc.nextInt();
			}
			//nxn으로 출력
			for(int i=0; i<n; i++) {
				for(int j=i; j<n; j++) {
					System.out.print(nums[j]+" ");
				}
				for(int k=0; k<i; k++) {
					System.out.print(nums[k]+" ");
				}
				System.out.println();
			}
		}
	}
/*n개의 숫자가 입력되면,
n개의 숫자를 왼쪽으로 하나씩 돌려서 출력하시오.
예) 1 2 3 4 5가 입력된 경우,
1 2 3 4 5
2 3 4 5 1
3 4 5 1 2
4 5 1 2 3
5 1 2 3 4
입력
첫째 줄에 숫자의 개수 n이 입력된다.( 1 <= n <= 1,000)
둘째 줄에 n개의 정수 k가 차례로 구분되어 입력된다.(1 <= k <= 1,000)*/