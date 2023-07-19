package try_catch;

import java.util.Scanner;

public class Problem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("인증프로그램 입니다.");
		
		while(true) {
			System.out.println("90년생 이상은 '가입불가'");
			System.out.println("89년생 이하는 '가입가능'");
			System.out.println("A,ㅁ,ㅋ 문자는 잘못입력");
			System.out.println("주민번호 입력(앞6자리): ");
			int num = input.nextInt();
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}
