package my.qwe;

public class ch17 {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("3의 배수 ");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}	
		}
		for (int j = 1; j <= 100; j++) {
			if(j%3 ==0) {
				sum += j;
			}
		}
		System.out.println("1~100까지 중 3의 배수의 합 = " + sum);

	}

}
