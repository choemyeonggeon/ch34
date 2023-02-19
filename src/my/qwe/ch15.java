package my.qwe;

import java.util.Scanner;

public class ch15 {
	
			
			public static void main(String[] args) {
				
				int arr[][] = new int[4][4];

				
				int cnt=0;
				while(cnt<10)
				{
					int y = (int)(Math.random()*4);
					int x = (int)(Math.random()*4);
					if(arr[y][x]==0)
					{
						arr[y][x] = (int)(Math.random()*10+1);
						cnt++;
					}
				}
				
				for(int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr[i].length;j++)
						System.out.print(arr[i][j]+" ");
					System.out.println();
				}
				
		
	}

}
/*[y][x]를 랜덤으로 생성 후 그 배열에 값이 없다면 1~10 랜덤 수를 넣고

cnt를 더해줍니다.

cnt가 10이 될때까지 반복합니다.

cnt가 10이라면 배열 arr에 10개의 랜덤 값이 들어간 겁니다.*/
