package my.qwe;

public class ch18 {

	public static void main(String[] args) {
	int count = 1;
	for(int i = 1; i<=100; i++ ) {
		if(i%3==0) {
			System.out.println(count + "번쨰 3의 배수 " + i);
			count += 1;
		}
	}
	}

}
