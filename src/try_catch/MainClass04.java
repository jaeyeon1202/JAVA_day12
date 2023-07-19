package try_catch;

import java.util.Scanner;

class TestClass04{
	public void test() {
		Scanner input = new Scanner(System.in);
		int n1=10, n2=5;
		try {
			System.out.println(n1/n2);
			return;
		} catch (Exception e) {
			System.out.println("문제발생");
		}finally {//무조건 실행되는 코드
			System.out.println("finally 실행");
			input.close();
		}
		System.out.println("다음 문장 실행");
	}
}//class

public class MainClass04 {
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
		t.test();
	}
}
