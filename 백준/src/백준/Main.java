package 백준;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); // 카드갯수
		int B = sc.nextInt();  // 블랙잭 (넘지않고 제일 근접한 숫자)
		int C = sc.nextInt(); // 3개 수의 합
		int D = sc.nextInt(); // 제일 가까운 수 저장
		
		int[] num = new int[A]; // 카드갯수를 담는 객체배열
		
		for(int i = 0; i < A; i ++) { //입력받은 A의 갯수만큼 반복하면서
			num[i] = sc.nextInt(); // 입력한 숫자를 num의 i번째 배열에 저장
		}
		
		for(int i = 0; i < num.length; i++) {  // 1번쨰 카드 반복
			for(int j = 0; j < num.length; j++) { //2번째 카드 반복
				for(int m = 0; m < num.length; m++) { //3번째 카드 반복
					C = (i+j+m);
					if(C <= B ) {
						D = C;
					}
					System.out.println(D);
				}
			}
		}
		
		
		
		

		
	}

}
