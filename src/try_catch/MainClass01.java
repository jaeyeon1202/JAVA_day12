package try_catch;

import java.util.Scanner;

/*
 예외
 - 프로그램 실행 중 문제가 있는 코드
 - 프로그래머 생각과 다르게 작동하는 코드
 예외종류
 - 강제예외: throw
 - 예외전가: throws
 - 예외처리: try, catch
 */
public class MainClass01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int x,y,result=0;
		while(true) {
			System.out.println("수 입력: ");
			x=input.nextInt();
			y=input.nextInt();
			try {
				result=x/y; //문제가 발생된 코드는 트라이 안쪽으로
				System.out.println("실행");
				break;
			} catch (ArithmeticException e) {//오류가 뜬 문구를 catch괄호에 넣어준다.
				System.out.println("어떤 값을 0으로 나눌 수 없습니다.");
			}

			System.out.println("결과: "+result);
		}

	}
}








































































