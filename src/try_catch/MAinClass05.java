package try_catch;//예외전가

class TestClass05{
	public void test1() {
		System.out.println("test1");
		test2();
	}
	public void test2() {
		System.out.println("test2");
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}

public class MAinClass05 {
	public static void main(String[] args) {
		TestClass05 t = new TestClass05();
		t.test1();
		
		
		
	}
}
